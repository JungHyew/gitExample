package ch17;

import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class Sound extends JApplet implements ActionListener {
	private AudioClip audio; //사운드처리 객체
	private JButton play,stop,loop;
	
	@Override
	public void init() {
		//화면 레이아웃 설정(애플릿의 기본 레이아웃은 BorderLayout)
		setLayout(new FlowLayout()); //FlowLayout으로 변경
		audio=getAudioClip(getClass().getResource("dingdong.wav")); //dingdong 파일 가져온다
		//버튼을 애플릿에 추가
		play=new JButton("PLAY");
		stop=new JButton("STOP");
		loop=new JButton("LOOP");
		add(play);
		add(stop);
		add(loop);
		
		//버튼을 클릭하면 이벤트 기능 추가
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
	}
	

	//버튼을 클릭하면 자동을 실행되는 코드
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn=(JButton)e.getSource(); //getSource()는 Object 타입이라 좌변과 맞추기 위해 형변환
		System.out.println(e.getSource());
		if(btn==play) {
			audio.play(); //원래 있던 메소드 불러온다
		}else if(btn==stop) {
			audio.stop();
		}else if(btn==loop) {
			audio.loop();
		}
	}
}
