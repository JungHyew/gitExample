package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListBook {
	public static void main(String[] args) {
		List<Book> list=new ArrayList<>();
		System.out.println("3건의 도서 자료를 입력하세요!");
		//Book 객체 생성
		Book b1=new Book();
		b1.input();
		Book b2=new Book();
		b2.input();
		Book b3=new Book();
		b3.input();
		
		//리스트에 Book 인스턴스 추가
		list.add(b1); //0번째(인덱스 번호)
		list.add(b2); //1번째
		list.add(b3); //2번째
		
		System.out.println("도서명\t출판사\t단가\t수량\t금액");
		for(int i=0; i<list.size(); i++) {
			Book b=list.get(i);
			System.out.println(b.getBookName()+"\t"+b.getPress()+"\t"+b.getPrice()
			+"\t"+b.getAmount()+"\t"+b.getMoney());
		}
	}

}
