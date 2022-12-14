package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutEx2 extends JFrame {
	//멤버변수
	JPanel jp; //JPanel 변수 선언
	JButton jb1,jb2,jb3,jb4,jb5,jb6; //버튼 변수 선언
	
	public FlowLayoutEx2() {
		super("FlowLayout 예제2");
		jp=new JPanel(); //패널생성
		jb1=new JButton("버튼 1"); //버튼생성
		jb2=new JButton("버튼 2");
		jb3=new JButton("버튼 3");
		jb4=new JButton("버튼 4");
		jb5=new JButton("버튼 5");
		jb6=new JButton("버튼 6");
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		
		//패널을 FlowLayout으로 설정
		//jp.setLayout(new FlowLayout()); //패널의 기본 레이아웃은 FlowLayout이기도 해서 생략가능하다
		
		add(jp,"South"); //JFrame의 "South"영역에 패널 배치
		add(jb5); //따로 배치해주지 않으면 자동으로 "Center"영역에 배치된다 ?
		setSize(600,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new FlowLayoutEx2();
	}
	
	
}
