package firstproject2;

public class MethodEx2 { //x�� Ŭ��������, �޼��嵵 Ŭ���� �Ҽ��̴�
	int x; //0
	void plus() { //void �� ���� �޼���� �޼��� ��ü�� ����Ǹ鼭 ��.
		System.out.println(x+10); // ���Ⱑ ����Ǹ鼭 ����.
		
	}
	
	void plus(int y) {//�����ε�-�Ű������� ����, Ÿ��, ������ ���� �̸��� ������ �ٸ� �޼���
		System.out.println(x+y);
	}
	
	
	
	
	public static void main(String[] args) { //������ ������� ����ȴ�.
		MethodEx2 me = new MethodEx2();
		me.plus(); 
		me.x=10; // int x ���� �޼����..
		me.plus();
		me.plus(100); // int y ���� �޼���..��,,
	}
	
}