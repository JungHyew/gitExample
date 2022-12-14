package ch02;

public class VarInitTest {

	public static void main(String[] args) {
		int index = 1;
		//int index; //지역변수는 반드시 명시적 초기화를 해야한다.
		
		index = index + 1; //초기화를 안하면 변수 초기화 오류
		System.out.println("index : " + index);
		
	}

}
