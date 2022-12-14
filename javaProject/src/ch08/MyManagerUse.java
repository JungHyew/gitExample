package ch08;

public class MyManagerUse {

	public static void main(String[] args) {
		MyManager mgrobj=MyManager.getInstance();
		System.out.println(mgrobj);
		System.out.println("mgrobj.getScore() : "+mgrobj.getScore());
		mgrobj.setScore(100);
		System.out.println("mgrobj.getScore() : "+mgrobj.getScore());
		
		//2)두번째 생성 및 호출
		MyManager newobj=MyManager.getInstance();
		System.out.println(newobj); //위와 주소값이 똑같다(=싱글톤) //주소값을 공유한다
		System.out.println("newobj.getScore() : "+newobj.getScore());
	}

}
