package ch07;

import ch06.ModiEx; //ch06에 있는 ModiEx 가져온다

public class ModiExUse extends ModiEx {
	//상속관계를 자세히 다를예정
	//상속관계에 있어서 부모클래스(ModiEx)가 아닌 자식클래스(ModiExUse)를 인스턴스화 해야됨

	public static void main(String[] args) {
		ModiExUse me=new ModiExUse();
		System.out.println(me.name);
	}
}
