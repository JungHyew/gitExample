package ch16;

public class MyBank {
	public synchronized void moneyA() {
		for(int i=1; i<=5; i++) {
			System.out.println("홍길동님의 통장잔고는 "+i*10+"만원입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void moneyB() {
		for(int i=1; i<=5; i++) {
			System.out.println("사임당님의 통장잔고는 "+(i+1)*10+"만원입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void moneyC() {
		for(int i=1; i<=5; i++) {
			System.out.println("이몽룡님의 통장잔고는 "+(i+2)*10+"만원입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
