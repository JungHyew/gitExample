package ch08;
//생성자(COnstructor) 코딩 특징 :
//개발자가 생성자를 만드는것에 개입을 안하면 컴파일러는 자동으로 기본생성자를 만들지만
//매개변수가 있는 생성자를 단 하나라도 만든다면 컴파일러는 더 이상 기본생성자를 만들지 않는다
//그래서 이때 기본생성자를 만들지 않으면 호출이 되지 않는다
public class Calculator {
	//멤버변수
	private int left;
	private int right;
	//기본생성자(원래는 만들어줘야되지만 컴퓨터가 눈에 보이지 않게 만들어줬었음)
	public Calculator() {
		System.out.println("기본생성자 호출...");
	}
	//매개변수가 있는 생성자
	public Calculator(int left, int right) {
		System.out.println("매개변수가 있는 생성자 호출...");
		this.left = left; //오른쪽의 지역변수 left를 왼쪽의 this.left에 저장한다
		this.right = right;
	}
	//getter, setter
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public void sum() {
		System.out.println(left+right);
	}
	public void avg() {
		System.out.println((left+right)/2);
	}

}
