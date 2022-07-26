package project726;

class Ext6 {//부모 클래스라고 특별한건 아니다. 
	int x;
	String str;
	
	void printExt6() {
		System.out.println("Ext6");
	}
}

class ExtendsEx6_2 extends Ext6{}
class ExtendsEx6_3 extends Ext6{}
class ExtendsEx6_4 extends Ext6{}





public class ExtendsEx6 extends Ext6{ //상속 받았다. == ExtendsEx6 + Ext6
	int y;
	int z;
	double[] dd;
	
/*상속 받아서
	
	int x; (= super.x)
	String str; (= super.str)  와 같이 부모의 메서드를 super라고 함.
		
	void printExt6() {
		System.out.println("Ext6"); 
	}
	이부분 = super 를 들고있다.
	
 상속 받은 내용 전체는 눈에 보이지는 않음 
 */
	
	void printExt6() {
		System.out.println("Ext6"); // 상속받은 클래스가 들고 있는 메서드와 똑같은 내 메서드
	}								// 오버라이딩 되었다.
	void printClass() {
		System.out.println("ExtendsEx6");	 
 	}
}


//상속하는 이유 -> 동일한 작업을 묶어서 재사용.
// => 이작업이 필요한 다른 더 큰 클래스에서 가져다 쓴다.