package ch11;

public class Slnfo implements Student {

	@Override
	public void address() {
		System.out.println("=============================================");
		System.out.println("이름\t주소\t이메일");
		System.out.println(NAME+"\t"+ADRESS+"\t"+EMAIL);
		System.out.println("---------------------------------------------");
	}

	@Override
	public void point() {
		int TOT=KOR+ENG+MAT;
		double AVG=(double)(TOT/3.0);
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(NAME+"\t"+KOR+"\t"+ENG+"\t"+MAT+"\t"+TOT+"\t"
		+String.format("%.1f", AVG));
		System.out.println("=============================================");
	}

}
