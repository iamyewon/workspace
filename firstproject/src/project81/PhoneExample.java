package project81;
//실행클래스

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); => 에러남 
		//Phone phone = new Phone(null){}; 이렇게 중괄호 넣어서 는 가능.. 굳이X 문법적으론 문제없지만 사용x
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn(); //phone의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff(); //phone의 메소드
		
	}
}
