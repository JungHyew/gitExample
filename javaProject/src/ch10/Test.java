package ch10;

public class Test {
	static int a; //static member
	int b=20; //nonstatic member
	void print() { //nonstatic member 메소드
		System.out.println(a); //static => 이미 메모리에 올라와 있기 떄문에 자유롭게 사용 가능하다
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println(a);
//		System.out.println(b); //b는 nonstatic이라 오류
		
		Test t=new Test();
		System.out.println(t.b);
		t.print();
		t=null; //객체의 주소값을 초기화(주소값을 잃어버린다)
//		System.out.println(t.b); //오류뜬다
	}

}
