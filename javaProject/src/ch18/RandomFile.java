package ch18;

import java.io.RandomAccessFile;

public class RandomFile {
	public static void main(String[] args) {
		String str=null;
		try { //r:읽기전용, w:쓰기전용, rw:읽기,쓰기
			RandomAccessFile file=new RandomAccessFile("C:\\test\\rand.txt","rw"); //읽기쓰기모드
			//getFilePointer : 파일포인터(파일을 어디까지 읽었는지 가리킨다)
			System.out.println(file.getFilePointer()); //기본적으로 0번 인덱스 가리킨다
			file.seek(8); //8번째 인덱스부터 찾는다 ?
			System.out.println(file.getFilePointer()); //8번 인덱스 가리킨다 ?
			file.write("HTML".getBytes()); //인덱스 8번 위치에서 기존내용을 덮어쓰게 된다
			System.out.println(file.length()); //문자길이 확인(한글은 3바이트 길이값을 가진다)
			System.out.println(file.getFilePointer());
			while(file.getFilePointer() < file.length()) {
				//파일의 내용보다 파일포인터의 위치값이 적으면 반복한다
				str=file.readLine();
				//매개변수 2개인 String //new String(문자열,캐릭터셋) 인코딩방식 변환
				//한글처리
				//스트링.getBytes() - 스트링을 바이트 배열로 변환
				//8859_1, iso-8859_1 : 서유럽언어 인코딩 방식
				//ms949 : 2바이트
				//utf-8 : 3바이트 - 초성(1byte), 중성(1byte), 종성(1byte)
				str=new String(str.getBytes("8859_1"),"utf-8"); //utf-8로 변환 ? 
			}
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			file.close(); //파일 저장 시점
			System.out.println("파일이 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
