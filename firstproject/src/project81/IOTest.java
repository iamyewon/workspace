/*package project81;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//instance of test
public class IOTest extends JFrame{ //JFrame�� �����̳�
	JPanel pnl;
	JButton btn;
	JCheckBox ck;
	JRadioButton rb;
	public IOTest() {
		pnl = new JPanel(); //�����̳����� ������Ʈ
		btn = new JButton("��ư");
		ck = new JCheckBox("üũ�ڽ�");
		rb = new JRadioButton("������ư");
		pnl.add(btn);
		pnl.add(ck);
		pnl.add(rb);
		this.pnl.add(pnl); //this�� JFrame�� �ǹ��Ѵ�
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		IOTest iot = new IOTest();
		System.out.println(iot.pnl.getComponentCount());
		int cnt=0;
		for(int i=0;i<iot.pnl.getComponentCount();i++) {
			if(iot.pnl.getComponent(i) instanceof JButton) {
				System.out.println(((JButton)iot.pnl.getComponent(i)).getText());
				cnt++;
			}//������ ����(������ instance)�� � Ÿ������ Ȯ�� ����
		}
		System.out.println(cnt);
	}
}


�����ȵ� */