package ch15;

public class Test {
	public static void main(String[] args) {
		//try ~ catch문으로 예외처리 해보세요
		try {
			int num=Integer.parseInt("ABC");
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("NumberFormat 예외발생");
			//e.printStackTrace();
		}
	}

}
