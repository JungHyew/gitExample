package ch08;

public class PersonUse {

	public static void main(String[] args) {
		Person p1=new Person(); //객체 생성겸 기본생성자 호출
		p1.showInfo();
		
		Person p2=new Person("추신수"); //인스턴스화 //Person(String)형태의 생성자를 호출
		p2.showInfo();
		
		Person p3=new Person("박찬호",185); //Person(String, int)형태의 생성자를 호출
		p3.showInfo();
		Person p4=new Person("구자욱",175,72); //Person(String, int, int)형태의 생성자를 호출
		p4.showInfo();

	}

}
