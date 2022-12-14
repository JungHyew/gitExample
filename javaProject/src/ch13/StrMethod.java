package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1="java";
		str1 += " programming"; //str1=str1+" programming"
		//문자열 연결이지만 실제로는 새로운 문자열을 만들고 str1은 새로운 문자열의 주소값을 가리키게 된다
		System.out.println(str1);
		System.out.println(str1.length()); //문자열의 길이
		String str2=str1.concat(" programming"); //concat()으로도 문자열 연결가능
		//str1+" programming"
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.charAt(2)); //charAt(n) : n번째 문자 추출
		System.out.println(str2.indexOf("program")); //"program"의 시작문자열인 p문자의 위치
		System.out.println(str2.indexOf("z")); //찾고자 하는 문자가 없으면 -1을 리턴한다
		System.out.println(str2.substring(0, 4)); //substring(start,end-1) =>즉, 0~3까지 추출
		System.out.println(str2.substring(5)); //5번째 부터 끝까지 추출
		System.out.println(str2.replace("java", "jsp")); //java=>jsp 로 변경
		System.out.println(str2);
		
		String str3="38392607297";
		System.out.println(str3.substring(5, 9));
		System.out.println(str3.replace(str3.substring(5, 9), "****"));
	}

}
