package firstproject2;

public class MethodEx7 {
	//여기에 메서드 만들기.
	int plus(int x, int y){ 
		return (x+y);
	}
	int minus(int x, int y) {
		return (x-y);
	}
	int multi(int x, int y) {
		return (x*y);
	}
	double divide(int x, int y) {
		return ((double)x/(double)y);
	} // int 타입을 강제로 double타입으로 변환.
	
/*	   	int plus(int x, int y){
		int a = x+y; 
		
		return a;
		}
		이렇게 써도 됨.
	*/ 
	
	
	

	public static void main(String[] args) {
		MethodEx7 me = new MethodEx7();
		System.out.println(me.plus(100,50)); //150
		System.out.println(me.minus(100,50)); //50
		System.out.println(me.multi(100,50)); //5000
		System.out.println(me.divide(100,30)); //2
	}
}
