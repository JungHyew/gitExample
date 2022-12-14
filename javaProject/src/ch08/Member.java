package ch08;

public class Member {
	private String name;
	private String id;
	private int price;
	private String grade;
	
	public Member() {
		this("홍길동","hong",120000);
	}
	
	public Member(String name, String id, int price) {
		this.name=name;
		this.id=id;
		this.price=price;
		if(price>=100000) {
			grade="gold";
		}else {
			grade="silver";
		}
	}
	public void print() {
		System.out.println("-----------------------------");
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println("-----------------------------");
		System.out.println(name+"\t"+id+"\t"+price+"\t"+grade);
	}

}
