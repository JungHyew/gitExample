package ch12;

import java.awt.Frame; //GUI 전용 클래스
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//Frame : 윈도우 창을 띄워주는 클래스

//무명내부클래스를 주로 사용하는 프로그램인 GUI 프로그램
public class InnerExam extends Frame {
	public InnerExam() { //기본생성자
		super("내부 클래스 테스트"); //부모생성자 호출겸 제목처리
		setSize(300,400); //프레임의 기본 가로, 세로 초기사이즈 설정
		setVisible(true); //프레임을 화면에 표시
	}
	public static void main(String[] args) {
		InnerExam e=new InnerExam();
		e.addWindowListener(new WindowListener() { //무명내부클래스
			
			@Override
			public void windowOpened(WindowEvent e) {
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
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
