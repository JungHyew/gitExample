package ch18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

//Stream : 데이터의 논리적인 통로, 바이트 단위
//프로그램 ===> 외부자원 : 출력스트림
//프로그램 <=== 외부지원 : 입력스트림

public class MemberUse {
	public static void main(String[] args) {
		FileOutputStream fos=null; //파일저장
		ObjectOutput oos=null; //메모리에 있는 객체를 파일로 저장
		MemberDTO m1=new MemberDTO("kim","김길동","1234",30,"kim@gmail.com");
		MemberDTO m2=new MemberDTO("kim","이길동","1234",20,"lee@gmail.com");
		MemberDTO m3=new MemberDTO("kim","박길동","1234",40,"park@gmail.com");
		try {
			fos=new FileOutputStream("C:\\test\\object.dat");
			//직렬화(serialization) : 메모리에 있는 내용=>프로그램=>파일로 가는것 ?
			oos=new ObjectOutputStream(fos);
			oos.writeObject(m1); //m1객체를 파일에 저장
			oos.writeObject(m2);
			oos.writeObject(m3);
			System.out.println("객체를 파일로 저장했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//역직렬화(deserialization) : 파일=>프로그램=>메모리
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("C:\\test\\object.dat");
			ois=new ObjectInputStream(fis);
			MemberDTO dto1=(MemberDTO)ois.readObject();
			MemberDTO dto2=(MemberDTO)ois.readObject();
			MemberDTO dto3=(MemberDTO)ois.readObject();
			
			System.out.println(dto1);
			System.out.println(dto2);
			System.out.println(dto3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
