package ch10;

public class PolyEx {

	public static void main(String[] args) {
		int a=10;
		double b=20.1;
		char c='A';
		String d="hello";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("====================");
		//최상위 클래스인 Object는 모든 타입을 다 다룰 수 있다
		//만약 모든 코드를 Object로만 쓰면 프로그램이 무거워지며 속도저하가 일어나거나 컴퓨터가 꺼짐
		//즉, 한개의 자료형으로 다양한 형태의 자료형을 처리할 수 있는 능력을 다형성이라 한다
		Object o=21;
		Object o1=2.5;
		Object o2='A';
		Object o3="Java";
		System.out.println(o);
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);

	}

}
