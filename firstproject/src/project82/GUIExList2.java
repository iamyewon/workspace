/*package project82;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class GUIExList2 extends HFrame implements ActionListener{
	
	JTextField tf;
	JButton btnAdd, btnDel;
	JList list;
	DefaultListModel model; //����Ʈ�� ���� �߰�, ����, ������ �����ϰ� ������ִ� ��ü.
	
	
	public GUIExList2() {
		tf = new JTextField(15);
		btnAdd = new JButton("�߰�");
		btnDel = new JButton("����");
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		
		JPanel pnl = new JPanel();
		pnl.add(tf);
		pnl.add(btnAdd);
		pnl.add(btnDel);
		
		model = new DefaultListModel<>();
		
		list = new JList(model); 
		//�迭�� �־ �ʱⰪ�� ������� �� �ִ�.
		//������ JList, JComboBox, JTable ���� ��� �迭�� ������ ����, ������ �ȵȴ�.
		//=> �� ������ �����Ǿ� �־ ������ ���� �ִ�. 
		//=> �⺻������ ���� �ְ� �� �� �ִ� �� �ʿ�.. �⺻ ���� �� -> DefaultListModel
		
		JScrollPane sp = new JScrollPane(list); // ��ũ�� �߰� (���⼭ ���� ������, ��ũ�ѾȻ��� ��)
		
		this.add(pnl, "North");
		this.add(list);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GUIExList2();
	}

	public void addItem() {
		
	}
	public void removeItem() {
		int idx = list.getSelectedIndex();//���� ��ȣ �������� (�ε� �ȵǴ���)
		if(idx<0) {
			JOptionPane.showMessageDialog(this, "���õ� ���� �����ϴ�.");
		}else {
		model.remove(idx);
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd) {
			String str = tf.getText(); //�۾�������
			str = str.trim(); // �¿� ���� ����
			if(str.equals("")) {
				JOptionPane.showMessageDialog(this, "�� ���� ���� �� �����ϴ�.");
				//      � â ���� ??          , ��� �� �޼���
				
			}else {
				model.addElement(str); // ���߰�
				tf.setText("");
			}
			
		}else if(e.getSource()==btnDel) {//������ ���ڷ� �ϴ°� �ƴ϶� ��ȣ�� ��
			int idx = list.getSelectedIndex();//���� ��ȣ �������� (�ε� �ȵǴ���)
			if(idx<0) {
				JOptionPane.showMessageDialog(this, "���õ� ���� �����ϴ�.");
			}else {
			model.remove(idx);
			}
		}
		
	}
}
*/
package project82;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class GUIExList2 extends HFrame implements ActionListener{
	JTextField tf;
	JButton btnAdd, btnDel;
	JList list;
	DefaultListModel model;// ����Ʈ�� ���� �߰�,����, ������ �����ϰ� ����� �ִ°�ü
	public GUIExList2() {
		tf = new JTextField(15);
		btnAdd = new JButton("�߰�");
		btnDel = new JButton("����");
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		
		JPanel pnl = new JPanel(); 
		pnl.add(tf);
		pnl.add(btnAdd);
		pnl.add(btnDel);
		
		model = new DefaultListModel<>();		
		
		list = new JList(model);// �迭�� �־ �ʱⰪ�� ������ټ� �ִ�.
		// ������ JList, JComboBox, JTable ���� ��� �迭�� ������ ����, ������ �ȵȴ�.
		// => �װ����� �����Ǿ� �־ ������ ���� �ִ�.
		
		JScrollPane sp = new JScrollPane(list);// ��ũ�� �߰�
		
		
		this.add(pnl,"North");
		this.add(sp);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIExList2();
	}
	
	public void addItem() {
		String str = tf.getText();
		str = str.trim();// �¿� ���� ����
		if(str.equals("")) {
			JOptionPane.showMessageDialog(this, "���� ������ �����ϴ�.");
			                      // � â ����? , ��µ� �޽���
		}else {
			model.addElement(str);// ���߰�
			tf.setText("");
		}
	}
	
	public void removeItem() {
		int idx = list.getSelectedIndex();// ���� ��ȣ ��������
		if(idx<0) {
			JOptionPane.showMessageDialog(this, "���õ� ���� �����ϴ�.");
		}else {
			model.remove(idx);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd) {
			addItem();			
		}else if(e.getSource()==btnDel) {
			removeItem();
		}
		
	}

}



