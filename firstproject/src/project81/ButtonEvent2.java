/*package project81;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//	ActionListener = Ŭ�� �̺�Ʈ ������ �������̽� = �̰� �����ϸ� Ŭ�� �̺�Ʈ �ϼ�!!!!!!!!!!!!!!!!

public class ButtonEvent2 extends JFrame implements ActionListener { // implements �ؼ� listener�� �� �ڽžȿ� �ְԵ�.
	JButton btn1,btn2;
	
	
ButtonEvent2(){// ���⿡ ���� �� ������ �� ���� �ȴ�.
	this.setLayout(new FlowLayout()); // �ٸ� ������ ���� �ҰŸ� �ʿ� ���� �κ�.
	this.setSize(500, 300);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JButton btn1 = new JButton("��ư1");
	JButton btn2 = new JButton("��ư2");
	this.add(btn1);
	this.add(btn2);
	btn1.addActionListener(this); //listener�� this�� ����
	btn2.addActionListener(this);
	this.setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			System.out.println("��ư1");
		}else if(e.getSource()==btn2) {//btn2�� ������ {~} ~�� ������Ѷ�
			System.out.println("��ư2");
		}	
		
	}
}


����
*/