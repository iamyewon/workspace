package firstproject3;

class Salary{
	int salary;
	double tax;
	int insurance;
	
	void insertSalary(int s) {
		salary = s*10000;
	}
	void calTax(double t) {
		tax = t*0.01;
	}
	void calInsurance(int i) {
		insurance = i*10000;
	}
	void showRealSalary() {
		System.out.println("�� ���ɾ��� "+(salary-(salary*tax)-insurance)+"�� �Դϴ�.");
	}
	
}

public class Salary1 {
	//����
	public static void main(String args[]){
	    Salary s = new Salary();
	    s.insertSalary(1000);
	    s.calTax(5);
	    s.calInsurance(50);
	    s.showRealSalary();
	// ���� 1000����, ���� 5%, ����� 50����
	// �� ���ɾ�  -����
	}
}
