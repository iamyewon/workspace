package project719;

public class Vending2 {
		int money;
		String drink;
		
	void calcChange(String drink, int money) {
		if(drink.equals("콜라")) {//1000
			this.money=money-1000;			
		}else if(drink.equals("사이다")) {//800
			this.money=money-800;			
		}else if(drink.equals("커피")) {
			this.money=money-600;
		}else if(drink.equals("환타")) {
			this.money=money-400;
		}else if(drink.equals("제로콜라")) {
			this.money=money-200;
		}else if(drink.equals("생수")) {
			this.money=money-100;
		}else if(drink.equals("포카리")) {
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
		machine.calcChange("콜라", 10000);
		machine.printMoney();
		machine.calcChange("사이다", 10000);
		machine.printMoney();
	}
	
	
}
