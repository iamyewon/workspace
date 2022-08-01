package project81;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent {
	public static void main(String[] args) { // ������ �ٸ������� ȣ��x �ڱ��ڽſ�����.. ������ �׽�Ʈ�� ����.. ����Ŭ������� ���ο� ��������.
		JFrame frame = new JFrame(); // ������ ��� �ȴ�. ������ �����ϴ� ������ ���°� 
		frame.setLayout(new FlowLayout()); // �ٸ� ������ ���� �ҰŸ� �ʿ� ���� �κ�.
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		frame.add(btn1);
		frame.add(btn2);
		
		//�������̽��� �����Ϸ��� ������ ���ÿ� ������ �ۼ��ؾ� �Ѵ�. implements�� �Ƚ��� ���⼱ 
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { //e�� ������ư�� ���ȴ��� ���
				if(e.getSource()==btn1) { //btn1�� ������ {~} ~�� ������Ѷ�
					System.out.println("��ư1");
				}else if(e.getSource()==btn2) {//btn2�� ������ {~} ~�� ������Ѷ�
					System.out.println("��ư2");
				}				
			}
		};
		btn1.addActionListener(listener); //��ư�� �׼� ���̱�.
		btn2.addActionListener(listener);
		
		frame.setVisible(true);
	}
}