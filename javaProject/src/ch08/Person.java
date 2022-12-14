package ch08;

public class Person {
	//멤버변수
	private String name; //"홍길동" //"추신수" //"박찬호" //"구자욱"  //다른 메모리로 각각 들어감
	private int height; //170 //190 //185 //175
	private int weight; //60 //100 //60 //72
	
	public Person() { //매개변수X => 기본생성자(default constructor)
		this("홍길동",170,60); //매개변수가 3개(String, int, int)
	}
	public Person(String name) { //매개변수가 1개인 생성자
		this(name,190,100); //매개변수가 3개 //name="추신수"
	}
	public Person(String name, int height) { //매개변수가 2개인 생성자
		this(name,height,70); //매개변수가 3개 //name="박찬호", height=185
	}
	public Person(String name, int height, int weight) { //매개변수 3개인 생성자
		//name="홍길동", height=170, weight=100이 들어간다
		//name="추신수", height=190, weight=70이 들어간다
		//name="박찬호", height=185 , weight=60이 들어간다
		//name="구자욱", height=175 , weight=72이 들어간다
		//다른 메모리에 각각 들어간다
		this.name=name; //지역변수의 값을 멤버변수에 대입
		this.height=height;
		this.weight=weight;
	}
	//출력용도
	public void showInfo() {
		System.out.println("===신상 정보===");
		System.out.println("이름 : "+name);
		System.out.println("신장 : "+height);
		System.out.println("체중 : "+weight);
	}

}
