package project81;

abstract class Animal{// �߻� Ŭ������ ������, ��ӽ� �ݵ�� ��޼��带 �����ؾ���.
	public static void main(String[] args) {}
}
		
	
	// ���� == {} << �߰�ȣ ������ ��. ���������� ������ �߿����� ����.
/*	public void moving() {
		System.out.println("�����δ�.");
		
	}
	public abstract void sound(); {// �߻�޼���
		//������ �����δٴ� ����� �� ������ �ְ�, �Ҹ��� �� ������ ������
		//�Ҹ��� �� �ٸ��Ƿ� �� Ŭ������ ����ϸ� sound() Ŭ������ ������ ���� ��� �ؾ���..
		//�� �ϼ� Ŭ���� 
	}
}
*/
//	public class AbstractClassEx{
//		Animal ani = new Animal() {
//			
//			@Override
//			public void sound() {
//				
//						
//			}
//		};
//	}
//}

// �߻� Ŭ���� - �Ϲ� Ŭ������ �߻� �޼��带 �����ϰ� �ִ� ��.
// �Ϲ� Ŭ���� + �ϼ����� ���� �޼��带 1���� ���� �ϰ� �մ� ��.
// �ϼ����� ���� Ŭ������ body( {} )�� ���°�
// void plus(); <== �߻� �޼��� ==> �̷������� �߰�ȣ ���� ���� 
// �׳��� �� �� ���� ��� �޾Ƽ� �� �� ����.
// ����� Ư���� �����ؼ� �޼��带 �̾� ���� ��.
// ����� �� �ݵ�� �������̵� ����� ��.
// �� Ŭ������ ��� �������� �ݵ�� �ϼ��ؼ� ��� �� �� �ֵ��� ������. 
// �߻�Ŭ���� ��� �ǹ̷� abstract ��� ���� �����.