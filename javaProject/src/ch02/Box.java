package ch02;

public class Box {

	public static void main(String[] args) {
		double h = 10.0;
		double v = 5.0;
	    double w, l;
		w = h * v;
		l = 2.0 * (h + v);
		
		System.out.println("사각형의 넓이 : " + w);
		System.out.println("사각형의 둘레 : " + l);

	}

}
