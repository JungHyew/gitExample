package ch03;

public class CastEx {
//자료형변환
	public static void main(String[] args) {
		float f = 1.6f; //float만큼은 숫자 뒤에 F,f 써줘야된다 , 4바이트로 저장됨
		System.out.println(f);
		
		f= 100; //100 -> 정수라 원래는 에러 인데 자동형 변환시켜서 에러 안뜸
		//(정수100을 자동으로 float형 실수 100.0f로 변환)
		System.out.println(f); //자동으로 100.0으로 변환되서 출력됨
		
		f=100.5f;
		//int i = f; // int는 정수이기 때문에 실수인 f가 들어가지 않는다 => 강제형변환해야됨
		int i = (int)f; //강제형변환시킴(큰것에서 작은것으로 가기때문)
		System.out.println(i);

	}

}
