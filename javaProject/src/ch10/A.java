package ch10;

//static => 메모리에 바로 로딩
//nonstatic => 객체생성 후에 로딩
public class A {
	//멤버변수
	String name="Kim"; //nonstatic member
	static int n=20; //static member
	//멤버메소드
	public void print() {
		System.out.println(name);
		System.out.println(n);
	}

	public static void main(String[] args) { //static member
		//지역변수
		int a=10;
		double b=20.5;
		System.out.println(a);
		System.out.println(b);
//		System.out.println(name); //nonstatic이라 객체생성해야 실행된다
//		System.out.println(n); //객체생성 안해도 static member라서 그냥 실행된다
		
		A aa=new A();
		System.out.println(aa.name); //nonstatic member는 반드시 객체생성 이후에 사용가능하다
		

	}

}
