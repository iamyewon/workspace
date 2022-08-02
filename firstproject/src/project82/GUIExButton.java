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
		tf = new JTextField(); // JPasswordField�� �ٲٸ� �۾� ������
		lbl = new JLabel("���⿡ �۾��� TextField�� �ִ� ���ڷ� �ٲ�ϴ�.");
		btn = new JButton("Ŭ��");
		btn.addActionListener(this);
		this.add(tf, "North");     // 1. ���� �Է��ϰ� 
		this.add(lbl); // �Ⱦ��� ����    // 3. ����� ������ ��
		this.add(btn, "South");    // 2. ��ư������
		
		this.setVisible(true);
	}

	void textMove() {
		//System.out.println("ok");
		lbl.setText(tf.getText());
		//�������� �Ű����� �ʿ� x => get ���� ��.
		//�������� �Ű����� ����. 
		// ex)setbackground(���� �� �ֱ�)
		// ex)getbackground(�̹� �ִ� ���� �������°Ŵϱ� �Ű����� �ʿ�x)
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
