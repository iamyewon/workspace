package project82;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIExAwt {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(200, 300);
		// f.setDefalut~  �ϴ� �ڵ����� ������ ����.
		f.setLayout(new FlowLayout());
		Button btn = new Button("Ŭ��");
/*		WindowListener wl - new WindowListener() {
			
			public void windowOpened(WindowEvent e) {	}			
			public void windowIconified(WindowEvent e) { }			
			public void windowDeiconified(WindowEvent e) {	}			
			public void windowDeactivated(WindowEvent e) {	}			
			public void windowClosed(WindowEvent e) {	}
			public void windowActivated(WindowEvent e) {	}
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};	 �̷������� awt�� �������� �ڵ� ���� ����� ��� �������� ������ַ��� �̷��� ���� �ڵ尡 �ʿ���.*/ 
			
				f.add(btn);
				f.setVisible(true);
		
		
		JFrame jf = new JFrame();
		jf.setSize(200, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ڵ����� ��� ����.
		jf.setLayout(new FlowLayout());
		JButton btn2 = new JButton("Ŭ��");
		jf.add(btn2);
		jf.setVisible(true);
	}

}

//awt�� OS�� ���ҽ��� �̿��Ѵ�. JFrame�� ������.