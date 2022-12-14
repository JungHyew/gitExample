package ch13;

public class Obj extends Object {
	public static void main(String[] args) {
		Obj e1=new Obj();
		System.out.println(e1.getClass()); //클래스의 정보 알려준다(어느 위치에 있는지)
		System.out.println(e1); //e1의 주소값
		System.out.println(e1.toString()); //Object를 문자열로 변환
	}

}
