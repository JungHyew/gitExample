package ch19;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.text.SimpleDateFormat;

//서버용 프로그램(클라이언트 프로그램보다 먼저 실행되어야 한다)
public class DataServer {
	public static void main(String[] args) throws Exception {
		//try~with문
		try(ServerSocket ss=new ServerSocket(8000)){ //포트번호 : 8000번
			System.out.println("서비스가 시작되었습니다.");
			while(true) {
				//Client Socket
				//클라이언트에서 접속하면 소켓을 연결한다(논리적인 회선 연결)
				Socket socket=ss.accept(); //받아들일 준비
				PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
				String str=sdf.format(new Date()); //시스템 날짜값을 가져온다
				out.println(true); //클라이언트에게 데이터 전송
				socket.close(); //연결종료
			}
		}
	}

}
