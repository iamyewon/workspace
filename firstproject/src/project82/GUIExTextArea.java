package project82;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIExTextArea extends HFrame implements ActionListener{
	JTextArea ta;
	JTextField tf;
	JButton btn;
	
	public GUIExTextArea() {
		ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta); //스크롤바
		ta.setEditable(false); // ta에 직접적 입력 불가 --> 수정 금지 ! 
		
		tf = new JTextField();
		btn = new JButton("클릭");
		btn.addActionListener(this);
		
		this.add(tf,"North");
		this.add(sp); //스크롤 패널에 ta를 붙이고 스크롤 패널을 프레임에 붙였음.
		//그냥 textarea는 스크롤 생기지 않음.
		this.add(btn,"South");
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GUIExTextArea();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ta.append(tf.getText()+"\n");  // \n 은 엔터  // append는 쉽게 글씨를 붙여넣을 수 있음.
		
	}

}
