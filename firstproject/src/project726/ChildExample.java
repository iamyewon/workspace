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
		System.out.println("Chile-method2()"); // ������
	}
	public void method3() {
		System.out.println("Chyild-method3()");
	}
}
public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; // �ڵ� Ÿ�� ��ȯ
		parent.method1();
		parent.method2(); // �����ǵ� �޼ҵ尡 ȣ���
		// parent.method3(); // ȣ�� �Ұ���
	}

}
//å336-337p