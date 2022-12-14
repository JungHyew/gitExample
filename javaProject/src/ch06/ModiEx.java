package ch06;
//패키지가 ch06으로 달라짐

public class ModiEx {
	//접근제어지정자(Access Modifier)
	//public : 모든 위치에서 참조 가능
	//protected : 같은 패키지에서 사용 가능, 다른패키지라도 상속관계가 있을 경우 사용 가능
	//default : 같은 패키지내에서만 사용 가능(but 실제로 default라고 작성하면 안됨)
	//private : 해당 클래스 내부에서만 사용 가능
	protected String name="Kim";

}
