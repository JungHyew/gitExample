package ch16;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name); //타이틀 처리
	}
	@Override
	public void run() { //스레드 실행 메소드
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
