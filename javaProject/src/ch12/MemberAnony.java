package ch12;

public class MemberAnony {
	public static void main(String[] args) {
		Member m=new Member() {

			@Override
			public void number() {
				System.out.println("고객번호 : "+num);
			}

			@Override
			public void name() {
				System.out.println("이름 : "+n);
			}

			@Override
			public void email() {
				System.out.println("이메일 : "+e);
			}
			
		};
		m.number();
		m.name();
		m.email();
	}

}
