package ch05;

public class ArraySum {

	public static void main(String[] args) {
//		int num[]= {10,20,30,40,50};
//		int sum=0; //배열의 합계를 저장할 변수
		
		int sum=0;
		int num[];
		num=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		
		for(int i=0; i<5; i++) {
			sum+=num[i];
		}
//		for(int i=0; i<num.length; i++) { //참조변수.length는 배열의 갯수값을 가져온다
//		    sum+=num[i];
//	    }
		System.out.println("합계 : "+sum);

	}

}
