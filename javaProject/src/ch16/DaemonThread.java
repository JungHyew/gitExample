package ch16;

//데몬 스레드는 보통 유닉스(리녹스) 운영체제에서 백그라운드로 동작하는 프로그램을 말한다
//데몬 스레드는 스레드에 데몬설정을 해서 쓴다. 윈도우에서는 서비스라고도 한다
//데몬 스레드는 일반스레드가 모두 종료되면 강제적으로 종료되는 특징을 가진다
public class DaemonThread implements Runnable {
	@Override
	public void run() {
		while(true) { //true면 무한반복
			System.out.println("데몬 스레드가 실행중입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break; //Exception발생시 while문 빠져나가도록
			}
		}
	} //run()
	
	public static void main(String[] args) {
		Thread th=new Thread(new DaemonThread());
		th.setDaemon(true); //데몬스레드로 설정된다(데몬설정)
		th.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인 스레드가 종료됩니다.");
	}
	
}
