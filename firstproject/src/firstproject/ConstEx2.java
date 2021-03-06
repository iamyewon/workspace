package firstproject; 
// 한 java 파일에 클래스가 여러개 있을 수 있다. - 하지만 public 은 반드시 하나만 있어야 한다.  
class ConEx1{
	int i;
	String str;
	
	ConEx1(){// (클래스 변수)를 초기화하는 역할
		// 원래 있던 것의 내용을 바꿨다 - 오버라이딩 
		i = 10;
		str = "반갑";
				
	}
	
	ConEx1(int k){
		//형태가 똑같을 경우 컴퓨터는 여러개중 어떤건지 몰라서 에러발생. 
		// 그래서 형태를 다르게 해야한다.
		i=20;
		str="안녕";
	}
	
	ConEx1(int k, int p){
		i=30;
		str="헬로";
	}
	
}


public class ConstEx2 {
	//생성자(Constructor) - 클래스와 이름이 같다(대소문자까지 똑같아야함)
	//언제 사용되나 ? - 생성할때 -> 위치가 정해져 있다 라는 이야기 -> new 뒤에 쓴다. 이 위치말고는 쓸일없음 
	//뭐하는애? - 생성할때 초기값을 주는 역할. (초기화 하는 역할)
	//여러개를 작성해 놓을 수 있고, 하나도 없다면 아무내용없는 빈 생성자를 가상머신이 하나 생성해줌..
	//-> 기본 생성자 = 가상머신이 만들어 준것.
	//하나라도 있으면 반드시 그것을 써야한다.
	
	public static void main(String[] args) {
		ConEx1 ce = new ConEx1(); // 괄호에 아뭄것도 없으니까  ConEx1() 실행
		System.out.println(ce.i);
		System.out.println(ce.str);
		
		
		//ConEx1(int k) 이 생성자를 쓰고 싶다.
		ConEx1 ce2 = new ConEx1(5); //ConEx1(int k) <= k에  5가들어간다.
		//ConEx1 ce2 = new ConEx1(k);  이런식으로 하면 안됨.. 없는값에 변수를 넣어주는것..이됨? 
		// 그래서 new할때 실제 값을 넣어줘야한다
		// new 할때는 실제 값을 가지고 생성해야하기때문에. 
		// new 는 실제로 만들어지는 과정이다. 그러므로 정의 (int k)가 들어가면 안된다.
		// 우리는 정의된 클래스에 실제 값을 넣어서 생성한다.
		// => new 가 아닐때는 정의하고 new뒤에는 실제값을 쓴다는 것이 핵심.
		
		
//		ConEx1(5.10)
		
	}
}
