package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
//MouseListener : 마우스 이벤트 처리를 위한 인터페이스
//MouseMotionListener : 마우스 이동 이벤트 처리를 위한 인터페이스
//KeyListener : 키보드 이벤트 처리를 위한 인터페이스

//다중상속
public class KeyMouseExam extends JApplet implements MouseListener,MouseMotionListener,KeyListener {
	private int x,y; //이미지를 출력할 x,y좌표값
	private int width, height; //가로, 세로 사이즈
	private Image img; //이미지 처리 객체
	private boolean flag=false; //이미지가 처음 실행할땐 안보이게 처리하기 위해
	
	@Override
	public void init() {
		setSize(500,500);
		//이미지를 불러오는 코드
		img=Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		//(***중요***)현재 클래스에 마우스 이벤트 기능을 추가
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		
		//키입력을 받을수 있도록 설정
		setFocusable(true);
		//현재 화면에 키 입력 요청
		requestFocus();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//이미지의 가로,세로 길이 계산
		width=img.getWidth(null); //초기화
		height=img.getHeight(null); //초기화
		System.out.println(width+", "+height);
		
		//drawImage(이미지,x,y,이미지관찰자(보통 this를 많이 쓴다))
		if(flag) { //만약 flag가 true면 이라는 뜻 //마우스를 클릭하면 true가 된다
			g.drawImage(img,x,y,this); //flag가 true면 이미지를 보이게 한다 ?
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//키를 입력하면 호출
	}

	//키가 눌려져있을때 호출
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode()); //키 코드값
		System.out.println(e.getKeyChar()); //키 문자값
		
		//max(값,값) 또는 min(값,값)은 앞에값과 뒤의값 중에서 최대값, 최소값 처리를 해줘야
		//이미지가 프레임 바깥으로 빠져나가지 않는다
		switch (e.getKeyCode()) { //키 코드값에 따라 분기시킨다
		case KeyEvent.VK_UP: //커서 키중에서 위쪽 키를 누르면
			y=Math.max(0, y-5); break;
		case KeyEvent.VK_DOWN: //아래쪽 키를 누르면
			y=Math.min(500-height, y+5); break;
		case KeyEvent.VK_LEFT: //왼쪽 키를 누르면
			x=Math.max(0, x-5); break;
		case KeyEvent.VK_RIGHT: //오른쪽 키를 누르면
			x=Math.min(500-width, x+5); break;
		}
		repaint(); //그래픽 갱신요청
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	//컴퍼넌트상에서 mouse 버튼을 누른 상태에서 드래그했을때 호출
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse drag : x : "+x+", y : "+y);
	}

	//마우스 커서가 컴퍼넌트 상에 이동했지만 버튼이 작동하지 않은 경우에 호출(버튼 누르지 않고 왔다갔다 할때)
	@Override
	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		System.out.println("mouse move : x : "+x+", y : "+y);
		repaint();
	}

	//컴퍼넌트상에서 마우스 버튼을 이미지에서 클릭(눌렀다가 놓을때)했을때에 호출된다
	@Override
	public void mouseClicked(MouseEvent e) { //마우스를 클릭하면 flag가 true가 되게 만든다
		flag=true; //클릭할때 true처리(이미지가 보이게 한다)
		//마우스 클릭한 좌표 저장
		x=e.getX(); //x좌표값 저장
		y=e.getY(); //y좌표값 저장
		//그래픽 갱신 요청 => paint() 자동호출
		repaint();
	}

	
	@Override
	public void mousePressed(MouseEvent e) {
		//컴퍼넌트상에서 마우스 버튼을 이미지에서 클릭(누를때)했을때에 호출된다
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//마우스 버튼을 완전히 놓은 이후에 호출
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//마우스가 컴퍼넌트에 들어갔을때에 호출
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//마우스가 컴퍼넌트를 종료하면 호출
	}
	

}
