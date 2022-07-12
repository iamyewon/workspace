package firstproject;
class Car238{

		String company;
		String model; 
		String color;
		int price; 
			
	
Car238(){ //아무것도 없는 생성자 만들어줘야함..
	// 생성자(메서드) 이름은 Car238() 똑같다. () 괄호 안에 있는 타입, 개수, 순서
	model="제네시스"; // 이게 다르다면 오버로딩 되어있다고 함..
	color="검정";
	price=1000;
}

Car238(String str){
	/*Car238(String model){
	model=model; // 클래스 변수의 model = 받아온 변수가 담긴 model .......
	==>
	this.name=name;
	this.color="빨강";
	this.price=800; // this는 이클래스를 가르키고,
					// this.price는 이 클래스 변수 price를 말한다. 
	}
	*/
//	model=str; 
//	color="빨강";
//	price=800;  원래 이렇게 되어있던 애들을 아래처럼 this. 를 넣어서 바꿔줌.
	
	
	this.model=str; 
	this.color="빨강";
	this.price=800;
	
}
Car238(String str,String str2){
	this.model=str;
	this.color=str2;
	this.price=700;	
}

Car238(String model,String color, int price){ //this.~ = 뒤에 도 바꿔줌.. 
	this.model=model;
	this.color=color;
	this.price=price;
} 

}
public class Car239 {
	public static void main(String[] args) {
		
		Car238 car1 = new Car238();
		Car238 car2 = new Car238("그랜저");
		Car238 car3 = new Car238("그랜저","흰색");
		Car238 car4 = new Car238("그랜저","흰색",300);
		
		System.out.println(car1.model+" "+car1.color+" "+car1.price);
		System.out.println(car2.model+" "+car2.color+" "+car2.price);
		System.out.println(car3.model+" "+car3.color+" "+car3.price);
		System.out.println(car4.model+" "+car4.color+" "+car4.price);
		
		}
	}



// 오버 라이딩 -원래 있던(상속받아서 내부적으로 가지고 있던) 메서드의 내용을 재정의(새로쓰기)하는것.
// 오버 로딩 - 메서드(생성자) 이름이 같지만 타입이나, 개수, 순서를 다르게 해서 같은 이름으로 사용하는 것.