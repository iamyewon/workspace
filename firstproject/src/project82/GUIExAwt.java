package project82;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIExAwt {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(200, 300);
		// f.setDefalut~  하는 자동종료 같은건 없음.
		f.setLayout(new FlowLayout());
		Button btn = new Button("클릭");
/*		WindowListener wl - new WindowListener() {
			
			public void windowOpened(WindowEvent e) {	}			
			public void windowIconified(WindowEvent e) { }			
			public void windowDeiconified(WindowEvent e) {	}			
			public void windowDeactivated(WindowEvent e) {	}			
			public void windowClosed(WindowEvent e) {	}
			public void windowActivated(WindowEvent e) {	}
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};	 이런식으로 awt의 프레임은 자동 종료 기능이 없어서 종료기능을 만들어주려면 이렇게 많은 코드가 필요함.*/ 
			
				f.add(btn);
				f.setVisible(true);
		
		
		JFrame jf = new JFrame();
		jf.setSize(200, 300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 자동종료 기능 있음.
		jf.setLayout(new FlowLayout());
		JButton btn2 = new JButton("클릭");
		jf.add(btn2);
		jf.setVisible(true);
	}

}

//awt는 OS의 리소스를 이용한다. JFrame은 스윙꺼.