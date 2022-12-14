package ch12;

class Outer{
	class InstanceInner{ //내부 클래스
		int a=100; //non-static member
	}
	static class StaticInner{ //static 내부클래스
		int a=200; //non-static member
		static int b=300; //static member
	}
	void myMethod() { //Outer의 멤버메소드
		class LocalInner{ //지역중첩클래스
			int a=400; //non-static
		} //end inner class
		LocalInner i=new LocalInner();
		System.out.println("i.a : "+i.a);
	} //end method
}

public class InnerEx4 {
	public static void main(String[] args) {
		Outer oc=new Outer();
		Outer.InstanceInner i=oc.new InstanceInner();
		
		System.out.println("i.a : "+i.a);
		System.out.println("Outer.StaticInner.b : "+Outer.StaticInner.b); //같은 static끼리여서 가능
//		System.out.println("Outer.StaticInner.a : "+Outer.StaticInner.a); //a는 non-static이라 불가능
		Outer.StaticInner si=new Outer.StaticInner();
		System.out.println("si.a : "+si.a); 
		//non-static 멤버는 static 클래스 안에 있더라도 반드시 new를 통해 생성한 후 사용해야 한다
		
		oc.myMethod();
	}

}
