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
		System.out.println("실 수령액은 "+(salary-(salary*tax)-insurance)+"원 입니다.");
	}
	
}

public class Salary1 {
	//월급
	public static void main(String args[]){
	    Salary s = new Salary();
	    s.insertSalary(1000);
	    s.calTax(5);
	    s.calInsurance(50);
	    s.showRealSalary();
	// 월급 1000만원, 세금 5%, 보험료 50만원
	// 실 수령액  -만원
	}
}

