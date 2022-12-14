package ch19;

import java.net.InetAddress;

public class InetAddressExam {
	public static void main(String[] args) {
		try { //네트워크 프로그램도 필수로 try~catch 써야된다
			InetAddress address=InetAddress.getByName("google.com");
			System.out.println(address); //호스트이름, ip주소값 가져온다
			System.out.println(address.getHostName()); //호스트이름(도메인이름)만 가져온다
			System.out.println(address.getHostAddress()); //ip주소값만 가져온다
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
