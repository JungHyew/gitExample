package ch15;

public class NegativeEx {
	public static void main(String[] args) {
//		try {
//			int arr[]=new int[3];
//			arr[3]=20;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		
		try {
			int arr[]=new int[-10];
			//배열의 크기를 음수로 제시할때
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
