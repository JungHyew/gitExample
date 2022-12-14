package ch06;

public class CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod(); //firstMethod로 넘어간다
		System.out.println("main(String[] args)이 끝났음.");
	} //프로그램 끝

	static void firstMethod() { //public 안써도 상관없음
		System.out.println("firstMethod()가 시작되었음.");
		secondMethod(); //secondMethod로 넘어간다
		System.out.println("firstMethod()가 끝났음.");
	}

	static void secondMethod() {
		System.out.println("secondMethod()가 시작되었음.");
		System.out.println("secondMethod()가 끝났음.");
	}

}
