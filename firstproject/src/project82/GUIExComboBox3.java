package project82;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class GUIExComboBox3 extends HFrame implements ItemListener{
	
	JComboBox combo;
	JLabel lbl;
	
	
	public GUIExComboBox3() {
		
		String[] city = {"서울","강원","충청","대전","부산","제주"};
		combo = new JComboBox<>(city);
		combo.addItemListener(this);
		lbl = new JLabel("여기가 레이블");
		this.add(combo, "North");
		this.add(lbl);
		this.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) { //상태가 변할때 작동 .. 다른 메뉴가 선택 되었을때?
		if(e.getStateChange() == ItemEvent.SELECTED) { // 내가 고른 것이 선택된 상태로 변경 되었을때 가져온다..?
			lbl.setText(e.getItem()+""); // 전체를 문자로 바꾸기 위해 +""
		}
		
		
	}
	public static void main(String[] args) {
		new GUIExComboBox3();
	}
}
