package firstproject;

public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car(); //같은 폴더(package)에 있으니까 가져와서 쓸 수 있음.. 그냥 막 가져다 쓰면 된다.
		c1.WheelCount=4;
		c1.color="red";
		c1.name="머스탱";
		
		Car c2 = new Car();
		c2.WheelCount=8;
		c2.color="국방색";
		c2.name="육공트럭";
		

		
		// 자바에서 우리가 작성한 클래스는 생성을 여러개 할 수 있는 일종의 틀이다. (ex....붕어빵틀)
		// new 를 통해서 우리는 클래스를 사용할 수 있는 상태로 만든다. (재료넣고 구워만드는것..?)
		
		Car[] cars = new Car[3]; // 배열은 공간할당을 하기 위해서 new를 사용한다. new는 무조건 메모리와 관련있다. 
		//문제 차량 3개를 생성해서 값을넣고 출력하세요. 
		//Car[] cars = new Car[3];는 Car cs1 / Car cs2 / Car cs3 이렇게 공간만 생긴거...
		Car cs1; //int에는 숫자 ---- float에는 실수  ------ String에는 문자열  --------- Car에는 Car; => new+생성자 (생성자는 클래스명(); )
		Car cs2=null; // 기본 값 아닐때는 초기화 할 수 있는건 null뿐,, 메서드 소속 변수는 반드시 초기화 해줘야한다.. - main의 경우는 일반변수는 안해도됨.
		Car cs3;
		cs1 = new Car(); //1.메모리에 올리기
		cs1.name="제네시스"; //2.메모리에 올라가 있는 Car에 이름 cs1이고 그안에 있는 변수 name에다가 "제네시스"를 넣음
		//System.out.prinln(cs2.name); //new를 해줘야만 주소값ㅇ을 가질 수 있다.
		
		cs1.WheelCount=4;

		int i; //i(변수)를 먼저 정의 했고,, 같이할수도 o
		i=10; // 값을 줌.........................
		
		int x[] = new int[10];
		// 변수를 10개 만들었다. -> 값은 아직 안넣었다. 
		x[0]=1;
		
		Car cc[] = new Car[10];
		cc[0] = new Car();
	}
}
