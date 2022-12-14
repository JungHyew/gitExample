package ch15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleExam {
	//2개 이상의 예외가 함께 발생할 경우(세부적인 예외부터 처리한다)
	public static void main(String[] args) {
		int num=50;
		Scanner scan=null; //준비만 시켜놓음
		
		try {
			System.out.println("숫자를 입력하세요 : ");
			scan=new Scanner(System.in);
			int value=scan.nextInt();
			System.out.println(num/value);
		} catch (NullPointerException e) {
			System.out.println("널포인터 예외");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력할 수 있습니다.");
		} catch (Exception e) {
			System.out.println("기타 예외");
		} finally { //예외여부 상관없이 항상 실행되는 코드(필수코드는 아님)
			if(scan != null) { //if문으로 걸러주지 않으면 만약 실제로 scan이 없는데 
				//닫으라고 하면 finally절에서 또 예외가 발생할 수 있다
				scan.close();
			}
		}
		System.out.println("프로그램 종료");
	}

}
