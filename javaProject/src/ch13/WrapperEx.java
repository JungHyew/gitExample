package ch13;

//Wrapper class : 기본자료형을 포장하는 클래스
//기본 자료형에 대한 다양한 method를 지원
//byte      Byte
//short     Short
//int       Integer
//float     Float
//double    Double
//char      Character
//boolean   Boolean

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1=10;
		Integer i2=new Integer(20); //이 방식이 정석이지만 위의 방식도 가능하다 //auto boxing
		int num1=i1.intValue(); //unboxing
		int num2=i2; //i2는 주소값인데 주소값을 int값에 집어넣는다 
		//auto unboxing(객체로 포장된 value를 꺼내서 작업됨)
		int sum=num1+num2;
		System.out.println(sum);
		//2진수 문자열로
		System.out.println(Integer.toBinaryString(sum));
		//8진수 문자열로
		System.out.println(Integer.toOctalString(sum));
		//16진수 문자열로
		System.out.println(Integer.toHexString(sum));
		
		System.out.println(Integer.MAX_VALUE); //정수의 최대값
		System.out.println(Integer.MIN_VALUE); //정수의 최소값
		System.out.println(Integer.parseInt("100"));
		//정수를 문자열로
		System.out.println(Integer.toString(100)); //방법1
		System.out.println(100+""); //방법2
	}
	

}
