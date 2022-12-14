package ch03;

import java.util.Scanner;

public class JumSoo {

	public static void main(String[] args) {
		String name;
		int java, db, html, jsp, tot;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("Java 점수 : ");
		java = scan.nextInt();
		System.out.print("DB 점수 : ");
		db = scan.nextInt();
		System.out.print("HTML 점수 : ");
		html = scan.nextInt();
		System.out.println("JSP 점수 : ");
		jsp = scan.nextInt();
		scan.close();
		
		tot = java + db + html + jsp;
		avg = tot / 4.0;
		
		System.out.println("========================================================");
		System.out.println("이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("--------------------------------------------------------");
		System.out.println(name+"\t"+java+"\t"+db+"\t"+html+"\t"+jsp+"\t"+tot+"\t"+avg);
		System.out.println("========================================================");
		
		

	}

}
