package project725;

class Ext1{
	int x;
	int y;
	public void printExt1() {
		System.out.println(x+":"+y);
	}
}

public class ExtendsEx1 extends Ext1{ //extends Ext1 ��ӹ޴��ڵ�
	//���������� Ext1 �� ������ �ִ�.. Ext1�� ��ӹ���
	
	public static void main(String[] args) {
		//Ext1 e = new Ext1(); ������ �̷������� ��������
		ExtendsEx1 ee = new ExtendsEx1();
		ee.printExt1(); // �θ��� �޼��带 ����ϰ� �ִ�.
		System.out.println(ee.x); //�θ��� ������ �� ��ó�� ��� �����ϴ�.
	}
	
	
}