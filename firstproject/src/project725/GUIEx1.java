package project725;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx1 {
	public static void main(String[] args) {
		JFrame f = new JFrame(); //â�� �������.
		f.setSize(300, 200); //������� â�̸� f �ȿ� �ִ� ���� �޼��带 ��� �� �� �ִ�. 
		  					 //�� �޼������ ��κ� f�� ����, ������ �ְų� �������� ��ɵ��̴�. 
	
		JButton btn1 = new JButton("��ư1"); // ������ �Ű�����
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton();
		btn5.setText("��ư5"); // �۾��ִ� �޼��嵵 �ִ�.
		//�̷��Ը� ����ٸ�, BorderLayout �� ���̸� ����� ���⶧���� ��ư5���� ���ϰ���
		
		
		
		f.add(btn1,"North");
		f.add(btn2,"East");
		f.add(btn3,"West");
		f.add(btn4,"South");
		f.add(btn5,"Center"); // center�� �ƹ��͵��Ƚᵵ center�� ��.
		
		//"����"�� �߰�����µ� �̷��� ������� �־��ָ�
		//���̾ƿ���� ��ư�� ��ġ��
		
		
		
		 f.setVisible(true); //ȭ�鿡 ������. - �����ָ� �ȳ�Ÿ��.....
	}
	
	// BorderLayout - JFrame �� ���� ����.
	// FlowLayout - �ڵ����� ä��ٰ� �ڸ������� �Ʒ��ٷ�.........
	// GridLayout - ������ ����..  ĭĭ�� ������,...��.?
	// null <- ���� ���̾ƿ� - ���� ��ġ, ũ��, ���� ����  - ���� ���� ��.. �ϳ��ϳ� ���� �������ټ����� - �ſ����̸�����
	
	
	
}