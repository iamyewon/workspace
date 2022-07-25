package project725;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JFrame;


public class MPanel extends JPanel {	
	final static int BORDER_LAYOUT=0;
		final static int FLOW_LAYOUT=1;
		
	public MPanel() {
		this(null, BORDER_LAYOUT);
	}
	public MPanel(Color c) {
		this(c,BORDER_LAYOUT);
	}
	public MPanel(Color c, int layout) {
		this.setBackground(Color.RED);

		if(layout==FLOW_LAYOUT) {
			this.setLayout(new FlowLayout());
		}
		
	}

	public static void main(String[] args) {
		JFrame f = new JFrame();
		MPanel mf = new MPanel();
		f.setSize(500, 500);
		f.add(mf);
		f.setVisible(true);
	}
}

