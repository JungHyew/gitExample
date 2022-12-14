package ch13;

public class StrBuildEx {
	public static void main(String[] args) {
		String str1="I am a ";
		String str2="Java Programmer";
		
		StringBuilder s=new StringBuilder();
		s.append(str1);
		s.append(str2);
		
		System.out.println("--------------------------------------------");
		System.out.println("append()메소드를 활용 : "+s);
		s=s.replace(7, 11, "JSP");
		System.out.println("replace()메소드를 활용 : "+s);
		System.out.println("substring()을 활용 : "+s.substring(7));
		System.out.println("--------------------------------------------");
	}

}
