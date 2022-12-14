package ch13;

public class AutoBox {
	public static void main(String[] args) {
		//기본자료형
		int num1=10;
		int num2;
		
		//참조자료형
		Integer i1; //선언만 했을때는 i1의 값은 null상태이다(값이 없다)
		Integer i2=new Integer(20); //auto boxing 처리(20은 기본자료형값인데 객체로 만들었다)
		//기본자료형 리터럴을 객체로 박스 처리
		
		i1=num1; //i1은 참조자료형, num1은 기본자료형인데 에러안뜸
		//기본자료형인 int와 객체자료형인 Wrapper Class인 Integer는 호환되기때문
		num2=i2; //auto unboxing(객체 안에 들어있는 값을 풀어서 저장)
		
		System.out.println(num1+","+i1);
		System.out.println(num2+","+i2);
	}

}
