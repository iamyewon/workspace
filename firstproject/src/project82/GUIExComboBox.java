package project82;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class GUIExComboBox extends HFrame implements ActionListener{
	
	JComboBox combo; //JComboBox���� �׼� or ������ü����(üũ�ڽ��Ҷ�) ���� ���� ��.
	JLabel lbl;
	
	public GUIExComboBox() {
		String[] city = {"����","����","��û","����","�λ�","����"};
		combo = new JComboBox<>(city); // JComboBox ���鶧 ����� < > �� ��� �� ?
		combo.addActionListener(this);
		
		lbl = new JLabel("���⿡ ���̺��� �ִ�.");
		this.add(combo, "North");
		this.add(lbl);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new GUIExComboBox();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// if(e.getSource()==btn)  �Ѱ��� �������� �������߿� �����ϴ� �̷��� �� �� ����
		JComboBox cb = (JComboBox) e.getSource();
		System.out.println(cb.getSelectedIndex()); // ���� ������ ���� ��ȣ �޾ƿ���
		int idx = cb.getSelectedIndex();
		System.out.println(cb.getSelectedItem()); // ���� ������ ���� �̸� �޾ƿ���
		String str = cb.getSelectedItem()+""; // ���� ���ڶ� ���ϸ� ���ڷ� ��ȯ��
		lbl.setText(str);
		
		//lbl.setText(cb.getSelectedItem()+""); 
		// setText�� StringŸ�Ը� �� �� �ִٰ� �ߴµ� ����ȯ ��� +""ó�� �ڿ� ��Ʈ���� �����ָ� ��Ʈ�� ���� ��.
		
	
		
	}
}