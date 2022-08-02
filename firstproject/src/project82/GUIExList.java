package project82;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;

public class GUIExList extends HFrame implements ActionListener{
	JList list1, list2;	
	JButton btn1, btn2;
	JPanel jpn;
	DefaultListModel model1,model2;
	Border blackline = BorderFactory.createLineBorder(Color.BLACK);

	public GUIExList() {
		String[] city = {"����","����","��û","����","�λ�","����"};
		// ComboBox�� �ϳ��� ���� �� �� �ִµ� list �� ����Ʈ�� ��Ʈ��Ű ������ ������ ���� ������
		model1 = new DefaultListModel<>();
		model2 = new DefaultListModel<>();
		// list�� �迭�� ������ ���� ������ �� ��� model�� �Ἥ �ؾ���........
		// model�� �迭�� �־��ָ� �Ǵ�..??
		
		list1 = new JList(model1); 
		list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // �ϳ��� �����ϵ��� �ϴ� ���
		list1.setBorder(blackline);
		list2 = new JList(model2);
		list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list2.setBorder(blackline);
		
		for(int i=0;i<city.length;i++) {
		model1.addElement(city[i]);
		}
		
		btn1 = new JButton("==>");
		btn2 = new JButton("<==");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		jpn = new JPanel();
		jpn.setLayout(new GridLayout(0,2));
		
		this.add(jpn,"Center");
		jpn.add(list1);
		jpn.add(list2);
		
		this.add(btn1,"North");
		this.add(btn2,"South");
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GUIExList();
	}

	void moveRight(){
		if(model1.getSize()>0) { //list1�� ���̻� �ƹ��͵� ������ �۵����� �ʵ���.
		String str1 = list1.getSelectedValue()+""; // ������Ʈ Ÿ���� ���ڿ��� ����
		// list1�� �ȿ� �ִ� ���� str1�� ����.
		model2.addElement(str1); // str1�� model2�� �߰����ش�.
		model1.remove(list1.getSelectedIndex()); // list1 �ȿ� ���õ� ��ȣ�� �׸��� ��������. 
		}
	}
	
	void moveLeft() {
		if(model2.getSize()>0) {
			String str2 = list2.getSelectedValue()+"";
			model1.addElement(str2);
			model2.remove(list2.getSelectedIndex());
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			moveRight();
		}else if(e.getSource()==btn2) {
			moveLeft();
		}
		
	}
	
	
}