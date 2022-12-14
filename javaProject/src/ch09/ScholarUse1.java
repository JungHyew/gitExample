package ch09;

public class ScholarUse1 {

	public static void main(String[] args) {
		Scholar1 s1=new Scholar1(); //객체생성
		s1.input("김철수", "2203", "컴공", 1,"1종",2500000);
		s1.print();
		
		s1.input("홍길동", "2001", "사회", 3);
		s1.print2();

	}

}
