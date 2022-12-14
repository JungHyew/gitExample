package ch16;

public class BankUse {
	public static void main(String[] args) {
		MyBank b=new MyBank();
		
		BankPlayer hong=new BankPlayer(1,b);
		BankPlayer sa=new BankPlayer(2,b);
		BankPlayer lee=new BankPlayer(3,b);
		
		hong.start();
		sa.start();
		lee.start();
	}

}
