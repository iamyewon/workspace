package project725;

	class Ext5{ //class �տ� final�� ������ ���ó�� ���̻� ������ �Ұ��ϴ�. = ��� �Ұ� // Stringó��
		public void printExt5() { // ��ȯ�� �տ� final�� ������ �������̵� �Ұ�
			System.out.println("�̰��� Ext5");
		}
	}

public class ExtendsEx5 extends Ext5{
	@Override //Override �� �� ���ָ� Override�ƴ��� �˷���(������), �̸��� ���� �ߵƴ���..����  
	
	public void printExt5() {//�������̵� - �θ��� �޼��� ������(���� �켱��)
		System.out.println("�̰��� ExtendsEx5");
	}
	
	public void printSuper() {
		super.printExt5();
		
	}
	
	public static void main(String[] args) {
		//�������̵� �� �޼����� ��� main ���� ��밡��������
		//�θ� �޼���� �Ϲ����� ������� main �޼��忡�� ����� �Ұ��ϴ�.
		//�׷��� �ٷ� ���� ���ο� ������? �������........?
		ExtendsEx5 ee5 = new ExtendsEx5();
		ee5.printExt5();
		ee5.printSuper();
	}
	
	
}

//public �ƹ���
//private ����
//default(����) ���� ����
//protected ��ӹ��� �͸�.