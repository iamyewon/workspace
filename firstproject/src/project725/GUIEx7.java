package project725;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUIEx7 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout gl = new GridLayout(0,2);
		JPanel pnlCenter = new JPanel(gl);
		JPanel pnlRadio = new JPanel();
		JPanel pnlCheck = new JPanel();
		JPanel pnlSouth = new JPanel();
		
		JLabel lblRegi = new JLabel("ȸ������");
		JLabel lblId = new JLabel("���̵�");
		JLabel lblName = new JLabel("�̸�");
		JLabel lblPw = new JLabel("��й�ȣ");
		JLabel lblTel = new JLabel("����ó");
		JLabel lblGen = new JLabel("����");
		JLabel lblHob = new JLabel("���");
		
		JTextField tfId = new JTextField();// GridLayout������ ������ ĭ��
		JTextField tfName = new JTextField();// ���缭 ���̹Ƿ� ���� ũ�⸦ 
		JTextField tfPw = new JTextField();// �� �ʿ䰡 ����
		JTextField tfTel = new JTextField();
		
		JRadioButton radioMan = new JRadioButton("��");
		JRadioButton radioWoman = new JRadioButton("��");
		ButtonGroup bg = new ButtonGroup();
		bg.add(radioMan);
		bg.add(radioWoman);
		
		JCheckBox ckSwim = new JCheckBox("����");
		JCheckBox ckRea = new JCheckBox("����");
		JCheckBox ckMus = new JCheckBox("����");
		
		JButton btnOk = new JButton("����");
		JButton btnCan = new JButton("���");
		
		// ����
		pnlRadio.add(radioMan);
		pnlRadio.add(radioWoman);
		
		pnlCheck.add(ckSwim);
		pnlCheck.add(ckRea);
		pnlCheck.add(ckMus);
		
		pnlSouth.add(btnOk);
		pnlSouth.add(btnCan);
		
		pnlCenter.add(lblId);
		pnlCenter.add(tfId);
		pnlCenter.add(lblName);
		pnlCenter.add(tfName);
		pnlCenter.add(lblPw);
		pnlCenter.add(tfPw);// JPasswordField�� ����ϸ� ����.
		pnlCenter.add(lblTel);
		pnlCenter.add(tfTel);
		pnlCenter.add(lblGen);
		pnlCenter.add(pnlRadio);
		pnlCenter.add(lblHob);
		pnlCenter.add(pnlCheck);
		
		f.add(lblRegi,"North");
		f.add(pnlCenter,"Center");
		f.add(pnlSouth,"South");
		f.setVisible(true);
		
		
		
		
	}
}


