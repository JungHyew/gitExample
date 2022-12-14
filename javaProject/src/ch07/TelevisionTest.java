package ch07;

//클래스 분리
public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television(); //객체 생성(인스턴스화) //다른 클래스에 있는 메소드 가져옴
		//System.out.println(tv);
		tv.channel=7; //tv=>인스턴스화된 Television 메모리의 주소값으로 접근
		tv.volume=9;
		tv.onOff=true; // boolean 타입
		System.out.println("텔레비전의 채널은 "+tv.channel+"이고 볼륨은 "+tv.volume+"입니다.");

	}

}
