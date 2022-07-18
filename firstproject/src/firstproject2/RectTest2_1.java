package firstproject2;

public class RectTest2_1 { // 사각형을 만들어서 쓰는 클래스
	public static void main(String[] args) {
		Rect r = new Rect(); // 사각형이라는 클래스
		
		
	//최대크기는 가로1000, 세로1000
		r.setSize(500,700); // 가로 100, 세로100 크기의 사각형이 만들어짐
	// 메서드에서 제어를 통해 잘못된 값이 들어가지 않게 막을 수 있다. ,,인데 안됨
		
		
//		Rect r2 = new Rect(500,200); //setSize를 안해도 된다.
//		
		//문제발생
//		r.height=2000;
//		r.width=1500; 
		// 그냥 넣으면 최대크기 제어가 안됨..
		// 그래서 메서드.......?
		
		

		
		r.printSize(); //가로는 100 세로는 100 인 사각형 입니다. => 이렇게 출력을 원함.
		
		
	}

}
