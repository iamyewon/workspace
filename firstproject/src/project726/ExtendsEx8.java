package project726;

class Ext8Parents{
	int x;
	
	public void printExt8Parents() {
		x++;
		System.out.println("부모 클래스"+x);
	}
}

class Ext8Child extends Ext8Parents{
	int y;
	
	public void printExt8Child() {
		y++;
		System.out.println("자식 클래스"+y);
	}
}


public class ExtendsEx8 {
	public static void main(String[] args) {
		Ext8Parents p = new Ext8Child();
		p.printExt8Parents();
	//	p.printExt8Child(); // 비록 만들기는 자식 클래스를 만들었지만, 부모 클래스 타입으로 바뀌었기 때문에
							// 자식 클래스 메서드는 사용 불가능.
	//	Ext8Child c = new Ext8Parents(); // 당연히 안됨. //부모를 생성해서 자식에 넣을 수 없다.
		Ext8Child c = (Ext8Child) p; // 강제적으로 형변환해서 사용가능해짐 , 앞에다 클래스를 넣어주면서 가능..
		c.printExt8Child();
		
		
	}
}
