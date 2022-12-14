package ch16;

public class MyThread1 extends Thread {
	String str;
	public MyThread1(String str) {
		this.str=str;
	}
	
	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.print(str);
			try {
				Thread.sleep((int)(Math.random()*1000)); //random으로 시간 초단위 다르게 설정
				//1초마다가 아닌 랜덤으로 초 시간이 설정된다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
