package firstproject2;

public class MethodEx4 {
	//반환되는 타입을 써야한다 = 결과의 타입
	
	int plus(){ //메서드명은 반드시 소문자로 시작
		//내용
		return 0;
	}
	
	String str() {
		//내용
		return "a";
	}
	
	double dr() {
		//내용
		return 0.0;
	}

	
// 반환형과 return 뒤에 값은 반드시 타입이 같음.
// 반환형이 있는 메서드는 변수에 담을 수 있다.
// 이때 변수의 타입은 반환형의 타입이다.
// ===============================
// 앞전에 쓰던 void.. 
/*	void sss() {
		
	}*/
	
	public static void main(String[] args) {
		MethodEx4 me = new MethodEx4();
		//me.str();
		String s = me.str(); // 위의 문장을 이렇게 변수에 담는 형태로 쓸 수 있다. 
		// s에는 return 뒤에 있는 내용이 담긴다.
		System.out.println(s);
		System.out.println(me.str());
		// 위의 두 문장은 같은 말.
	}
	
}
