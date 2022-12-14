package ch02;

public class PrintfEx {

	public static void main(String[] args) {
		int i = 97;
		int d = 3000;
		String s = "java";
		double f = 3.14;
		
		System.out.printf("%d\n", i); //%d : 정수형 값, \n : 줄바꿈
		System.out.printf("%o\n", i); //printf : 포맷
		System.out.printf("%x\n", i);
		System.out.printf("%c\n", i);
		System.out.printf("%5d\n", d); //정수형 5자리 마련해라.(오른쪽정렬), 4자리 숫자면 앞에 한 칸 띄고 써진다.
		System.out.printf("%-5d\n", d); //정수형 5자리 마련해라.(왼쪽정렬), 4자리 숫자면 맨 마지막에 한 칸 띄어진다.
		System.out.printf("%05d\n", d); //5자리인데 빈자리에 0이 채워진다
		System.out.printf("%,d\n", d); //3자리마다 콤마처리 해준다.
		System.out.printf("%s\n", s);
		System.out.printf("%5s\n", s);
		System.out.printf("%-5s\n", s);
		System.out.printf("%f\n", f);
		System.out.printf("%e\n", f);
		System.out.printf("%4.1f\n", f);
		System.out.println(String.format("%4.1f", f));
		System.out.printf("%.1f\n", f); //전체 자리수는 정하지 않고 소수점 첫째자리까지만 지정
		System.out.printf("%04.1f\n", f);
		System.out.printf("%-4.1f\n", f); //4자리인데 왼쪽정렬이라 맨 마지막에 한 칸 띄어짐.
		
		int a=3, b=5;
		//%로 표현하고자 할때는(%출력값에 나타내고 싶을때) a%%b처럼 2개를 씀
		System.out.printf("a%%b=%d\n", a%b); //a를 b로 나눈 나머지값
	}

}
