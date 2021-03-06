package project82;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx1 extends JFrame implements ActionListener{
	//액션리스너는 클릭이벤트, 버튼 같은 것들 클릭했을때 발생
	
	
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
		System.out.println("프린트");
	}
	
		@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			printGui(); // 이벤트가 일어나면 메서드를 실행시킴.
			// 이벤트 드리븐 프로그래밍
			// 각 버튼마다 이벤트를 실행시킴.
			// 이벤트 일어날때마다 각 내용을 쓰는게아니라 메서드호출
		}
		
	}
	// 스윙 프로그래밍 = 자바의 GUI(Graphic User Interface) <-> CLI(Command Line Interface) 
	// AWT = 자바의 GUI. 다만 OS에 리소스를 가져다가 쓴다. 
	// Swing = 자바의 GUI. 자체 리소스를 사용한다. 	
	// 컨테이너 = 컴포넌트를 담을 수 있는 객체
	// Frame, JPanel, JDialog, JApplet(보안, 설치 문제 등으로 인해 지금은 사용X) 
	//
	// 컴포넌트 = 컨테이너에 붙일 수 있는 객체
	// JButton(액션리스너),  JPanel, JCheckBox(제이아이템리스너), JRadioButton(액션리스너), JTextField(T이벤트), 
	// JPasswordField, JTextArea, JComboBox, JList, JProgressBar, 
	// JToolTip, JScrollPane, JMenu, JTable, JTree, JToolBar
	// JTebbedPane, JSplitPane 
	// 이런것들 이용해서 프로젝트.
		////액션리스너는 클릭이벤트, 버튼 같은 것들 클릭했을때 발생
		
		
	public static void main(String[] args) {
	/*	GUIEx1 g = new GUIEx1();
		g.printGui();*/
		new GUIEx1();
	}


	
}
