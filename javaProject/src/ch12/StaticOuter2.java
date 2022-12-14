package ch12;

public class StaticOuter2 {
	static int data=30; //static
	int data2=50; //non-static
	static class StaticInner2{ //static 내부클래스
		void msg() {
			System.out.println("data is "+data);
//			System.out.println("data is "+data2); //static class이므로 non-static멤버는 사용 불가능
		}
	}
	
	public static void main(String[] args) {
		StaticOuter2.StaticInner2 in=new StaticOuter2.StaticInner2(); //내부 static 클래스 생성
		in.msg();
	}

}
