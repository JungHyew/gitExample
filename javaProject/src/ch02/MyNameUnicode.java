package ch02;

public class MyNameUnicode {

	public static void main(String[] args) {
		char aValue = '\uC815';
		char bValue = '\uD61C';
		char cValue = '\uC6D0';
		System.out.println("char형(\'\\uC815\') : " + aValue);
		System.out.println("char형(\'\\uD61C\') : " + bValue);
		System.out.println("char형(\'\\uC6D0\') : " + cValue);

	}

}
