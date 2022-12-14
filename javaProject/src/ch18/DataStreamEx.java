package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamEx {
	public static void main(String[] args) {
		try {
			//텍스트 파일이 아닌 binary file(이진파일)로 저장
			DataOutputStream dataout=new DataOutputStream(
					new FileOutputStream("C:\\test\\test.dat"));
			dataout.writeInt(123); //숫자형식의 자료를 파일에 저장
			dataout.writeChar('A'); //문자형식의 자료를 파일에 저장
			dataout.writeDouble(3.5); //실수형식의 자료를 파일에 저장
			dataout.close(); //스트림을 닫아줘야 파일이 생성이 된다(완성된다)
			System.out.println("저장되었습니다.");
			
			//이전파일을 읽기
			DataInputStream datain=new DataInputStream(
					new FileInputStream("C:\\test\\test.dat"));
			System.out.println(datain.readInt());
			System.out.println(datain.readChar());
			System.out.println(datain.readDouble());
			datain.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
