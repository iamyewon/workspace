package project725;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUIPractice2 {
	public static void main(String[] args) {
		JFrame f = new JFrame(); 
		GridLayout fgl = new GridLayout(0,1);
		GridLayout pnlgl = new GridLayout(1,2);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		f.setLayout(fgl);
		
		
		JPanel pnl1 = new JPanel();
		JLabel lbl1 = new JLabel("회원가입");
		pnl1.add(lbl1);
		
		JPanel pnl2 = new JPanel();
		pnl2.setLayout(pnlgl);
		JLabel lbl2 = new JLabel("아이디");
		JTextField tf2 = new JTextField(5);
		pnl2.add(lbl2);
		pnl2.add(tf2);
		
		JPanel pnl3 = new JPanel();
		pnl3.setLayout(pnlgl);
		JLabel lbl3 = new JLabel("이름");
		JTextField tf3 = new JTextField(5);
		pnl3.add(lbl3);
		pnl3.add(tf3);
		
		JPanel pnl4 = new JPanel();
		pnl4.setLayout(pnlgl);
		JLabel lbl4 = new JLabel("비밀번호");
		JTextField tf4 = new JTextField(5);
		pnl4.add(lbl4);
		pnl4.add(tf4);
		
		JPanel pnl5 = new JPanel();
		pnl5.setLayout(pnlgl);
		JLabel lbl5 = new JLabel("전화번호");
		JTextField tf5 = new JTextField(5);
		pnl5.add(lbl5);
		pnl5.add(tf5);
		
		JPanel pnl6 = new JPanel();
		pnl6.setLayout(pnlgl);
		JLabel lbl6 = new JLabel("성별");
		ButtonGroup bg = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("남");
		JRadioButton radio2 = new JRadioButton("여");
		bg.add(radio1);
		bg.add(radio2);
		pnl6.add(lbl6);
		pnl6.add(radio1);
		pnl6.add(radio2);
		
		
		
		
		JPanel pnl8 = new JPanel();
		JButton btn1 = new JButton("가입");
		JButton btn2 = new JButton("취소");
		pnl8.add(btn1);
		pnl8.add(btn2);
		
		f.add(pnl1);
		f.add(pnl2);
		f.add(pnl3);
		f.add(pnl4);
		f.add(pnl5);
		f.add(pnl6);
		//f.add(pnl7);
		f.add(pnl8);
		f.setVisible(true);
		
		//정답은 GUIEx7에
	}
}
