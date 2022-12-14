package ch16;

public class JoinExam {
	public static void main(String[] args) { //메인스레드는 우선권이 제일 높다
		MyThread3 thread=new MyThread3();
		thread.start(); //스레드 시작
		System.out.println("Thread가 종료될떄까지 기다립니다.");
		try {
			thread.join(); //해당 스레드가 종료될때까지 기다린다
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread가 종료되었습니다.");
	}

}
