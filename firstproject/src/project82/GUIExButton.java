package project82;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIExButton extends HFrame implements ActionListener{
	
	JTextField tf;
	JLabel lbl;
	JButton btn;
	
	public GUIExButton() {
		tf = new JTextField(); // JPasswordField로 바꾸면 글씨 가려짐
		lbl = new JLabel("여기에 글씨가 TextField에 있는 글자로 바뀝니다.");
		btn = new JButton("클릭");
		btn.addActionListener(this);
		this.add(tf, "North");     // 1. 여기 입력하고 
		this.add(lbl); // 안쓰면 센터    // 3. 여기로 내용이 들어감
		this.add(btn, "South");    // 2. 버튼누르면
		
		this.setVisible(true);
	}

	void textMove() {
		//System.out.println("ok");
		lbl.setText(tf.getText());
		//가져오면 매개변수 필요 x => get 쓰면 됨.
		//넣을때는 매개변수 있음. 
		// ex)setbackground(넣을 색 넣기)
		// ex)getbackground(이미 있는 색을 가져오는거니까 매개변수 필요x)
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			textMove();
		
		}
	}	
	
	public static void main(String[] args) {
		new GUIExButton();
	}
}
