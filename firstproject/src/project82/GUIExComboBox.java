package project82;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class GUIExComboBox extends HFrame implements ActionListener{
	
	JComboBox combo; //JComboBox에서 액션 or 아이템체인지(체크박스할때) 둘중 쓰면 됨.
	JLabel lbl;
	
	public GUIExComboBox() {
		String[] city = {"서울","강원","충청","대전","부산","제주"};
		combo = new JComboBox<>(city); // JComboBox 만들때 생기는 < > 는 없어도 됨 ?
		combo.addActionListener(this);
		
		lbl = new JLabel("여기에 레이블이 있다.");
		this.add(combo, "North");
		this.add(lbl);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new GUIExComboBox();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// if(e.getSource()==btn)  한개를 누른다음 여러개중에 골라야하니 이렇게 쓸 수 없음
		JComboBox cb = (JComboBox) e.getSource();
		System.out.println(cb.getSelectedIndex()); // 내가 선택한 것의 번호 받아오기
		int idx = cb.getSelectedIndex();
		System.out.println(cb.getSelectedItem()); // 내가 선택한 것의 이름 받아오기
		String str = cb.getSelectedItem()+""; // 뭐든 문자랑 더하면 문자로 변환됨
		lbl.setText(str);
		
		//lbl.setText(cb.getSelectedItem()+""); 
		// setText가 String타입만 쓸 수 있다고 뜨는데 형변환 대신 +""처럼 뒤에 스트링을 더해주면 스트링 형이 됨.
		
	
		
	}
}
