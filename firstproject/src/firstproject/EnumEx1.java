package firstproject;


class Aircon{
	int power;
	
}

//========================================= 따로 끊어서 클래스 하나 더 만들수 o

public class EnumEx1 {
public static void main(String[] args) {
	//상수 = 변하지 않는 수      <---> 변수 - 변수는 값을 넣을 수 있는 공간
	//ex)100, "안녕"  등등..
	//상수는 항상 고정되어 있는 값...
	
	Aircon a = new Aircon();
	final int ON = 1;  // 값이 고정이라는 의미로,, 더이상 변하지 않는...
	final int OFF = 0; // 1이나 0만으로는 의미하는 바를 모르니까 변수 명을 알기 쉽게 해놓고 사용할 수 있게.
	// final을 붙이면 절대 변경되지 않음. ON=2는 절대 불가능 
	
	
	a.power=ON; // 외부로부터 입력받는다고 가정 
	if(a.power==ON) {
		System.out.println("전원 켜짐");
	}else if(a.power==OFF) {
		System.out.println("전원 꺼짐");
	}
	
	
	
}
}
