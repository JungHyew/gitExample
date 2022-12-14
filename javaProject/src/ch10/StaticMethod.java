package ch10;

public class StaticMethod {
	//멤버변수
	static int a=10;
	int b=20;
	
	public static void printA() { //static member method
		System.out.println(a);
		StaticMethod s=new StaticMethod();
		System.out.println(s.b);
	}
	
	public void printB() { //nonstatic member method
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		printA();
		StaticMethod a=new StaticMethod();
		a.printB();
		//printB(); //main 바깥에 있는 멤버형 nonstatic메소드이기 때문에
		//반드시 객체생성 이후에 사용할 수 있다
	}
	

}
