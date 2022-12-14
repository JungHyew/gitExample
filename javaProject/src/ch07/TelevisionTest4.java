package ch07;

public class TelevisionTest4 {

	public static void main(String[] args) {
		Television myTv=new Television(); //객체생성
		myTv.channel=7;
		myTv.volume=9;
		myTv.onOff=true;
		int ch=myTv.getChannel(); //7 getChannel은 channel값을 돌려받는것이므로 channel값과 동일하다
		System.out.println("현재 채널은 "+ch+"입니다.");
	}

}
