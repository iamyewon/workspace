package project719;

public class CarMethod {
	Engine makeEngine() { //Engine이 반환형이다. int, String 같은 개념. => 결과가 Engine이다. 
//		Engine e=null; -에러남	//반드시 return이 있어야 하고, return 뒤에는 생성된 Engine이 있어야한다.
		Engine e = new Engine(); // 이렇게 바꿔줘야 printInfo에서 오류안남.
		
		return e; // class변수가 아니면 반드시 변수에 초기값을 줘야한다.
	}
	
	
	//메서드를 통해서 객체 생성하기 - 생성된 객체를 이용해서 다른 객체 사용하기.
	public static void main(String[]args) {
		CarMethod cm = new CarMethod();
		
//		Car c = new Car(engine, type)
		Car c = new Car(cm.makeEngine(),"스포츠카");
		//현재 상태에서는 makeEngine()으로 가져온 엔진은 만들어지지 않았음. new 를 하지않아서 ! 		
		c.printInfo(); // => null 어쩌구 오류 뜸.
		
		
		//이렇게 해도됨........
//		Engine e = new Engine();
//		Car c2 = new Car(e,"스포츠카");
	}
}
