package ch18;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class BufferedWriterEx {
	
	public static void main(String[] args) {
		PrintStream ps=System.out;
		OutputStream os=ps;
		OutputStreamWriter osw=new OutputStreamWriter(os);
		BufferedWriter bw=new BufferedWriter(osw);
		//BufferedWriter bw=BufferedWriter(new OutputStreamWriter(System.out))로 한줄로 작성 가능
		try {
			bw.write("환영합니다.\n");
			bw.write("Java");
			bw.newLine(); //개행처리(줄바꿈)를 해주는 메소드
			bw.write("world!!");
			bw.flush();
			bw.close(); //스캐너처럼 종료해주는것도 좋다
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
