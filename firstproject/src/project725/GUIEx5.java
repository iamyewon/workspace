package project725;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIEx5 {
	public static void main(String[] args) {
		JFrame f = new JFrame(); //BorderLayout
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x������ ������ �ƿ� ����� , ������ ���������ʿ�x
		f.setLayout(null);
		f.setSize(500, 500);
		
		JPanel p = new JPanel(); //JFrame ����� ���� ������Ʈ
		// ���� ������ �����̳�(���⿡ ���� add �� �� �ִٴ� ��)
		// �ܵ����� ����� �ȵǹǷ� �ᱹ�� JFrame�� �ٿ��� ��밡���ϴ�.
		
		p.setSize(500, 200);
		p.setLocation(0, 300);
	
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		btn1.setSize(70, 50);
		btn2.setSize(70, 50);
		
		p.add(btn1);
		p.add(btn2);
		
		f.add(p);
		f.setVisible(true);
		
		
		
		
		
	}
}
//JFrame ������ Container ��� �ϴµ�, JFrame�� �ϳ��� �־���� JFrame�� JFrame�� ��ĥ��x
//JPanel �� JFrame�� ����� ������, ������ �� ���� ���� JFrame ���� �ٿ� �� �� ����.
//JPanel�� �⺻������ FlowLayout 