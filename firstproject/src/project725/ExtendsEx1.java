package project725;

class Ext1{
	int x;
	int y;
	public void printExt1() {
		System.out.println(x+":"+y);
	}
}

public class ExtendsEx1 extends Ext1{ //extends Ext1 상속받는코드
	//내부적으로 Ext1 을 가지고 있다.. Ext1를 상속받음
	
	public static void main(String[] args) {
		//Ext1 e = new Ext1(); 원래는 이런식으로 가져왔음
		ExtendsEx1 ee = new ExtendsEx1();
		ee.printExt1(); // 부모의 메서드를 사용하고 있다.
		System.out.println(ee.x); //부모의 변수도 내 것처럼 사용 가능하다.
	}
	
	
}
