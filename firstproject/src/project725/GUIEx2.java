package project725;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		//BorderLayout�� �ٲ��ٰ���
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl); // JFrame �� Layout �� �ٲ��.(�����ȴ�.)
		
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		
		//Flow�� �˾Ƽ� ũ�⸸ŭ ���η� ��ġ�ϴٰ� �Ѿ�� �����ٷ� �Ѱܼ� ��ġ��
		
		
		
		f.setSize(300, 200);
		f.setVisible(true);
	}
}