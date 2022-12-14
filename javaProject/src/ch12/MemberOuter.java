package ch12;

public class MemberOuter {
	int num=1;
	String name="홍길동";
	String email="hong@gmail.com";
	void print() {
		class MemberInner{
			void result() {
				System.out.println("-----------------------");
				System.out.println("고객번호 : "+num);
				System.out.println("이름 : "+name);
				System.out.println("이메일 : "+email);
				System.out.println("-----------------------");
			}
		}
		MemberInner in=new MemberInner();
		in.result();
	}
	
	public static void main(String[] args) {
		MemberOuter m=new MemberOuter();
		m.print();
		
	}

}
