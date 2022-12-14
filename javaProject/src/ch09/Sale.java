package ch09;

public class Sale extends Product {
	private int price;
	private int amount;
	private int money;
	public void input(int code, String name, String company, String date,
			int price, int amount) {
		//부모의 private 처리된 멤버변수에 값을 초기화할때는 setter를 활용
		setCode(code);
		setName(name);
		setCompany(company);
		setDate(date);
		//자녀쪽은 private 처리되었어도 얼마든 변수에 직접 접근 가능
		this.price = price;
		this.amount = amount;
	}
	
	public void calc() {
		money=price*amount;
	}
	
	public void print() {
		System.out.println("코드\t제품명\t제조사\t제조일자\t단가\t수량\t금액(단위:천원)");
		System.out.println(getCode()+"\t"+getName()+"\t"+getCompany()+"\t"+getDate()+"\t"+
		price+"\t"+amount+"\t"+money);
	}
	

}
