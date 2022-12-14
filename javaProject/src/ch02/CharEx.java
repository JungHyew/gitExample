package ch02;

public class CharEx {

	public static void main(String[] args) {
		// 역슬래쉬u : 유니코드로 쓰겠다는 의미, 유니코드 0041은 대문자 A이다.
		char aValue = '\u0041';
		System.out.println("char형('\u0041') : " + aValue); //\u0041은 A로 해석되어 출력되어진다.
		
		char bValue = '\u0041'; 
		System.out.println("char형(\'\\u0041\') : " + bValue); //\u0041이 A로 출력되는 것을 막기 위해 역슬래쉬 더 붙인다.
		// \' = single quote를 표현 ex) \'를 쓰면 '가 출력되어진다.
		// \\ = 역슬래쉬(BackSlash)를 표현 ex) \\를 쓰면 \가 출력되어진다.
		// 즉, 뒤에 내용을 살리기 위해 역슬래쉬를 앞에 하나 더 붙인다.
		// 유니코드 변환기 : http://huskdoll.tistory.com/39

	}

}

