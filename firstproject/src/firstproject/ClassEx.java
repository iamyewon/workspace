package firstproject; // 이거 왜생김..

public class ClassEx {
	int k; //클래스 변수 - 전역변수는 값을 안넣으면 알아서 초기화된다.
	double d;
	boolean b;
	String str;
	
	
public static void main(String[] args) {
	//클래스 소속 변수는 그냥 사용이 안된다. 반드시 메모리에 올려서 사용해야한다.
	// => 메모리에 새로(new) 올려라. 
	// new 메모리에 값으로 등록하라. 
	
	//System.out.println(k);
	//System.out.println(str); 
	// 위에 둘다 작동 안됨 (new 하기전까진)
	
	String str = "헬로"; // 메서드 소속 변수이다. 그냥 사용가능 
	//문자열타입 변수 = 문자열 
	//이 타입에 맞는 값을 변수에 넣는다. 라는 뜻임 
	
	
	//ClassEx ce = ClassEx 타입을 넣으면 된다.
	//int x = 숫자 // 이렇게 넣듯이..
	//System.out.println(k); // 아직 메모리에 올라가있지 않은 변수k
	//\ClassEx ce = new ClassEx(); //ce에는 만들어진( 메모리에 올라가있는) ClassEx 가 담겨있다.
	//ce.k=100;
	//System.out.println(ce.k); // 메모리에 올려져있는 변수k //ce클래스안에있는..?
	// => 클래스 소속 변수 일때만 이렇게 사용.
	// 클래스 변수 - 전역변수는 정의는 그냥 하면 되지만 사용은 반드시 new 이후에 가능 (메모리에 올린 이후)
	
	//ClassEx ce2 = new ClassEx();
	//ce2.k=200;
	//System.out.println(ce2.k);
	
	//System.out.println(ce.k);//같다면 200, 틀리다면 100
	//System.out.println(ce2.k);
	
	
	ClassEx ce3 = new ClassEx();
	System.out.println(ce3.k);//정수
	System.out.println(ce3.d);//실수
	System.out.println(ce3.b);//불리언
	System.out.println(ce3.str);//문자열
	
	//System.out.println(ce3.str.equals(null)); //는 불가
	System.out.println(ce3.str==null);
	//null 은 값 비교 x 
}
}
