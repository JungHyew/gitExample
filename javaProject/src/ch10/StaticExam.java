package ch10;

//개별적인 값을 사용할 떄 => nonstatic 사용 ex)학생들
//공통적인 값을 사용할 때 => static 사용 ex)학점 4.0등, 3.5이상 등
public class StaticExam {
	public static void main(String[] args) {
		int a=40, b=30, result;
		//대표적으로 자주 사용하고 고정된값 등, Math클래스 등은 static, final을 거의 사용한다.
		result=Math.max(a, b); //둘 중 큰 값을 쓰는 함수
		System.out.println(result);
		
		result=Math.min(a, b); //둘 중 작은값을 쓰는 함수
		System.out.println(result);
		System.out.println(Math.sqrt(100));
		double r=15.3;
		System.out.println("원의 둘레 : "+2*Math.PI*r);
		System.out.println("원의 넓이 : "+Math.PI*r*r);
	}

}
