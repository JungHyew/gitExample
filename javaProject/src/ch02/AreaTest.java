package ch02;

public class AreaTest {

	public static void main(String[] args) {
		// 반지름이 5.0인 원의 면적을 계산
		double radius, area; //콤마를 활용
		radius = 5.0; //double이므로 5.0으로 하는것이 좋다.
		area = 3.141592 * radius * radius;
		System.out.println("원의 면적은 :" + area);
		
	}

}
