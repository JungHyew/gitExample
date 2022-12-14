package ch06;

public class AbsEx {
	public static int abs(int num) { //return값이 있다 //num=-15
		return num>0 ? num : -num; //3항연산식(조건식 ? true : false) //return값이 있으므로 return 작성
	}
	
	public static void main(String[] agrs) {
		int a=-15;
		System.out.println(a);
		System.out.println(abs(a));
		System.out.println(Math.abs(a));
	}

}
