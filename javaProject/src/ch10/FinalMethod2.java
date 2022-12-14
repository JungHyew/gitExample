package ch10;

class T{
	private int num=10;
	public final void print() { //메소드에 final 붙이면 오버라이딩이 안된다
		System.out.println(num);
	}
}

public class FinalMethod2 extends T {
	//멤버변수
	int num=100;
	//nonstatic 쓰려면 객체생성 해야된다
	
	public static void main(String[] args) {
		//상속관계가 만들어졌을때 자식클래스를 객체생성하면 부모클래스는 자동 생성된다
		FinalMethod2 f=new FinalMethod2();
		f.print();
		
	}

}
