package ch06;

public class VariantParam {
	
	public static void main(String[] args) {
		print("Java");
		print("Java","program");
		print("Java","program","jsp");
		print("Java","program","jsp","big","data");
	}

	static void print(String ...n) { //n이 가변형 매개변수 //...을 쓰면 몇 개를 쓰던 알아서 만들어준다
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
	}
	
//	static void print(String a) {
//		System.out.println(a);
//	}
//	
//	static void print(String a, String b) {
//		
//	}
//
//	static void print(String a, String b, String c) {
//		
//	}
//
//	static void print(String a, String b, String c, String d, String e) {
//		
//	}

	
	
}
