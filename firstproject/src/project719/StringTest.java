package project719;

public class StringTest {
	//오버로딩 add 메서드 - 메서드 이름 같을 때 괄호안에 매개변수의 순서, 타입, 개수 다르게 해서 여러개의 같은 이름 메서드를 다르게 사용하는 것.
	String s;
	boolean b;
	int i;
	
	void add(String s){
		this.s=s;
	}
	void add(boolean s) {
		this.b=s;
	}
	void add(int s) {
		this.i=s;
	}
	void showData() {
		System.out.println(s+b+i);
	}
//	public void add(String str) 
//	{
//		this.str=str;
//	}
//	public void add(String str, boolean y, int i) {
//		this.str=str;
//		this.y=y;
//		this.i=i;
//	}
//	
//	public void showData() {
//		System.out.println(str+y+i);
//	}
//	
	
	public static void main(String[] args) {
		StringTest st = new StringTest();
		st.add("안녕");
		st.add(true);
		st.add(1);
		st.add("방가");
		st.showData();
	}
	
}
