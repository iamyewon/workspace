package project719;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuiEx1 { // ���� - ���� ���α׷�  / ������ �¶������α׷�
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // â�ϳ� �����
		frame.setSize(500, 500); // ũ�� ����
		
		JPanel pnl = new JPanel(); //�г� �����
		pnl.setBackground(Color.RED); //�г� ���� ������
		
		JButton btn = new JButton("click"); //��ư �����
		pnl.add(btn); // ������� ��ư�� �гο� ���̱�
				
		frame.add(pnl); // �����ӿ� �г��� ���̱�. 		
		frame.setVisible(true); // ȭ�鿡 ǥ���ϱ� 
		
		//ȭ�� ����(ǥ��?)�� �������� �ϸ� ����.
	}
}
	