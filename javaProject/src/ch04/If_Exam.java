package ch04;

public class If_Exam {

	public static void main(String[] args) {
		//if문
		int a = 9;
		if(a % 2 == 0) { //a를 2로 나눈 나머지가 0이면 다음 문장을 실행한다.
			System.out.println(a + "는 짝수입니다."); //홀수인경우 이 문장을 실행하지 않는다. 해당 if문 이후의 문장은 실행한다.
		} //end if
		System.out.println("if문이 끝난이후 그 다음 명령문을 수행한다.");

	} //end main

} //end class
