package ch11;

public class AbstractExtends extends AbstractClass {

	//오버라이딩은 부모쪽에 있는 미완성된 메소드를 구현한다는 의미도 포함
	//부모쪽에서 method1이 구현부가 없기 떄문에 자식에서 구현해줘야 된다
	@Override
	void method1() { //중괄호가 있으면 구현한것
		System.out.println("추상 method를 완성한 method");
	}
    public static void main(String[] args) {
    	//주의점 : 추상메소드가 있는 추상클래스, 인터페이스이건 new를 통해서 인스턴스화 할 수 없다.
    	//즉, 스스로 객체생성이 안된다
 //   	AbstractExtends a=new AbstractClass(); //추상클래스는 인스턴스(객체생성)를 생성할 수 없다
		AbstractExtends ex=new AbstractExtends();
		ex.method1();
		ex.method2();
	}

}
