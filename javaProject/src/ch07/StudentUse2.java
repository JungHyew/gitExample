package ch07;

public class StudentUse2 {

	public static void main(String[] args) {
		Student2 s2=new Student2(); //객체생성
		s2.input("이순신", "컴공", 1, "202202", 3.8, 500); //데이터 입력
		s2.print(); //데이터 출력
		System.out.println(s2);
	}

}
