/*package project81;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//	ActionListener = 클릭 이벤트 가지는 인터페이스 = 이걸 구현하면 클릭 이벤트 완성!!!!!!!!!!!!!!!!

public class ButtonEvent2 extends JFrame implements ActionListener { // implements 해서 listener가 내 자신안에 있게됨.
	JButton btn1,btn2;
	
	
ButtonEvent2(){// 여기에 실행 될 내용을 다 쓰면 된다.
	this.setLayout(new FlowLayout()); // 다른 곳에서 실행 할거면 필요 없는 부분.
	this.setSize(500, 300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JButton btn1 = new JButton("버튼1");
	JButton btn2 = new JButton("버튼2");
	this.add(btn1);
	this.add(btn2);
	btn1.addActionListener(this); //listener를 this로 변경
	btn2.addActionListener(this);
	this.setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			System.out.println("버튼1");
		}else if(e.getSource()==btn2) {//btn2을 누르면 {~} ~를 실행시켜라
			System.out.println("버튼2");
		}	
		
	}
}


오류
*/