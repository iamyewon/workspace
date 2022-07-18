package firstproject2;

class Bonus{
	double bonus;
	int income;
	

	void setBonus(int b) { // 보너스 세팅..
		bonus = b*0.01;	
	}
	void setIncome(int i) { // 연봉 세팅..  
		income = i*10000;
	}
	void printIncome() {
		System.out.println("연봉은"+income+"원 입니다.");
		System.out.println("연봉에 따른 보너스는"+(income*bonus)+"원 입니다.");
	}
	
}

public class BonusTest {
	public static void main(String[] args) {
		// 3개 만듬
		// 보너스가 몇프로 인지 입력 (10) <= 10%를 의미
		// 보너스 세팅하는 메서드 1개
		
		// 연봉 세팅하는 메서드 (5000) <= 5000만원
		
		// 연봉, 연봉 기준 보너스 출력하는 메서드 () <== 내용 필요 없음.
		
		Bonus per = new Bonus(); //실행시킨다 = 메모리에올린다.
		per.setBonus(10);  // 10을 입력해도 실제는 10퍼센트.
		per.setIncome(5000);  // 5000을 입력해도 실제는 50000000만원.
		
		per.printIncome();

	}
}


