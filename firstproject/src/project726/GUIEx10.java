package project726;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import project725.MFrame;

public class GUIEx10 extends MFrame {
	public GUIEx10() {
		JButton btn1 = new JButton("클릭"); //btn1 을 add(comp) comp자리에 넣을 수 있다.
		JLabel lbl1 = new JLabel("제목");
		this.add(lbl1,"North");
		//this.add(lbl1, new JButton()); // 이렇게 쓰는건 문법적으로 문제는 없지만 실행에는 문제. 
		//add(Component comp, Object constraints) 가 add의 문법.
		this.add(btn1); 
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new GUIEx10();
		
	}
}
