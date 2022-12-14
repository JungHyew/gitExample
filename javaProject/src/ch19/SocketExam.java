package ch19;

import java.net.ServerSocket;

public class SocketExam {
	public static void main(String[] args) {
		//서버소켓 : 서버에서 서비스를 위한 목적으로 만드는 소켓(서버용 전용 소켓)
		ServerSocket socket=null;
		//포트번호 : 0~65355 내에서 배정이 된다, 중복되지 않아야함
		//기본적으로 1port 1service
		//well known port(잘 알려진, 자주 사용하는 포트 번호)는 건드리면 안된다
		//ex) 80:웹서비스포트, 21:FTP 서비스, 445:파일공유, 3389:원격접속, 8080:오라클EB 기본포트

		for(int i=0; i<=65535; i++) {
			try {
				socket=new ServerSocket(i); //서버 소켓 생성
				socket.close(); //socket도 리소스이므로 종료시킨다
			} catch (Exception e) {
				System.out.println(i+"번 포트는 사용중입니다."); //오류났을때 출력된다
				//사용중인 포트는 피해서 사용해야한다(포트번호가 충돌이 일어나면 안되기 때문)
			}
		}
		System.out.println("포트 컴사를 마쳤습니다.");
	}

}
