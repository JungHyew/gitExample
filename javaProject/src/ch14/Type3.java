package ch14;

public class Type3<T> { //자료형이 미정인 상태<아무문자나> //<T> : 제너릭 기호 ?
	T t; //변수도 자료형 미정
	
	public Type3() {
		//만약 생성자 처리를 하고자 한다면 <T>를 빼고 처리한다
	}
	public Type3(T a) {
		
	}
	public void setT(T t) { //메소드도 자료형 미정
		this.t=t;
	}
	public T getT() {
		return t;
	}
	
	public static void main(String[] args) {
		//인스턴스를 생성할 때 자료형을 결정함 => 제너릭(일반화)이라 함
		Type3<String> t=new Type3<String>(); //여기서 자료형을 정해준다
		t.setT("Hello");
		System.out.println(t.getT());
		
		Type3<Integer> t2=new Type3<Integer>();
		t2.setT(100);
		System.out.println(t2.getT());
		
		Type3<Double> t3=new Type3<Double>()200.5; //생성자 매개변수 활용
		//t3.setT(100.1);
		System.out.println(t3.getT());
	}

}
