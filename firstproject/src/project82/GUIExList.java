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
		String[] city = {"서울","강원","충청","대전","부산","제주"};
		// ComboBox는 하나만 선택 할 수 있는데 list 는 쉬프트나 컨트롤키 누르고 여러개 선택 가능함
		model1 = new DefaultListModel<>();
		model2 = new DefaultListModel<>();
		// list는 배열로 넣으면 값을 수정할 수 없어서 model을 써서 해야함........
		// model에 배열을 넣어주면 되는..??
		
		list1 = new JList(model1); 
		list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // 하나만 선택하도록 하는 기능
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
		if(model1.getSize()>0) { //list1에 더이상 아무것도 없을때 작동되지 않도록.
		String str1 = list1.getSelectedValue()+""; // 오브젝트 타입을 문자열로 변경
		// list1의 안에 있는 값이 str1에 들어가고.
		model2.addElement(str1); // str1을 model2에 추가해준다.
		model1.remove(list1.getSelectedIndex()); // list1 안에 선택된 번호의 항목은 지워진다. 
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
