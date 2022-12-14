package ch03;

public class AssignEx {

	public static void main(String[] args) {
		int a=3, b=5, c=7;
		String s1="Hello", s2="world";
		
		a += 3; // a=a+3
		System.out.println(a);
		
		s1 += s2; //s1=s1+s2 , 문자열은 더하는것이 아니라 연결되는것
		System.out.println(s1);
		
		b /= 5; // b=b/5;
		System.out.println(b);
		
		c %= 2; // c=c%2
		System.out.println(c);

	}

}
