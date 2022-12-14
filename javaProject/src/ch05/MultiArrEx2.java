package ch05;

import java.util.Scanner;

public class MultiArrEx2 {

	public static void main(String[] args) {
		String[][] words= {{"chair","의자"} 
		,{"computer","컴퓨터"} 
		,{"integer","정수"}};
		
		Scanner scan=new Scanner(System.in);
		
		outer : 
		while(true) {
			for(int i=0; i<words.length; i++) {
				System.out.printf("문제%d) %s의 뜻은?(프로그램 종료 : -1)",i+1,words[i][0]);
				String tmp=scan.next();
				if(tmp.equals(words[i][1])) {
					System.out.printf("정답입니다.%n%n");
				}else if(tmp.equals("-1")) {
					break outer;
				}else {
					System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
				}
			}
		}
		System.out.println("프로그램을 종료합니다.");
			
	}

}
