package ch04;

public class LableBreak {

	public static void main(String[] args) {
		exit_for :  //라벨지
			for(int i=1; i<=5; i++) {
				for(int j=1; j<=5; j++) {
					//if(j==3) break; //안쪽 for문만 빠져나옴
					if(j==3) break exit_for; //바깥쪽 for문까지 다 빠져나감
					System.out.println(i+","+j);
				}
			}

	}

}
