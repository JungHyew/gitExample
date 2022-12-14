package ch18;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx2 {
	
	public static void main(String[] args) {
		//Buffered계열(Reader계열(Stream)) 형태로 구성
		
		//new BufferedReader(new Reader객체(System.in))
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자열 한줄을 입력하세요 : ");
		try {
			String str=reader.readLine(); //한 라인을 읽어들임
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("[프로그램 종료]");
	}

}
