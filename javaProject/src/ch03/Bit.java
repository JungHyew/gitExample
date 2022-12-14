package ch03;

public class Bit {
//비트연산자( | or, & and, ^ xor )
	public static void main(String[] args) {
		System.out.println(3 | 5); //3을 이진수로=>0011, 5를 이진수로=>0101
		// 0011 | 0101 => 0111(십진수:7)
		System.out.println(3 & 5); // 0011 & 0101 => 0001(십진수 : 1)
		System.out.println(3 ^ 5); // 0011 ^ 0101 => 0110(십진수 : 6)

	}

}
