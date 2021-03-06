package project725;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIPractice {
	public static void main(String[] args) {
		JFrame f = new JFrame(); 
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setSize(500, 600);
		GridLayout gl = new GridLayout(1,2);
		
		JPanel pnl1 = new JPanel();
		JPanel pnl2 = new JPanel();
		
		pnl2.setLayout(gl);
		
	
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		btn1.setBackground(Color.RED);
		btn2.setBackground(Color.BLUE);
		
		btn1.setSize(70, 50);
		btn2.setSize(70, 50);
		
		pnl1.add(btn1);
		pnl1.add(btn2);
		
		pnl2.add(btn3);
		pnl2.add(btn4);
		
		f.add(pnl1,"North");
		f.add(pnl2,"South");
		
		f.setVisible(true);
	}
}
