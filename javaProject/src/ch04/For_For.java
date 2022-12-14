package ch04;

public class For_For {
//중첩 for문
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) { //문(ex)for문)을 그대로 옮기려면 Alt누르고 방향키 누른다
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈(개행) 처리
		}

	} //end main(프로그램 종료)

}
