package project82;

interface Number{}

//�Ű������� Ÿ�� �ϳ��� ��ġ����.. //instanceof�� ����Ÿ���� ���� �� �� ���� //������ڵ�����
class Inte implements Number{}
class Floa implements Number{}
class Doubl implements Number{}


public class Polymorphism {
	
/*	void printNumber(Inte i) {}
	void printNumber(Floa f) {}
	void printNumber(Doubl d) {}
	//�޼����� �̸��� ������ �Ű����� ���� ���� �޶� �����ε�
*/	void printNumber(Number n) {} //�������̽��� �ϳ��� ��� ó���� �� �ִ�.
//������ �Ű������� �ѹ��� �޾Ƽ� ó���� �� �ִ�. �� ����.
	
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.printNumber(new Doubl());
		p.printNumber(new Floa());
		p.printNumber(new Inte());
		
	}
}
