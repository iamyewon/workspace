package project725;

import java.awt.Color;

import javax.swing.JPanel;

public class CPanel extends JPanel{ // this == JPanel
	public CPanel() {
		//super(); �� ������ ������. JPanel �� �����ȵǸ� ���ȵǴµ�
		//�̺κ��� �Ⱥ������� �����Ǿ�����.
		//super(); <= �θ��� �����ڸ� �ݵ�� �ҷ��� �ϴ°��� �ƴϴ�.
		//�θ� ������ڸ� ������ �����ϱ� �˾Ƽ� ȣ���Ѵ�.
		//���� �θ� ������� () <= ��ȣ �ȿ� �ƹ��͵� ���� �����ڰ� ���ٸ� �ݵ��
		//super(�Ű�����) <= �θ��� �����ڸ� ��������� ȣ���ؾ���.
		
	}
	
	public CPanel(int width, int height, Color c) {
		//super(); ������.
		
		this.setSize(width,height);
		this.setBackground(c); //JPanel �� ��� �ִ� �޼���
		
	}
}


class YPanel extends CPanel{
	
}