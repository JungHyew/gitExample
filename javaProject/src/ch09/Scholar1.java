package ch09;

public class Scholar1 extends Student1 {
	private String category; //장학금 종류
	private int money; //장학금액
	public void input(String name, String num, String major, int year,
			String category, int money) {
		super.input(name, num, major, year); //부모쪽
		this.category = category; //자녀쪽
		this.money = money; //자녀쪽
	}
	public void print() {
		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year+"\t"+category+"\t"+money);
	}
	public void print2() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year);
	}

}
