package project719;

public class Engine {
	int cc; //Ŭ���� ����, �ʵ�, ��������
	String oil;
	public Engine() {
		this(2000,"���ָ�"); //������ ���� ????????
	}
	public Engine(int cc, String oil) {
		this.cc=cc; //Ŭ���� ���� cc�� �������� cc�� �־��ش�.
		this.oil=oil;
	}
	public void printInfo() {
		System.out.println(cc+"�����̸�"+oil+"�� ����մϴ�.");
	}
	
	
}
