package project719;

public class StringTest {
	//�����ε� add �޼��� - �޼��� �̸� ���� �� ��ȣ�ȿ� �Ű������� ����, Ÿ��, ���� �ٸ��� �ؼ� �������� ���� �̸� �޼��带 �ٸ��� ����ϴ� ��.
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
		st.add("�ȳ�");
		st.add(true);
		st.add(1);
		st.add("�氡");
		st.showData();
	}
	
}
