package firstproject2;

public class Rect2_1 { // 사각형 클래스
	private int width;
	private int height;
	//private?.. 이 클래스 안에서만 사용할 수 있는..
	
	
//	Rect(){} // 자동으로 만들어지기만 하면 되는 빈 생성자
//	
//	Rect(int w, int h){ //생성자가 하나라도 있으면 빈생성자는 없어지므로 
//		width=w;		// 따로 만들어 줘야함.
//		height=h;
//	}
//	
	
	//사이즈를 세팅할것이라고 메서드 이름을 지어줬음.. 기능을 알수있게.
	void setSize(int w, int h) { //받아온 값 w,h를
//		this.width=w; 			// 클래스 변수 width와 height에 넣어주는 메서드.
//		this.height=h;			// 처음에 이렇게 적고 this 는 헷갈리면 없어도 된다고 뺌 .. 
//	}
		if(w>=1000)w=1000; //괄호없으면 한줄로
		if(h>=1000) {
			h=1000;
		}
		
		width=w;
		height=h;
		
	}
	
	
	
	//사이즈를 출력할것이라고 메서드 이름을 지어줬음. 
	void printSize() {
		System.out.println("가로는"+width+"이고, 세로는 "+height+"입니다.");
	}
	
	
}
