package ch17;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEventColor extends JFrame {
	public MyEventColor() {
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton button1=new JButton("RED");
		JButton button2=new JButton("GREEN");
		JButton button3=new JButton("BLUE");
		JButton button4=new JButton("YELLOW");
		
		add(button1,"North");
		add(button2,"East");
		add(button3,"South");
		add(button4,"West");
		
		button1.addActionListener(new MyColorAction(this,Color.red));
		button2.addActionListener(new MyColorAction(this,Color.green));
		button3.addActionListener(new MyColorAction(this,Color.blue));
		button4.addActionListener(new MyColorAction(this,Color.yellow));
	}
	

}
