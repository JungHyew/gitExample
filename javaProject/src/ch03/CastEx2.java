package ch03;

public class CastEx2 {

	public static void main(String[] args) {
		int a = 500;
		float b = 200.2f;
		int c = 127;
		double d = a; // 정수를 실수에 대입했으므로 자동형변환됨(작은것에서 큰것으로 가서)
		System.out.println("int a => double : " + d);
		
		int e = (int)b; //실수를 정수로 바꿔야 되므로 강제형변환됨 -> 값이 손상될 수 있음
		System.out.println("float b => int : " + e);
		
		byte f = (byte)c; //byte보다 int가 더 크므로 강제형변환
		System.out.println("int c => byte : " + f);
		

	}

}
