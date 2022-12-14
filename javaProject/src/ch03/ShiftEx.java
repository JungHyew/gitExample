package ch03;

public class ShiftEx {
//쉬프트 연산자
	public static void main(String[] args) {
		int a=2; //2는 이진수로 0010
		int b=a<<2; //2만큼 왼쪽으로 민다 => 1000(십진수:8)(앞의 0 2개 지워지고 빈자리는 0으로 채워진다)
		System.out.println(b);
		b = b >> 2; //1000 => 0010(십진수 : 2)
		System.out.println(b);

	}

}
