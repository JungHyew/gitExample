package ch04;

public class If_Else_Ex1 {

	public static void main(String[] args) {
		 // if else문
		int score = 90; //정수 초기화
		String result = ""; //빈문자열(값은 있는 상태), 문자열 초기화
		if(score >= 60) {
			result="합격";
		}else {
			result="불합격";
		}
		System.out.println(result);
		
	}

}
