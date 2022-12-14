package ch16;

public class MyThread_Im implements Runnable {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+i);
		}
	}
}
