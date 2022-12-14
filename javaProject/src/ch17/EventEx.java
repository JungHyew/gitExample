package ch17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventEx extends Frame implements WindowListener {
	
	public EventEx() {
		addWindowListener(this); //WindowListener를 상속받아 쓰면 (this)로도 사용가능하다
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventEx();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0); //이걸 안쓰면 창이 닫히지 않는다
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	


}
