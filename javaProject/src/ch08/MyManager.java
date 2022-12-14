package ch08;

//싱글톤 기법
public class MyManager {
	private int score;
	
	private MyManager(int score) { //외부에서 호출안됨(private)
		this.score=score;
	}
	
	private static MyManager mgr; //참조변수 선언
	
	public static MyManager getInstance() { //static으로 입력된것은 class이름.객체이름? 으로 입력가능
		if(mgr==null) { //처음 MyManager가 객체화 될때
			mgr=new MyManager(10);
		}
		return mgr; //한번이상 객체가 생성되었다면(즉, 주소값이 있으면) 그 값을 리턴
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score=score;
	}

}
