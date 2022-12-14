package ch07;

//클래스 분리
public class Television {
	int channel; //채널
	int volume; //볼륨
	boolean onOff; //전원 상태
	void print() {
		System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
	}
	int getChannel() { //메소드 생성
		return channel; //channel값을 돌려받는다
	}
	void setChannel(int ch) {
		channel=ch; //channel은 ch의 값이다
	}

}
