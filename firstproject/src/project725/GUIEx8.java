package project725;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIEx8 extends JFrame{
	int a;
	
	public GUIEx8() {//JFrame == this 와 같다고 생각하고 작업하자.
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 400);
//		JPanel pnl = new JPanel(); // 색상 패널을 만들고 싶다. 
//		pnl.setBackground(Color.YELLOW);//ex)new CPanel(color.RED)
		
		
		CPanel pnl = new CPanel(300,400,Color.RED);
		
		this.add(pnl);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		GUIEx8 ge8 = new GUIEx8();
	}
}


//JFrame을 상속받은 MFrame 만들기
//매번 하는 귀찮은 작업들 미리 몰아서 해두기
//
//이후 상속받아서 실제 작동 여부 확인하기.