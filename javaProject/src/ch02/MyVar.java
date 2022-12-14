package ch02;

public class MyVar {
	
	public static int sum(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		int a =30;
        int b = 50;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("a + b =" + sum(a,b));

	}

}
