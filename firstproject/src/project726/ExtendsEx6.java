package project726;

class Ext6 {//�θ� Ŭ������� Ư���Ѱ� �ƴϴ�. 
	int x;
	String str;
	
	void printExt6() {
		System.out.println("Ext6");
	}
}

class ExtendsEx6_2 extends Ext6{}
class ExtendsEx6_3 extends Ext6{}
class ExtendsEx6_4 extends Ext6{}





public class ExtendsEx6 extends Ext6{ //��� �޾Ҵ�. == ExtendsEx6 + Ext6
	int y;
	int z;
	double[] dd;
	
/*��� �޾Ƽ�
	
	int x; (= super.x)
	String str; (= super.str)  �� ���� �θ��� �޼��带 super��� ��.
		
	void printExt6() {
		System.out.println("Ext6"); 
	}
	�̺κ� = super �� ����ִ�.
	
 ��� ���� ���� ��ü�� ���� �������� ���� 
 */
	
	void printExt6() {
		System.out.println("Ext6"); // ��ӹ��� Ŭ������ ��� �ִ� �޼���� �Ȱ��� �� �޼���
	}								// �������̵� �Ǿ���.
	void printClass() {
		System.out.println("ExtendsEx6");	 
 	}
}


//����ϴ� ���� -> ������ �۾��� ��� ����.
// => ���۾��� �ʿ��� �ٸ� �� ū Ŭ�������� ������ ����.