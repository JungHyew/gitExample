package ch08;

class Circle{
	double radius;
	String color;
	public Circle(double r, String c) { //매개변수가 2개인 생성자 //r=10..0, c="빨강"
		//변수이름이 다르므로 this를 쓰지 않는다
		radius=r; //10.0 //5.0 //21.0 //3.5
		color=c; //"빨강" //"파랑" //"노랑" //"빨강"
	}
	public Circle(double r) { //매개변수가 1개인 생성자 //r=5.0
		radius=r;
		color="파랑";
	}
	public Circle(String c) { //매개변수가 1개인 생성자
		radius=21.0;
		color=c;
	}
	public Circle() { //기본생성자 //다른곳에서 호출하려면 만들어놔야된다
		radius=3.5;
		color="빨강";;
	}
	//출력용도
	public void print() {
		System.out.println("반지름 : "+radius);
		System.out.println("색깔 : "+color);
	}
}

public class CircleDemo {

	public static void main(String[] args) {
		Circle c1=new Circle(10.0,"빨강");
		c1.print();
		
		Circle c2=new Circle(5.0);
		c2.print();
		
		Circle c3=new Circle("노랑");
		c3.print();
		
		Circle c4=new Circle(); //기본생성자
		c4.print();
	}
	

}
