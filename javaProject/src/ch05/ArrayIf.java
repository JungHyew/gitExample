package ch05;

public class ArrayIf {

	public static void main(String[] args) {
		//arr은 배열참조변수
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		System.out.println(arr); //arr은 데이터가 아닌, 데이터가 있는 메모리의 주소값을 기억한다
		if(arr != null) { //arr의 주소번지가 null, 즉 주소값이 없는게 아니라면(=주소값 있으면)
			for(int i=0; i<10; i++) {
				System.out.println(arr[i]+",");
				
			}
		}

	}

}
