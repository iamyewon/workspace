package firstproject2;

class Bonus{
	double bonus;
	int income;
	

	void setBonus(int b) { // ���ʽ� ����..
		bonus = b*0.01;	
	}
	void setIncome(int i) { // ���� ����..  
		income = i*10000;
	}
	void printIncome() {
		System.out.println("������"+income+"�� �Դϴ�.");
		System.out.println("������ ���� ���ʽ���"+(income*bonus)+"�� �Դϴ�.");
	}
	
}

public class BonusTest {
	public static void main(String[] args) {
		// 3�� ����
		// ���ʽ��� ������ ���� �Է� (10) <= 10%�� �ǹ�
		// ���ʽ� �����ϴ� �޼��� 1��
		
		// ���� �����ϴ� �޼��� (5000) <= 5000����
		
		// ����, ���� ���� ���ʽ� ����ϴ� �޼��� () <== ���� �ʿ� ����.
		
		Bonus per = new Bonus(); //�����Ų�� = �޸𸮿��ø���.
		per.setBonus(10);  // 10�� �Է��ص� ������ 10�ۼ�Ʈ.
		per.setIncome(5000);  // 5000�� �Է��ص� ������ 50000000����.
		
		per.printIncome();

	}
}

