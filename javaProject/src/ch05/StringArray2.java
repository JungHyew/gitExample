package ch05;

public class StringArray2 {

	public static void main(String[] args) {
		String[] str= {"Java","DB","JSP","HTML"};
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		//향상된 for문으로 처리해보세요
		//for(데이터 타입 개별변수:집합변수){}
		for(String aa : str) { //내부적으로 카운팅기능, 배열길이값을 계산하는 기능이 있다
			System.out.println(aa);
		}

	}

}
