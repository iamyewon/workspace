package firstproject3;

//메소드는 하나지만 값을 여러개 받을 수 있다........... 

public class ParameterEx {
	void sum(int ... i) {
		// 가변인자
		// 배열로 취급하면 된다
		//여러개 받을 수 있는 변수는 한개만 쓸 수 있다.
		//다른 타입의 변수도 같이 받고 싶다면 앞에 써야한다.
		// (String s, int ... i) -> 이렇게 여러개 받는 것 앞에다가 다른 타입 변수를 씀.
		//sum(10) <= int 타입의 매개변수의 개수를 무한대.
		
		int s = 0;
		for(int x=0;x<i.length;x++) { //배열로 취급하기때문에 length를 씀.
			s=s+i[x]; // 배열로 취급.... 
		}
		System.out.println(s);
		
		
	}
	
	public static void main(String[] args) {
		ParameterEx pe = new ParameterEx();
		pe.sum(10,20,30,40,50);
		pe.sum(20);
		//메소드는 하나뿐인데 값을 여러개 넣어줄 수 있는.....?
	}
	
}
