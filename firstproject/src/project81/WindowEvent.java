package project81;

import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowEvent extends JFrame implements WindowListener{
	public WindowEvent(){
		this.setSize(300, 300);
		this.setVisible(true);
		this.addWindowListener(this);
		//���� ��Ŭ����(JFrame)�� ������ �̺�Ʈ�� ���δ�.
	}
	
	public static void main(String[] args) {
		new WindowEvent();
	}
	
	@Override
	public void windowOpened(java.awt.event.WindowEvent e) {
		System.out.println("������ ���µ�");
	}

	@Override
	public void windowClosing(java.awt.event.WindowEvent e) {
		System.out.println("������ Ŭ��¡");
		JOptionPane.showMessageDialog(this, "�����ϰڽ��ϴ�");
		System.exit(0);
		
	}

	@Override
	public void windowClosed(java.awt.event.WindowEvent e) {
		System.out.println("������ Ŭ�����");
		
	}

	@Override
	public void windowIconified(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}

//����