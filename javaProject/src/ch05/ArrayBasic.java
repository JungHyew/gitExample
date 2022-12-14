package ch05;
//배열
public class ArrayBasic {

	public static void main(String[] args) {
		int[] score; //배열참조변수 선언
		score=new int[5]; //new를 통해 메모리에 5개의 int형 자리를 생성함
		// int[] score=new int[5]; 로 실행해도 동일하다
		//배열생성(4byte x 5 = 20byte)
		System.out.println(score); //score는 메모리의 주소값을 가리키는 참조변수가 된다
		score[0]=100;
		score[1]=90;
		score[2]=80;
		score[3]=60;
		score[4]=70; //5개이므로 4까지만 해야된다
		//score[5]=80; //범위초과
		//int[] score={100,90,80,60,70}; 으로 작성해도 동일하다
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		//배열을 다루는데 있어서 for문은 거의 필수적으로 사용된다
		for(int i=0; i<5; i++) {
			System.out.println(score[i]);
		//위의 코드와 출력 결과가 동일하다, for문을 통해 간단하게 작성할 수 있다
		}

	}

}
