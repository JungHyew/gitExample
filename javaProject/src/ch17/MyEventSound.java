package ch17;

import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class MyEventSound extends JApplet implements ActionListener {
	private AudioClip audio;
	private JButton play, stop, loop;
	
	@Override
	public void init() {
		setLayout(new FlowLayout());
		audio=getAudioClip(getClass().getResource("sound.wav"));
		play=new JButton("PALy");
		stop=new JButton("STOP");
		loop=new JButton("LOOP");
		add(play);
		add(stop);
		add(loop);
		
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bt=(JButton)e.getSource();
		System.out.println(e.getSource());
		if(bt==play) {
			audio.play();
		}else if(bt==stop) {
			audio.stop();
		}else if(bt==loop) {
			audio.loop();
		}
	}
	

}
