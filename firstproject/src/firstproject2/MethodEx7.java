package firstproject2;

public class MethodEx7 {
	//���⿡ �޼��� �����.
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
	} // int Ÿ���� ������ doubleŸ������ ��ȯ.
	
/*	   	int plus(int x, int y){
		int a = x+y; 
		
		return a;
		}
		�̷��� �ᵵ ��.
	*/ 
	
	
	

	public static void main(String[] args) {
		MethodEx7 me = new MethodEx7();
		System.out.println(me.plus(100,50)); //150
		System.out.println(me.minus(100,50)); //50
		System.out.println(me.multi(100,50)); //5000
		System.out.println(me.divide(100,30)); //2
	}
}
