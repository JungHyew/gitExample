package ch13;

public class Replace {
	public static void main(String[] args) {
		String a="java program";
		System.out.println(a.replace("a", "A")); //a->A로 바꿔준다
		System.out.println(a); //바꾼 내용을 기억하지 않아 원래대로 돌아온다
		a=a.replace("a", "A"); //완벽하게 초기화 된다
		System.out.println(a); //따라서 바꾼 내용을 기억한다
	}

}