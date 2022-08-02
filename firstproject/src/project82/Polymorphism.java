package project82;

interface Number{}

//매개변수를 타입 하나로 퉁치려고.. //instanceof로 실제타입이 뭔지 알 수 있음 //강사님코드참고
class Inte implements Number{}
class Floa implements Number{}
class Doubl implements Number{}


public class Polymorphism {
	
/*	void printNumber(Inte i) {}
	void printNumber(Floa f) {}
	void printNumber(Doubl d) {}
	//메서드의 이름은 같지만 매개변수 개수 등이 달라서 오버로딩
*/	void printNumber(Number n) {} //인터페이스로 하나로 묶어서 처리할 수 있다.
//유사한 매개변수를 한번에 받아서 처리할 수 있다. 가 목적.
	
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.printNumber(new Doubl());
		p.printNumber(new Floa());
		p.printNumber(new Inte());
		
	}
}
