package ch13;

public class StrEx {
	public static void main(String[] args) {
		String str="Java Programing";
		System.out.println(str);
		//대문자로 변경
		System.out.println(str.toUpperCase());
		//소문자로 변경
		System.out.println(str.toLowerCase());
		System.out.println(str); //원본은 바뀌지 않는다(불변성)
		str=str.toLowerCase(); //소문자 변경으로 초기화 시킴
		//기존 str 주소값은 끊어지고 toLowerCase가 있는 문자열로 새로 연결
		System.out.println(str); //str 원본이 아예 바뀜
		
		str=""; //빈문자열(널문자열) ('\0')처리와 같음
		System.out.println("내용 : "+str);
		str=null; //참조하는 내용이 없음 //주소값 자체가 없다
		System.out.println("내용 : "+str);
		
		char ch='\0'; //널문자
		System.out.println("내용 : "+ch+", code : "+(int)ch);
		ch=' '; //단문자 초기화
		System.out.println("내용 : "+ch+", code : "+(int)ch);
	}

}
