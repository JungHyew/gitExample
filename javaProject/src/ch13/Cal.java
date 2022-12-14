package ch13;

import java.sql.Date;
import java.util.Calendar;

public class Cal {
	
	public static void main(String[] args) {
		//Calendar 인스턴스 생성은 new로 만들지 않는다
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); //month는 반드시 +1 해줘야된다(0부터 시작해서)
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR)); //12시간제
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); //24시간제
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.AM_PM)); //오전인지 오후인지(오전:0,오후:1)
		//오전, 오후 한글로 표시
		if(cal.get(Calendar.AM_PM)==0) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
		}
		//1년중 몇 번째 날인가
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		//월의 몇 번째 날인가
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		//요일
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //1:일,2:월,3:화,...
		//요일 한글화 하기
		String yoil="";
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1 : yoil="일요일"; break;
		case 2 : yoil="월요일"; break;
		case 3 : yoil="화요일"; break;
		case 4 : yoil="수요일"; break;
		case 5 : yoil="목요일"; break;
		case 6 : yoil="금요일"; break;
		case 7 : yoil="토요일"; break;
		}
		System.out.println("오늘은 "+yoil+"입니다.");
		//1년중 몇번째 주
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		
		Date date=cal.getTime();
		System.out.println(date.getYear()+1900); //더이상 사용하지 말라고 줄이 그어짐
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());
	}

}
