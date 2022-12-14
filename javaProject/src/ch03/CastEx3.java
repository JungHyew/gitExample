package ch03;

public class CastEx3 {

	public static void main(String[] args) {
		int x=8;
		int y=5;
		System.out.println("x/y = " + x/y);
		//System.out.printf("x/y=%.1f", x/y);
		System.out.printf("x/y=%.1f", (double)x/y); 
		//double 타입으로 형변환 시킬때는 %d 쓰면 안되고 실수형f로 써줘야 된다.
		//printf에서는 결과값에 따른 실수형 포맷들을 잘 써야 된다.

	}

}
