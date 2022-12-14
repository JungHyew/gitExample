package ch09;

public class Student1 {
	//멤버변수
	String name;
	String num; //학번
	String major; //전공
	int year; //학년
	public Student1() {  } //기본생성자
	public void input(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	

}
