package project725;

import javax.swing.JButton; //swing�ȿ� ���
import javax.swing.JFrame;

public class GUIEx4 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(null);//�⺻ ���̾ƿ��� ���ֹ���
		//null �� ���� ��ġ,ũ�⸦ �������־����.
	
		JButton btn = new JButton("��ư");
		btn.setSize(70, 50);
		btn.setLocation(0, 10);
		
		
		f.add(btn);
		
		
		f.setSize(300, 200);
		f.setVisible(true);
	}
}

// JFrame ������ Container ��� �ϴµ�, JFrame�� �ϳ��� �־���� JFrame�� JFrame�� ��ĥ��x
// JPanel �� JFrame�� ����� ������, ������ �� ���� ���� JFrame ���� �ٿ� �� �� ����.
// JPanel�� �⺻������ FlowLayout 
