package ch06;

public class StudentPoint {
	static int[] num= {1001,1002,1003};
	static String[] name= {"홍길동","사임당","이순신"};
	static int[] java= {90,95,84};
	static int[] db= {85,79,92};
	static int[] html= {99,88,95};
	static int[] jsp= {76,92,72};
	static int[] tot=new int[3];
	static double[] avg=new double[3];
	
	public static void caltot() {
		for(int i=0; i<num.length; i++) {
			tot[i]=java[i]+db[i]+html[i]+jsp[i];
		}
	}
	public static void calavg() {
		for(int i=0; i<num.length; i++) {
			avg[i]=tot[i]/4.0;
		}
	}
	
	public static void point() {
		System.out.println("-------------------------------------------------------------");
		System.out.println("학번\t이름\tJava\tDB\tHTML\tJSP\t총점\t평균");
		System.out.println("-------------------------------------------------------------");
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]+"\t"+name[i]+"\t"+java[i]+"\t"+db[i]+"\t"
		+html[i]+"\t"+jsp[i]+"\t"+tot[i]+"\t"+String.format("%.1f",avg[i]));
			
		}
		System.out.println("-------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		caltot();
		calavg();
		point();
	}

}
