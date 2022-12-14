package ch07;

public class RadioTest {

	public static void main(String[] args) {
		 Radio britz=new Radio();
		 System.out.println("[브리츠 라디오]");
		 britz.onOff=true;
		 britz.channel=89.1;
		 britz.volume=12;
		 britz.print();
		 
		 System.out.println();
		 
		 Radio iriver=new Radio();
		 System.out.println("[아이리버 라디오]");
		 iriver.onOff=false;
		 iriver.channel=95.1;
		 iriver.volume=9;
		 iriver.print();
		 
		 

	}

}
