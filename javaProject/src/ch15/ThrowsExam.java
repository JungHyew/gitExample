package ch15;

public class ThrowsExam {
	//예외처리방법
	//1) try ~ catch 직접처리
	//2) throws 예외처리를 클래스에 위임
	
	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			Thread.sleep(1000); //Interrupt(cpu 간섭)
			//1초 쉬었다가 출력하게 만든다(한번에 출력되지 않고 천천히 출력된다)
		}
	}

}
