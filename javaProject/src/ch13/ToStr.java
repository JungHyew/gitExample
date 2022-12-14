package ch13;

public class ToStr { //모든 클래스는 extends Object { 가 생략되어 있음
	public static void main(String[] args) {
		Object obj=new Object();
		obj=new Integer(20); //좌변 : 부모, 우변 : 자식 => 다형성
		//참조변수에는 원래 주소값이 들어가지만 jdk1.5부터는 value(일반값)가 들어갈 수 있도록 
		//내부처리(intValue()등의 호출)하도록 했다(Auto Boxing 처리)
		//obj=20; 한것과 마찬가지이다
		System.out.println(obj); //객체->일반(Auto Unboxing처리)
		obj=new Double(20.5);
		//obj=20.5; 와 동일하다
		System.out.println(obj);
		obj=new String("hello");
		//obj="hello"; 와 동일하다
		System.out.println(obj);
	}

}
