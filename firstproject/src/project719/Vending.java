package project719;

public class Vending {
		
		void calcChange(String drink, int money) {
		if(drink.equals("??ī?ݶ?")) { //1000
			System.out.println(drink+" ?ܵ? "+(money-1000));
		}else if(drink.equals("ĥ?????̴?")) { //900
			System.out.println(drink+" ?ܵ? "+(money-900));
		}else if(drink.equals("?????ݶ?")) { //800
			System.out.println(drink+" ?ܵ? "+(money-800));
		}else if(drink.equals("ȯŸ")) { //850
			System.out.println(drink+" ?ܵ? "+(money-850));
		}else if(drink.equals("??????ī?ݶ?")) { //1100
			System.out.println(drink+" ?ܵ? "+(money-1100));
		}else if(drink.equals("???ټ?")) { //400
			System.out.println(drink+" ?ܵ? "+(money-400));
		}else if(drink.equals("??ī??????Ʈ")) { //950
			System.out.println(drink+" ?ܵ? "+(money-950));
		}else {
			System.out.println("???? ???? ?Դϴ?.");
		}
	}
	
	
	
	public static void main(String[] args) {
		Vending machine = new Vending();
		machine.calcChange("??ī?ݶ?", 10000);
		machine.calcChange("ĥ?????̴?", 10000);
		machine.calcChange("?????ݶ?", 10000);
		machine.calcChange("ȯŸ", 10000);
		machine.calcChange("??????ī?ݶ?", 10000);
		machine.calcChange("???ټ?", 10000);
		machine.calcChange("??ī??????Ʈ", 10000);
		machine.calcChange("?ڸ????̵?", 10000);
		
	}
	
	
}
