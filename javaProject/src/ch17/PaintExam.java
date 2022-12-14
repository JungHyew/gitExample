package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintExam extends JFrame {
	public PaintExam() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g); //JFrame의 paint()가 실행된다
		g.drawString("hello java", 10, 60); //drawString("문자열",x좌표,y좌표) : 그래픽인데 문자열 형태로 출력한다
		g.drawOval(30, 100, 50, 50);
		
		g.setColor(Color.blue); //색지정
		g.fillOval(100, 100, 50, 50); //바로 위에서 지정한 색을 도형 안에 채워준다
		
		g.setColor(Color.yellow);
		g.fillRect(200, 200, 60, 60);
		System.out.println("paint 호출 ...");
	}
	
	public static void main(String[] args) {
		new PaintExam();
	}

}
