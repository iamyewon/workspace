package firstproject2;

public class Rect { // 사각형 클래스
	int width;
	int height;
	
	
	//사이즈를 세팅할것이라고 메서드 이름을 지어줬음.. 기능을 알수있게.
	void setSize(int w, int h) { //받아온 값 w,h를
		this.width=w; 			// 클래스 변수 width와 height에 넣어주는 메서드.
		this.height=h;			// 처음에 이렇게 적고 this 는 헷갈리면 없어도 된다고 뺌 .. 
	}
	
	
	//사이즈를 출력할것이라고 메서드 이름을 지어줬음. 
	void printSize() {
		System.out.println("가로는"+width+"이고, 세로는 "+height+"입니다.");
	}
	
	
}
