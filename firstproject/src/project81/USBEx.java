/*package project81;

interface USBA{
	String TYPE = "A";
	void speed();
	void printType();
}

interface Samsung extends USBA {// 인터페이스는 인터페이스를 상속할 수 있다. // 그냥 두개의 인터페이스 더하기라고 생각하면 된다. 
	void warranty();
}


public class USBEx implements USBA,Samsung{ //USBA를 없애도 된다. 

	@Override
	public void warranty() {
		// TODO Auto-generated method stub
		
	}
	//상속은 반드시 1개만 가능하지만 구현(inplements)은 여러개 가능함
}

public class USBEx implements USBA {

	@Override
	public void speed() {
	System.out.println("2.0 스피드 입니다.");
		
	}

	@Override
	public void printType() {
		System.out.println("A타입, 브랜드 삼성");
		
	}
	
	public static void main(String[] args) {
		USBEx ue = new USBEx();
		ue.speed();
		ue.printType();
	}

}
*/