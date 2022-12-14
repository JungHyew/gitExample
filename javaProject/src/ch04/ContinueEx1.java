package ch04;

public class ContinueEx1 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i % 5 ==0) { //5의 배수를 만나면
				continue; //이하 코드 무시(skip), 다음 단계로
			} //즉, 5의 배수일때의 값은 무시되어서 출력되지 않는다
			System.out.println(i);
		}

	}

}
