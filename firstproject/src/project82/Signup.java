package project82;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Signup extends HFrame implements ActionListener{
	
	HFrame hf;
	JTextField inputID, inputPasswd, num1, num2;
	JLabel id, passwd, address;
	JComboBox resionNum;
	JList addressList;
	JButton signup;
	JPanel jp1, jp2;
	JTextArea info;
	
	public Signup() {
		hf = new HFrame();
		hf.setLayout(new GridLayout(0,2));
		jp1 = new JPanel();
		jp2 = new JPanel();

		id = new JLabel("아이디");
		passwd = new JLabel("비밀번호");
		inputID = new JTextField(10);
		inputPasswd = new JTextField(10);
		
		
		jp1.add(id);
		jp1.add(inputID);
		jp1.add(passwd);
		jp1.add(inputPasswd);
		
		hf.add(jp1);
		hf.add(jp2);
		hf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Signup();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
