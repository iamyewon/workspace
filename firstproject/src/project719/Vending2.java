package project719;

public class Vending2 {
		int money;
		String drink;
		
	void calcChange(String drink, int money) {
		if(drink.equals("�ݶ�")) {//1000
			this.money=money-1000;			
		}else if(drink.equals("���̴�")) {//800
			this.money=money-800;			
		}else if(drink.equals("Ŀ��")) {
			this.money=money-600;
		}else if(drink.equals("ȯŸ")) {
			this.money=money-400;
		}else if(drink.equals("�����ݶ�")) {
			this.money=money-200;
		}else if(drink.equals("����")) {
			this.money=money-100;
		}else if(drink.equals("��ī��")) {
			this.money=money-1200;
		}
		
		this.drink=drink;
	}
	
	void printMoney() {
		System.out.print(drink);
		System.out.println(money);
	}
	
	
	
	public static void main(String[] args) {
		Vending2 machine = new Vending2();
		machine.calcChange("�ݶ�", 10000);
		machine.printMoney();
		machine.calcChange("���̴�", 10000);
		machine.printMoney();
	}
	
	
}
