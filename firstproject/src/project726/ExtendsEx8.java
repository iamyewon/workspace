package project726;

class Ext8Parents{
	int x;
	
	public void printExt8Parents() {
		x++;
		System.out.println("�θ� Ŭ����"+x);
	}
}

class Ext8Child extends Ext8Parents{
	int y;
	
	public void printExt8Child() {
		y++;
		System.out.println("�ڽ� Ŭ����"+y);
	}
}


public class ExtendsEx8 {
	public static void main(String[] args) {
		Ext8Parents p = new Ext8Child();
		p.printExt8Parents();
	//	p.printExt8Child(); // ��� ������ �ڽ� Ŭ������ ���������, �θ� Ŭ���� Ÿ������ �ٲ���� ������
							// �ڽ� Ŭ���� �޼���� ��� �Ұ���.
	//	Ext8Child c = new Ext8Parents(); // �翬�� �ȵ�. //�θ� �����ؼ� �ڽĿ� ���� �� ����.
		Ext8Child c = (Ext8Child) p; // ���������� ����ȯ�ؼ� ��밡������ , �տ��� Ŭ������ �־��ָ鼭 ����..
		c.printExt8Child();
		
		
	}
}