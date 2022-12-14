package ch16;

public class ThreadA {
	
	public static void main(String[] args) {
		ThreadB b=new ThreadB();
		b.start(); //run호출
		
		synchronized (b) { //ThreadB 객체에 대해 동기화 설정
			System.out.println("b가 완료될때까지 기다립니다.");
			try {
				b.wait(); //main 스레드가 ThreadB에게 자신은 wait(일시정지)하겠다고 말한다
				//즉, wait()은 모니터링 락을 풀고 다른 스레드에서 notify(All)을 호출해주기를 기다린다
				//notify에 도착하면 일시정지 상태에서 풀려나 실행을 이어 나간다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is : "+b.total);
		}
		
	}

}

class ThreadB extends Thread{
	int total;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<5; i++) {
				System.out.println(i+"를 더합니다.");
				total+=i;
				try {
					Thread.sleep(500); //0.5초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} //for
			notify(); //wait하고 있는 스레드를 깨운다
		}
	}
}