package project81;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx extends JFrame implements ActionListener{
	JButton btn1,btn2,btn3;
	
	EventEx(){// 여기에 실행될 내용을 다쓰면 된다.
		this.setLayout(new FlowLayout());
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		btn1 = new JButton("Red");
		btn2 = new JButton("Blue");
		btn3 = new JButton("Green");
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		btn1.addActionListener(this);// 버튼에 액션 붙이기
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		this.setVisible(true);
	}

	//JFrame에 백그라운드 컬러가 먹히지 않았는데 
	//JPanel을 만들어서 프레임에 붙이던가 
	//getContentPane을 써주면 된다. (JFrame은 패널을 하나 가지고있다고..?)
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			this.getContentPane().setBackground(Color.RED);			 
			System.out.println("ok");
		}else if(e.getSource()==btn2) {
			this.getContentPane().setBackground(Color.BLUE); 
		}else if(e.getSource()==btn3) {
			this.getContentPane().setBackground(Color.GREEN); 
		}
	}
	public static void main(String[] args) {
		new EventEx();//생성자 호출
		
	}
}
