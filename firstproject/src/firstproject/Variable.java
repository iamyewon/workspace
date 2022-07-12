package firstproject;


public class Variable { //클래스
	int k; //(k=100;)도 문제없이 가능 // 클래스 변수이다. 클래스 변수는 클래스의 소속{}이다 
	// 이 변수는 이 클래스 내부에 모두가 사용가능함 .전역변수
	String str = "헬로";
	public static void main(String[] args) { //메서드(기능작성하는부분) - 이 메서드도 클래스 소속이다
		//System.out.println(k); // 사용 가능하다. 다만. 그냥 사용은안된다 ==> 메모리에 올려서 사용해야한다.
		
		//k=100; 도 가능..? 여기서 되는건가..?
		
		int i=10; // i는 메서드에 포함된 변수 / 메서드의 영역은 {} 사이 이다. 
		//이 변수는 이 메서드 내부, 즉 = { }안에서만 사용가능함
		int j=10; 
		System.out.println(i==j);
		
		String str1 = "안녕";
		String str2 = new String("안녕"); // new = 새로 메모리에 만들어라
		System.out.println(str1 + ":" + str2);
		System.out.println(str1 == str2);
		
		String str3 = str2; //str2의 값을 넣은게 아니라 주소를 복사해 넣어줌..true뜸
		System.out.println(str2 == str3);
		// 값을 넣어준것이 아니라 같은 주소를 가르킨것이기 때문에 같을수밖에....
		
		String str4 = "안녕";
		System.out.println(str1 == str4);
		//레퍼런스형 변수는 주소가 들어가있으니까,,
		//1에 안녕을 넣고 4에 안녕을 넣어도 다른 주소니까 false가 나와야하는데
		//레퍼런스 변수여도 상수? 안바뀌는값? 을 넣으면......??
		//==> String만 이렇다.. 고 알면됨 
		
		//일반형 변수는 스택에 들어가니까......,,
		// == 는 스택비교 / .equals()는 값비교 
		System.out.println(str1.equals(str2)); // 레퍼런스 타입 값 비교
		//System.out.println(i.equals(j)); //기본 타입은 비교가 안됨
	}

}
