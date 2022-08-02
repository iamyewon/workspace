package project82;

	import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
	import javax.swing.JLabel;
	
public class GUIExComboBox2 extends HFrame implements ActionListener{
		
		JComboBox combo; //JComboBox에서 액션 or 아이템체인지(체크박스할때) 둘중 쓰면 됨.
		JLabel lbl;
		JButton btn;
		
		public GUIExComboBox2() {
			String[] city = {"서울","강원","충청","대전","부산","제주"};
			combo = new JComboBox<>(city); // JComboBox 만들때 생기는 < > 는 없어도 됨 ?
			combo.addActionListener(this);
			
			lbl = new JLabel("여기에 레이블이 있다.");
			btn = new JButton("클릭");
			btn.addActionListener(this);
			this.add(combo, "North");
			this.add(lbl);
			this.add(btn, "South");
			this.setVisible(true);
			
		}
		public static void main(String[] args) { //클릭을 햇을때 변경???????????????
			new GUIExComboBox2();
		}	
		
		

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = combo.getSelectedItem()+"";
			lbl.setText(str);
		}
	
	}








