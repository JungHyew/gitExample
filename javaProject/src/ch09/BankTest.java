package ch09;

import ch05.GetMin;

class Bank{
	//멤버 메소드
	double getInterestRate() {
		return 0.0;
	}
}

class BadBank extends Bank{
	@Override //오버라이딩(겹쳐쓴다) //부모꺼를 그대로 가져다 쓴다
	double getInterestRate() { //메소드 오버라이딩(재정의)
		return 10.0;
	}
}

class NormalBank extends Bank{
	@Override
	double getInterestRate() { //메소드 오버라이딩(재정의)
		return 5.0;
	}
}

class GoodBank extends Bank{
	@Override
	double getInterestRate() { //메소드 오버라이딩(재정의)
		return 3.0;
	}
}

public class BankTest {
	public static void main(String[] args) {
		BadBank b1=new BadBank(); //객체생성, 인스턴스화
		NormalBank b2=new NormalBank();
		GoodBank b3=new GoodBank();
		System.out.println("BadBank의 이자율 : "+b1.getInterestRate());
		System.out.println("NormalBank의 이자율 : "+b2.getInterestRate());
		System.out.println("GoodBank의 이자율 : "+b3.getInterestRate());
	}

}
