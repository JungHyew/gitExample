package ch02;

//클래스 이름은 대문자로 시작 ex) Hello
public class HelloExam {
	
	//전역변수(멤버변수) : 클래스와 메소드 사이에 선언된 변수 => a,b
	int a,b;

	//메소드 이름은 소문자로 시작 ex) sum
	public static int sum(int n, int m) {// n<-20, m<-10 할당한것
		return n+m; // =30
	}
	
	//실행되는 메인 메소드(=함수)(반드시 있어야 된다.)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지역변수 : 메소드 안에서 선언된 변수 => i, s, a
		int i = 20; //지역변수 초기화(값을 저장, 값을 변수에 할당한다.)
		int s; //지역변수를 선언만 했다.
		char a; //지역변수 선언
				
		s = sum(i, 10); // s=30
		double s2 = sum(30,10);
		a = '?'; //단문자는 작은따옴표''를 쓰고, 문자는 ""를 쓴다.
		System.out.println(a); // println은 줄바꿈해서 출력된다.
		System.out.println("Hello");
    System.out.println(s);
    System.out.println(s2);
   }

}
