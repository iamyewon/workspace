package project726;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import project725.MFrame;

public class GUIEx10 extends MFrame {
	public GUIEx10() {
		JButton btn1 = new JButton("Ŭ��"); //btn1 �� add(comp) comp�ڸ��� ���� �� �ִ�.
		JLabel lbl1 = new JLabel("����");
		this.add(lbl1,"North");
		//this.add(lbl1, new JButton()); // �̷��� ���°� ���������� ������ ������ ���࿡�� ����. 
		//add(Component comp, Object constraints) �� add�� ����.
		this.add(btn1); 
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new GUIEx10();
		
	}
}