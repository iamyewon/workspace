package project725;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIEx8 extends JFrame{
	int a;
	
	public GUIEx8() {//JFrame == this �� ���ٰ� �����ϰ� �۾�����.
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 400);
//		JPanel pnl = new JPanel(); // ���� �г��� ����� �ʹ�. 
//		pnl.setBackground(Color.YELLOW);//ex)new CPanel(color.RED)
		
		
		CPanel pnl = new CPanel(300,400,Color.RED);
		
		this.add(pnl);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		GUIEx8 ge8 = new GUIEx8();
	}
}


//JFrame�� ��ӹ��� MFrame �����
//�Ź� �ϴ� ������ �۾��� �̸� ���Ƽ� �صα�
//
//���� ��ӹ޾Ƽ� ���� �۵� ���� Ȯ���ϱ�.