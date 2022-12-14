package ch06;

public class ReturnEx {
	//리턴값이 있는 메소드
	public static int sum(int a) { //사용자가 정의한 메소드 //a=50
		int result=0;
		for(int i=1; i<=a; i++) {
			result=result+i;
		}
		return result; //메소드를 호출한 곳으로 값을 반환함
	}
	
	public static void main(String[] args) { //어느 위치에 작성하던 main 메소드부터 시작하고 끝난다
		int n=sum(50); //sum메소드 호출한 후 리턴받은값을 n변수에 저장
		System.out.println(n);
		n=sum(100); //메소드 재사용
		System.out.println(n);

	}

}
