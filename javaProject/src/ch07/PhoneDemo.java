package ch07;

//한개의 파일에 2개이상의 class파일을 작성할때는 public class의 클래스 이름으로 저장, public 처리해야됨
//나머지 클래스의 클래스 이르믄 default로 처리(public은 한 번만 작성 가능)
class Phone{
	String model;
	int value;
	void print() {
		System.out.println(value+"만원 짜리 "+model+" 스마트폰");
	}
	
}


public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone=new Phone();
		myPhone.model="갤럭시 22";
		myPhone.value=100;
		myPhone.print();
		
		Phone yourPhone=new Phone();
		yourPhone.model="iPhone";
		yourPhone.value=150;
		yourPhone.print();
	}

}
