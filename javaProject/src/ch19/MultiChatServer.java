package ch19;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ServerScreen extends JFrame {
	JTextArea ta;
	JTextField tf;
	
	public ServerScreen() {
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("채팅방 서버!");
		JLabel label=new JLabel("This is a server!");
		add(label,BorderLayout.NORTH);
		setVisible(true);
	}
}


public class MultiChatServer {
	HashMap userMap;
	
	public MultiChatServer() {
		userMap=new HashMap<>();
		Collections.synchronizedMap(userMap);
	}
	public static void main(String[] args) {
		new ServerScreen(); //화면만 띄움
		new MultiChatServer().serviceStart(); //서비스 개시 용도
	}
	public void serviceStart() {
		ServerSocket serverSocket=null;
		Socket socket=null;
		try {
			serverSocket=new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다.");
			while(true) {
				socket=serverSocket.accept(); 
				//접속대기상태로 있다가 요청이 들어오면 회선 하나 만들어 통신 확인한다
				System.out.println("["+socket.getInetAddress()+"]"+"에서 접속하셨습니다.");
				//다대일 채팅이라 socket.getInetAddress()로 작성
				//클라이언트별로 메시지 수신을 위한 스레드 생성
				//10명이 접속하면 10개의 스레드가 생성된다(스레드 많아질수록 속도는 약간 느려짐)
				ServerReceiver receiveThread=new ServerReceiver(socket);
				receiveThread.start();
				System.out.println("현재 실행중인 스레드 name : "+receiveThread.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} //end serviceStart()
	
	//현재 접속 중인 모든 사용자에게 메시지를 전송
	void sendToAll(String msg) {
		//일괄 전송
		Iterator it=userMap.keySet().iterator();
		while(it.hasNext()) {
			try {
				//메시지 전송을 위한 출력스트림 생성
				DataOutputStream out=(DataOutputStream)userMap.get(it.next());
				out.writeUTF(msg); //메시지 전송
			} catch (Exception e) {
				e.printStackTrace();
			}
		} //end while
	} //end sendToAll()
	
	//메시지 수신관련 내부클래스로 작성
	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		public ServerReceiver(Socket socket) {
			this.socket=socket;
			try {
				//데이터 통신을 위한 입출력 스트림 생성
				in=new DataInputStream(socket.getInputStream());
				out=new DataOutputStream(socket.getOutputStream());
			} catch (Exception e) {
				System.out.println("ServerReceiver 소켓 IO 에러");
			}
		}
		
		@Override
		public void run() {
			String name="";
			try {
				name=in.readUTF(); //메시지 수신해준다
				sendToAll("#"+name+"님이 들어오셨습니다."); //메시지 보내기
				userMap.put(name, out); //HashMap에서 사용자 추가해준다
				System.out.println("현재 접속자 수는 "+userMap.size()+"입니다.");
				while(in != null) {
					//받은 메시지를 모든 사용자에게 보낸다
					sendToAll(in.readUTF());
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				//대화방을 나간 사용자의 정보 출력
				sendToAll("#"+name+"님이 나가셨습니다.");
				userMap.remove(name); //HashMap에서 제거
				System.out.println("["+socket.getInetAddress()+":"+socket.getPort()
				+"] 에서 접속을 종료함");
				System.out.println("현재 접속자 수는 "+userMap.size()+"입니다.");
			}
		}
	} //MultiChatServer
}
