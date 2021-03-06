package project82;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class GUITextField2 extends HFrame implements FocusListener{
	
	JTextField tf1, tf2;
	
	public GUITextField2() {
		super(new FlowLayout());
		tf1 = new JTextField(8);
		tf2 = new JTextField(8);
		tf1.setBackground(Color.WHITE);
		tf2.setBackground(Color.WHITE);
		tf1.addFocusListener(this);
		tf2.addFocusListener(this);
		this.add(tf1);
		this.add(tf2);
		this.setVisible(true);
	}

	@Override
	public void focusGained(FocusEvent e) { //포커스 잡혔을때
		JTextField tf = (JTextField) e.getSource(); //변수(tf) 줘서 형변환(JTextField로) 함
		// 내가 선택한 TextField 를 tf라고 해주기 위해서 위의 코드처럼 작성함
		tf.setBackground(Color.RED);
	}

	@Override
	public void focusLost(FocusEvent e) {
		JTextField tf = (JTextField) e.getSource(); //형변환
		tf.setBackground(Color.WHITE);
	}
	public static void main(String[] args) {
		new GUITextField2();
	}
}
