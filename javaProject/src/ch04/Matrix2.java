package ch04;

public class Matrix2 {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) {
					System.out.printf("[%d,%d]",i,j);
				}else {
					System.out.printf("%5c",' '); //c는 단문자(' ')출력, 5칸씩 빈문자열로 처리
					//character(단문자) 5자리
				}
			} //안쪽 for문
			System.out.println();
		}//바깥쪽 for문

	}

}
