package project726;

class Parent{
	public void method1() {
		System.out.println("Parent-method1()");
	}
	public void method2() {
		System.out.println("Parent-method2()");
	}
}

class Child extends Parent{
	@Override
	public void method2() {
		System.out.println("Chile-method2()"); // 재정의
	}
	public void method3() {
		System.out.println("Chyild-method3()");
	}
}
public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; // 자동 타입 변환
		parent.method1();
		parent.method2(); // 재정의된 메소드가 호출됨
		// parent.method3(); // 호출 불가능
	}

}
//책336-337p