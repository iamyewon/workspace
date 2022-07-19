package project719;

class Constructor{
	int num;
	String str;
	
	//생성자 하나만 잘 만들면 된다. 중복 코드가 줄어든다.
	
	public Constructor() {//괄호안에 매개변수 개수, 타입, 순서가 달라야한다.
		this("안녕",10); //1   //this는 이 클래스를 의미하고, super는 부모 클래스를 의미한다.
	}
	public Constructor(int a) {
		this("안녕",a);//Constructor("안녕",a); 와 같다. //2
	}
	public Constructor(String s, int a) { //this는 클래스명이라고 생각하면 된다.
		//s가 str이라하고 a가 num이라 치면.. num=num;이되고 str=str;이 되는데. 그래서 this를 써줌..
		this.num=a; //Constructor.num 의 의미이다.
		this.str=s; //1과 2가 3번째 식을 부르고 있다......??
		//this 를 쓰는 이유는 변수 명이 같았을 때 명확하게 해주기 위해서이다.
	}
}



public class ConstructorEx {
	public static void main(String[] args) {
		
	}
}
