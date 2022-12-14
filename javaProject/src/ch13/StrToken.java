package ch13;

import java.util.StringTokenizer;

public class StrToken {
	public static void main(String[] args) {
		String str="Kim,20,280,55,서울,학생"; //콤마로 구분자를 넣음
		
		//방법1 : 문자열을 특정 기호로 잘라서 구분
		String[] items=str.split(","); //콤마를 기준으로 데이터를 분리
		for(String s : items) {
			System.out.println(s);
		}
		
		//방법2 : StringTokenizer 사용
		StringTokenizer st=new StringTokenizer(str,",");
		int cnt=st.countTokens(); //토큰의 갯수
		System.out.println("토큰의 갯수 : "+cnt);
		while(st.hasMoreElements()) { //다음 토큰이 있을때까지 반복
			System.out.println(st.nextToken()); //토큰 하나를 가져와서 계속 반환처리(리턴)
		}
	}

}
