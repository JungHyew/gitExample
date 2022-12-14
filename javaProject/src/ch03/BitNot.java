package ch03;

public class BitNot {

	public static void main(String[] args) {
		// ~연산자(비트값을 반전, 0을 1로, 1을 0으로)
		byte a=10; //1010
		System.out.println(a); //1010
		System.out.println(~a); //0101(숫자 반전시킴) => -1011(맨마지막 빼고 다시 반전 후 마이너스 붙임)

	}

}
