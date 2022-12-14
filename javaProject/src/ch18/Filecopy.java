package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Filecopy {
	
	public static void main(String[] args) {
		//복사본<==(OutputStream객체 사용) [프로그램] <== (InputStream객체 사용) 원본
		String str="";
		BufferedReader reader=null;
		BufferedWriter writer=null;
		
		String file1="C:\\test\\aa.txt"; //원본파일
		String file2="C:\\test\\b.txt"; //복사본
		
		try {
			reader=new BufferedReader(new FileReader(new File(file1)));
			writer=new BufferedWriter(new FileWriter(new File(file2)));
			while(true) {
				str=reader.readLine(); //한 라인을 읽음 ex)aaa\r\n 이 라인의 끝으로 인식
				if(str==null) break; //내용이 없으면 종료
				//파일을 기록할때도 \r\n\ 을 써주어야함
				// \r : carriage return(캐리지 리턴)
				// \n : new line(줄바꿈)
				writer.write(str+"\r\n");
			}
			System.out.println("파일 복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close();
				//참조값을 가지고 있으면 리소스를 개별적으로 finally절 안에서 닫아주는게 좋다
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(writer != null) writer.close(); //버퍼를 닫지 않으면 저장이 안된다
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
