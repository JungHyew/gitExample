package ch16;

//멀티스레드 : 작업단위가 2개 이상
//멀티스레드를 구현하는 방법
//1) Thread를 상속
//2) Runnable을 구현

public class ThreadExam extends Thread {
	public ThreadExam(String name) {
		super(name); //부모생성자(Thread) 호출, 타이틀 처리
	}
	
	//스레드 실행 메소드
	@Override
	public void run() { //반드시 오버라이딩 함 //run은 Thread의 추상 메소드
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()); //현재 실행중인 스레드 이름 출력
		}
		try {
			Thread.sleep(1000); //cup의 실행을 1초간 멈춤(필수예외처리 해야됨)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ThreadExam e1=new ThreadExam("thread1"); //nonstatic이므로 객체생성
		ThreadExam e2=new ThreadExam("thread2");
		ThreadExam e3=new ThreadExam("thread3");
		
		e1.start(); //스레드.start() ==> run()이 자동 호출됨
		e2.start(); //위와 동시에 호출
		e3.start(); //위와 동시에 호출, 즉 여기선 3개가 동시에 run() 호출함
		//동시에 호출되었기 때문에 순서는 섞여서 나온다
		//실행순서는 그때그때마다 다르다(JVM이 임의로 우선순위를 정해준다)
		//e1.run(); //run()을 호출하면 메인 스레드 실행되기 떄문에 주의해야 한다
	}

}
