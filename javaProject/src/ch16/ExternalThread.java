package ch16;

//스레드 기능을 외부클래스에서 구현
public class ExternalThread {
	public static void main(String[] args) { //스레드
		MyThread t1=new MyThread("thread1");
		MyThread t2=new MyThread("thread2");
		MyThread t3=new MyThread("thread3");
		
		t1.start(); //run() 메소드 호출
		t2.start();
		t3.start();
		
		System.out.println("메인 스레드"); //제일 먼저 실행된다
		//다른 스레드가 run을 하는 시점에 메인스레드의 내용도 있으면 메인스레드부터 시작되는 현상이 있다
	}

}
