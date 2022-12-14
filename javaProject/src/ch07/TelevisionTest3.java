package ch07;

public class TelevisionTest3 {

	public static void main(String[] args) {
		Television myTv=new Television(); //객체생성
		myTv.channel=7;
		myTv.volume=9;
		myTv.onOff=true;
		myTv.print(); //메소드 호출
		
		Television yourTv=new Television(); //위와는 다른 메모리에 값들이 저장된다
		yourTv.channel=9;
		yourTv.volume=12;
		yourTv.onOff=true;
		yourTv.print();

	}

}
