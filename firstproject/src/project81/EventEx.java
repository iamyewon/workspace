package project81;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx extends JFrame implements ActionListener{
	JButton btn1,btn2,btn3;
	
	EventEx(){// ���⿡ ����� ������ �پ��� �ȴ�.
		this.setLayout(new FlowLayout());
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		btn1 = new JButton("Red");
		btn2 = new JButton("Blue");
		btn3 = new JButton("Green");
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		btn1.addActionListener(this);// ��ư�� �׼� ���̱�
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		this.setVisible(true);
	}

	//JFrame�� ��׶��� �÷��� ������ �ʾҴµ� 
	//JPanel�� ���� �����ӿ� ���̴��� 
	//getContentPane�� ���ָ� �ȴ�. (JFrame�� �г��� �ϳ� �������ִٰ�..?)
	
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
		new EventEx();//������ ȣ��
		
	}
}