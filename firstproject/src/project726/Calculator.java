package project726;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator{
	public static void main(String[] args) {
	JFrame jf = new JFrame();
	jf.setSize(500, 600);
	jf.setLayout(new GridLayout(0,1,0,0));
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	JPanel text = new JPanel();
//	text.setLayout(null);
	JTextField jtf = new JTextField();
	jtf.setPreferredSize(new Dimension(400, 100));
//	jtf.setLocation(50, 100);
	text.add(jtf);
	
	
	JPanel pad = new JPanel();
	pad.setLayout(new GridLayout(4,4,2,2));
	
	 
	 String buttonNames[] = {"7","8","9","+","6","5","4","-","3","2","1","*","C","0","=","/"};
	 JButton buttons[] = new JButton[buttonNames.length];
	 
	 for (int i = 0; i < buttonNames.length; i++) {
			buttons[i] = new JButton(buttonNames[i]);
			//??ư ??
			if ((i == 13) ||(i >= 0 && i <= 2) || (i >= 4 && i <= 6) || (i >= 8 && i <= 10)) buttons[i].setBackground(Color.WHITE);
			else buttons[i].setBackground(Color.GRAY);
	 
	 pad.add(buttons[i]);
	 
	 jf.add(text);
	 jf.add(pad);
	 jf.setVisible(true);
	}
	}
}
