package ch04;

public class For_Sum {

	public static void main(String[] args) {
		int total=0;
		for(int i=1; i<=100; i++) {
			total=total+i; // 1부터 i까지의 자연수 합
			System.out.println(total);
			if(i%10 == 0) {
				System.out.println("1부터 "+i+"까지의 자연수 합계는 "+total);
			} //if
		} //for

	}

}
