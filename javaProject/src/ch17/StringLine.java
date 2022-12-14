package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

//JApplet은 Applet의 확장판으로 1995년에 처음 소개됨
//애플릿뷰어나 웹브라우저와 함께 쓰였으며 게임 및 다양한 그래픽을 구사할 수 있다
//현재는 HTML5등 웹이 진화되면서 거의 활용되지 않는다
//라이프 사이클을 가지고 있다. init()-start()-stop()-destroy()
//init()은 필수처리이며 나머지는 자동으로 처리가 된다

public class StringLine extends JApplet {
	@Override
	public void init() { //애플릿을 초기화하는 코드
		getContentPane().setBackground(new Color(255,255,255)); //배경색상 설정
		setSize(500,500); //애플릿의 화면 사이즈
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		//선그리기(x1,y1,x2,y2)
		g.drawLine(250, 50, 30, 160); //g.drawLine(x1,y1,x2,y2)
		
		g.setColor(Color.red);
		g.drawString("Red string", 10, 50); //빨간색의 "Red string" 글씨가 나온다
		
		g.setColor(Color.green);
		g.drawString("Green string", 10, 80);
		
		g.setColor(Color.blue);
		g.drawString("Blue string", 10, 110);
	}
}

//글자 깨짐현상 해결방법
//왼쪽 파일에서 마우스 우버튼->Properties->Run/Debug settings에 있는거 더블클릭->
//Arguments의 VM Arguments에 -Dfile.encoding=MS949 작성
