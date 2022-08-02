package project82;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;

public class GUIExCheckBox extends HFrame implements ItemListener {
// ItemListener는 체크박스와 같이 선택하는 것에 사용
	//여기에 전역변수를 만들어줘야 모두 사용가능함
	JCheckBox ck1,ck2,ck3;
	public GUIExCheckBox() {
		super(new FlowLayout());//HFrame에 Layout Manager부분이 적용 될 것
		ck1 = new JCheckBox("딸기");
		ck2 = new JCheckBox("망고");
		ck3 = new JCheckBox("사과");
		ck1.addItemListener(this);
		ck2.addItemListener(this);
		ck3.addItemListener(this);
		this.add(ck1);
		this.add(ck2);
		this.add(ck3);
		this.setVisible(true);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) { //액션리스너는 버튼을 눌렀을때 작동하는것, 아이템체인지는 체크 되고 풀리고 와 같은 것에 이벤트 
		if(e.getSource()==ck1) {
			if(ck1.isSelected()) {
				System.out.println("체크");
			}else {
				System.out.println("체크해제");
			}
		}
	}
	
	public static void main(String[] args) {
		new GUIExCheckBox();
	}
	
	
	
}
