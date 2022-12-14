package ch13;

import java.util.Random;

public class Rand {
	public static void main(String[] args) {
		Random r=new Random();
		System.out.println(r.nextDouble());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100)); //0~99까지만 난수로 발생시킨다 ?
		System.out.println(r.nextInt(101)+100); //100~200사이의 값을 난수로 발생시킨다 ?
		System.out.println(Math.random()); //0.0~1.0 미만 실수를 난수로 발생시킨다
		int num=(int)(Math.random()*100); //왼쪽 타입에 맞게 형변환 시킨다 //0~99까지 정수화
		System.out.println(num);
		String[] prize= {"1등","2등","3등","다음 기회에"};
		System.out.println(prize[r.nextInt(4)]); //0~3까지만 발생시킨다
	}

}
