package project725;

import javax.swing.JFrame;

public class ExtendsEx2 extends JFrame{ //���������� ��ӹ޾Ƽ� JFrame�� ����ִ�. 
	public ExtendsEx2() {
		this.setSize(300, 300); //�θ�(JFrame)�� ������ �ִ� �޼ҵ� 
		//this �� ExtendsEx2�� �ǹ� //��� ������ ��Ȯ�� �ǹ̸� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�θ� ������ �ִ� �޼ҵ�
		this.setVisible(true);//�θ� ������ �ִ� �޼ҵ�
	}
	
	
	public void setSize(int w, int h) { //�θ� ������ �ִ� �Ͱ� ���� �̸��� �� �޼���
		// �θ��� �޼��尡 ������ �ȵ�� �Ȱ��� ���� ������ �ٲٸ� �ȴ�.
		// �������̵� - ������ �ٲ������ ��.
	}

	
	public void printSize() { //���� ���� �޼��� 
		System.out.println(this.getSize());
	}

	
	public static void main(String[] args) {
		ExtendsEx2 ee = new ExtendsEx2();
		//JFrame f = new JFrame(); ������ �̷��� ����.
	}

}
//�⺻������ �θ� ���� ��� �ְ�, ���� ���ϸ� ����� �� ���� �ְ�, �������̵��� �ǰ�