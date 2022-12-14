package ch06;

public class EchoEx {

	public static void main(String[] args) {
		echo("안녕!",3); //매개변수 : 2개, 타입 : string과 int

	}

	private static void echo(String s, int n) { //s="안녕!", n=3 //타입이 2개
		for(int i=0; i<n; i++) {
			System.out.println(s);
		}
		
	}

}
