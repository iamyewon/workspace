package project719;

public class StaticEx2 { // static은 new 안해도 쓸 수 있다.
	public static void main(String[] args) {
		
		
		
		//변하지 않는 자주쓰는 변수나 메서드를 주로 정적처리 하여 사용한다. 
		
		System.out.println(Math.PI); // Math라는 기능에 있는 PI를 그냥 가져다 쓸 수 있음. PI는 절대 변하지 않는 값이기 때문에 만들어놨음.
		System.out.println(Math.random()); // Math를 생성한 적이 없다. 그러나 사용가능함. 
		
		System.out.println(Static.i); // 정적 변수 클래스명. 변수로 접근 가능
		
		
		
//		Static s = new Static();//이 두문장이 정상적인 방법
//		System.out.println(s.j);
		
		
	}
}
