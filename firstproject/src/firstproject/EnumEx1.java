package firstproject;


class Aircon{
	int power;
	
}

//========================================= ���� ��� Ŭ���� �ϳ� �� ����� o

public class EnumEx1 {
public static void main(String[] args) {
	//��� = ������ �ʴ� ��      <---> ���� - ������ ���� ���� �� �ִ� ����
	//ex)100, "�ȳ�"  ���..
	//����� �׻� �����Ǿ� �ִ� ��...
	
	Aircon a = new Aircon();
	final int ON = 1;  // ���� �����̶�� �ǹ̷�,, ���̻� ������ �ʴ�...
	final int OFF = 0; // 1�̳� 0�����δ� �ǹ��ϴ� �ٸ� �𸣴ϱ� ���� ���� �˱� ���� �س��� ����� �� �ְ�.
	// final�� ���̸� ���� ������� ����. ON=2�� ���� �Ұ��� 
	
	
	a.power=ON; // �ܺηκ��� �Է¹޴´ٰ� ���� 
	if(a.power==ON) {
		System.out.println("���� ����");
	}else if(a.power==OFF) {
		System.out.println("���� ����");
	}
	
	
	
}
}
