package project725;

import java.awt.Color;

import javax.swing.JButton;

public class GUIEx9 extends MFrame{
	public GUIEx9() {
		//super(); ��� �ڵ� ȣ��
//		super(1000,500,Color.RED); //color�� contentPane ����ؾ���.
		super(1000,500,null,MFrame.FLOW_LAYOUT); //ȣ�Ⱑ��
		
		JButton btn = new JButton("Ŭ��");
		this.add(btn);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIEx9();
	}
}


//JTextField > MTextField => flowlayout�� ��� ũ�� �ʼ�. 
//
//JPanel > MPanel -> ���̾ƿ� ������ �߰� 
//					 ���߰� ��...
//������ MCheck 
//MRadioButton..
//JButton�� setBackgroud:���� / setForeground:���ڻ�