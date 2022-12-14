package ch13;

public class Append {
	public static void main(String[] args) {
		//불변(immutable) //계속해서 메모리를 생성한다
		String a="hello";
		System.out.println(System.identityHashCode(a));
		a=a+"java"; //+ : 문자열 연결
		System.out.println(a);
		System.out.println(System.identityHashCode(a));
		
		System.out.println("===가변형 StringBuilder===");
		//가변형(mutable) //같은 메모리를 사용하면서 내용만 바뀐다
		StringBuilder b=new StringBuilder();
		System.out.println(System.identityHashCode(b));
		b.append("java");
		System.out.println(b);
		System.out.println(System.identityHashCode(b));
	}

}
