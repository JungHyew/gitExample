package ch04;

public class Sum {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum += i; //sum=sum+i
			
		}
		System.out.printf("1부터 10까지의 정수의 합 = %d\n",sum);
		//printf는 줄바꿈이 안되기 때문에 \n을 써준다

	}

}
