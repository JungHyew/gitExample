package ch09;

public class BookSaleUse {

	public static void main(String[] args) {
		BookSale b1=new BookSale();
		//부모클래스의 멤버호출
		b1.setBookName("Java");
		b1.setPress("길벗");
		b1.setAuthor("김철수");
		b1.setYear(2022);
		b1.setPrice(30000);
		
		//자식클래스의 멤버호출
		b1.setAmount(500);
		b1.setMoney();
		b1.setRank(1);
		b1.print();

	}

}
