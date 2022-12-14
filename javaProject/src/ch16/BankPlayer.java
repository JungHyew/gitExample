package ch16;

public class BankPlayer extends Thread {
	int type;
	MyBank mybank;
	
	public BankPlayer(int type,MyBank mybank) {
		this.type=type;
		this.mybank=mybank;
	}
	
	@Override
	public void run() {
		switch(type) {
		case 1  : mybank.moneyA(); break;
		case 2  : mybank.moneyB(); break;
		case 3  : mybank.moneyC(); break;
		}
	}

}
