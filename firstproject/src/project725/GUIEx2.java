package project725;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		//BorderLayout을 바꿔줄것임
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl); // JFrame 의 Layout 이 바뀐다.(설정된다.)
		
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		
		//Flow는 알아서 크기만큼 가로로 배치하다가 넘어가면 다음줄로 넘겨서 배치함
		
		
		
		f.setSize(300, 200);
		f.setVisible(true);
	}
}
