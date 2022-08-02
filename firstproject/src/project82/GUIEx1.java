package project82;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx1 extends JFrame implements ActionListener{
	//�׼Ǹ����ʴ� Ŭ���̺�Ʈ, ��ư ���� �͵� Ŭ�������� �߻�
	
	
	JButton btn;
	public GUIEx1() {
		this.setSize(200, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn = new JButton();
		btn.addActionListener(this);
		this.add(btn);
		this.setVisible(true);
	}
	
	void printGui() {
		System.out.println("����Ʈ");
	}
	
		@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			printGui(); // �̺�Ʈ�� �Ͼ�� �޼��带 �����Ŵ.
			// �̺�Ʈ �帮�� ���α׷���
			// �� ��ư���� �̺�Ʈ�� �����Ŵ.
			// �̺�Ʈ �Ͼ������ �� ������ ���°Ծƴ϶� �޼���ȣ��
		}
		
	}
	// ���� ���α׷��� = �ڹ��� GUI(Graphic User Interface) <-> CLI(Command Line Interface) 
	// AWT = �ڹ��� GUI. �ٸ� OS�� ���ҽ��� �����ٰ� ����. 
	// Swing = �ڹ��� GUI. ��ü ���ҽ��� ����Ѵ�. 	
	// �����̳� = ������Ʈ�� ���� �� �ִ� ��ü
	// Frame, JPanel, JDialog, JApplet(����, ��ġ ���� ������ ���� ������ ���X) 
	//
	// ������Ʈ = �����̳ʿ� ���� �� �ִ� ��ü
	// JButton(�׼Ǹ�����),  JPanel, JCheckBox(���̾����۸�����), JRadioButton(�׼Ǹ�����), JTextField(T�̺�Ʈ), 
	// JPasswordField, JTextArea, JComboBox, JList, JProgressBar, 
	// JToolTip, JScrollPane, JMenu, JTable, JTree, JToolBar
	// JTebbedPane, JSplitPane 
	// �̷��͵� �̿��ؼ� ������Ʈ.
		////�׼Ǹ����ʴ� Ŭ���̺�Ʈ, ��ư ���� �͵� Ŭ�������� �߻�
		
		
	public static void main(String[] args) {
	/*	GUIEx1 g = new GUIEx1();
		g.printGui();*/
		new GUIEx1();
	}


	
}