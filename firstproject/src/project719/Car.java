package project719;

public class Car {
	Engine engine; //3. 여기 engine으로 들어옴.. 결국 1=3
	String type;
	int speed;
	public Car() {
		this(new Engine(),"세단",250); //1! // 여기의 Engine은 생성된 값을 받아 올 수 없다. 그래서 여기서 직접 생성해 버린다. 
	}
	public Car(Engine engine, String type) { //1. 여기engine이
		this(engine,type,250); //2!  //여기의 Engine은 다른곳에서 new 한 것을 받아온다.
	}
	public Car(Engine engine, String type, int speed) {
		this.engine=engine; //1!,2!를 모두 여기의 engine에 보내기 위함..임 ..?
		this.type=type;
		this.speed=speed; //2.여기 engine으로 들어오고.
	}
	public void printCom() { // 메서드로 여러개 끊으면 좋은점은, 코드를 정리하기 쉽다(기능별로 나눠보기)
		System.out.println("현대");
	}
	
	public void printInfo() { 
		printCom(); // 내부 메서드는 안에서 자유롭게 사용가능하다.
		engine.printInfo(); //엔진한테 던져줘서 엔진에 있는 정보를,, // 메서드에서 메서드호출하기.
		System.out.println("차종은"+type+"이고 최대속도는"+speed+"입니다.");
		//생성자들만 이용해서.. 값을 바꿔쓸수..ㅇㅇ
	}
	public static void main(String[] args) { //코드 분석은 항상 main 에서부터 따라감
		Car c = new Car(); // new 했으니까 차 한대 생산한것임.
		c.printInfo(); // 이미 많은 정보가 들어가 있다. 
		
		Car c2 = new Car(new Engine(),"트럭",200); // 기본정보 엔진을 쓰려면 내부적으로 쓰면됨. 객체는 무조건 new를 쓰면됨..
		c2.printInfo();
		
		Car c3 = new Car(new Engine(3000,"디젤"),"버스",230);
		c3.printInfo();
	}
	
}
