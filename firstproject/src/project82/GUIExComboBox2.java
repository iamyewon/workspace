package project82;

	import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
	import javax.swing.JLabel;
	
public class GUIExComboBox2 extends HFrame implements ActionListener{
		
		JComboBox combo; //JComboBox���� �׼� or ������ü����(üũ�ڽ��Ҷ�) ���� ���� ��.
		JLabel lbl;
		JButton btn;
		
		public GUIExComboBox2() {
			String[] city = {"����","����","��û","����","�λ�","����"};
			combo = new JComboBox<>(city); // JComboBox ���鶧 ����� < > �� ��� �� ?
			combo.addActionListener(this);
			
			lbl = new JLabel("���⿡ ���̺��� �ִ�.");
			btn = new JButton("Ŭ��");
			btn.addActionListener(this);
			this.add(combo, "North");
			this.add(lbl);
			this.add(btn, "South");
			this.setVisible(true);
			
		}
		public static void main(String[] args) { //Ŭ���� ������ ����???????????????
			new GUIExComboBox2();
		}	
		
		

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = combo.getSelectedItem()+"";
			lbl.setText(str);
		}
	
	}







