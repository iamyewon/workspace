package project725;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUIEx6 {
public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setLayout(new FlowLayout());
	JLabel lbl = new JLabel("�׳� �۾�");
	JTextField tf = new JTextField(20); //�Է�â
	JButton btn = new JButton("��ư");
	
	ButtonGroup bg = new ButtonGroup();
	
	JRadioButton radio1 = new JRadioButton("��");
	JRadioButton radio2 = new JRadioButton("��");
	JRadioButton radio3 = new JRadioButton("������ ����");// �ϳ��� ���� �ϴ� �뵵�� ����. ���� �з����� ������� �ۿ��.
	bg.add(radio1);
	bg.add(radio2);
	bg.add(radio3);
	
	JCheckBox ck1 = new JCheckBox("���");
	JCheckBox ck2 = new JCheckBox("����"); 
	JCheckBox ck3 = new JCheckBox("����"); //üũâ
	f.add(lbl);
	f.add(tf);
	f.add(btn);
	f.add(radio1);
	f.add(radio2);
	f.add(radio3);
	f.add(ck1);
	f.add(ck2);
	f.add(ck3);
	f.setSize(700,500);
	f.setVisible(true);
}
}
