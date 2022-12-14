package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoClient {
	private String str;
	private BufferedReader file;
	private static int SERVERPORT=3000; //서버측 포트번호 셋팅
	
	public UDPEchoClient(String ip, int port) {
		try {
			InetAddress ia=InetAddress.getByName(ip);
			DatagramSocket ds=new DatagramSocket(port);
			System.out.println("서버측에서 보내는 message : ");
			file=new BufferedReader(new InputStreamReader(System.in));
			str=file.readLine();
			
			//스트림.getBytes() : (스트림 ==> 바이트배열)
			//new String(바이트배열) : (바이트배열 ==> 스트림)
			byte buffer[]=str.getBytes(); 
			//스트림을 바이트배열로 변환(UDP통신에서는 바이트배열로 전송해야 한다)
			DatagramPacket dp=new DatagramPacket(buffer,buffer.length,ia,SERVERPORT);
			ds.send(dp); //소켓을 사용해서 패킷을 서버에 전송
			
			buffer=new byte[512]; //버퍼의 크기값 설정
			dp=new DatagramPacket(buffer, buffer.length);
			ds.receive(dp); //서버에서 보낸 메시지를 수신한다
			ds.close(); //소켓 연결 닫기
			System.out.println("serer ip : "+dp.getAddress()+", server port : "
					+dp.getPort());
			System.out.println("서버에서 보낸 메시지 : "+new String(dp.getData()).trim());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new UDPEchoClient("localhost",2000); //(클라이언트,ip,포트번호)
		//단방향 통신 ? 이기 때문에 포트번호 다르게 설정한다 ?
	}

}
