package project726;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class AButton extends JButton {
	
	// ��ü start �ʵ�(����)�� ���(�޼���)
	int a;
	int b;
	BButton c;
	
	public AButton() {
		this.setText("A");
	}
	
	public AButton(int a) {
		System.out.println(a);
	}
	
	public void aButton() {
		
	}
	// ��ü end
}

class BButton extends JButton {
	public BButton() {
		this.setBackground(Color.RED);
	}
}

class CButton extends JButton {
	public CButton(String s) {
		this.setText(s);
		this.setForeground(Color.YELLOW);
	}
}

public class MyEx extends JFrame { // MyEx �� JFrame�� ��� ����.
	public MyEx() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
	}

	public void addButton(JButton btn) { // A,B,C Button�� ��� JButton�� ��ӹ޾ұ⶧����, ������
		this.add(btn);
	}

	public static void main(String[] args) {
		MyEx m = new MyEx();
		AButton aButton = new AButton();
		BButton bButton = new BButton();
		CButton cButton = new CButton("Click me");

		m.setLayout(new GridLayout());

		m.addButton(aButton);
		m.addButton(bButton);
		m.addButton(cButton);

		m.setVisible(true);
	}

}

// 3���� Ÿ���� JButton ���� JButton �� ��ӹ޴� �޼��� 3�� �����.
// AButton = new AButton() // �ڵ����� �۾��� A��� �پ�����.
// BButton = new BButton() // ���� �Ķ�����
// CButton = new CButton() // ���� ���� ��������.

// public void addButton(JButton btn){// �Ű������� ������
// 		xxx <= JFrame �� ��� �޾Ҵٸ�, this 
// 				���� �����ߴٸ� JFrame ����
// 		xxx.add(btn);
//}
//
// xxx.addButton(btn1);
// xxx.addButton(btn2);
// xxx.addButton(btn3);