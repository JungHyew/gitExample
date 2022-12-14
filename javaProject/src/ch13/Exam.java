package ch13;

//import java.lang.*; //가 생략되어져 있음

public class Exam { //extends Object가 생략되어 있음

	public static void main(String[] args) {
		String a="hello"; //String Pool이라는 메모리 영역에 값이 저장됨
		System.out.println(System.identityHashCode(a));
		//identityHashCode : String의 전용 객체주소 확인용 메소드
		String b="hello";
		System.out.println(System.identityHashCode(b)); //a와 b의 주소값이 같게 나온다
		System.out.println(a==b); //a와 b의 주소값이 같은가?를 묻는다 (주소값 비교)(true=>같다)
		
		String c=new String("hello"); //new를 통해 객체생성
		System.out.println(System.identityHashCode(c)); //a,b와 주소값이 다르다
		String d=new String("hello"); //new를 통해 객체생성을 하면 새로운 주소값을 가진다
		System.out.println(System.identityHashCode(d)); //a,b,c와 모두 주소값이 다르다
		System.out.println(c==d); //c와 d의 주소값 비교(false=>주소값 다르다)
		System.out.println(c.equals(d)); //equals : 내용을 비교 //hello로 내용은 같다
	}

}
