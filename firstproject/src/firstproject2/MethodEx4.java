package firstproject2;

public class MethodEx4 {
	//��ȯ�Ǵ� Ÿ���� ����Ѵ� = ����� Ÿ��
	
	int plus(){ //�޼������ �ݵ�� �ҹ��ڷ� ����
		//����
		return 0;
	}
	
	String str() {
		//����
		return "a";
	}
	
	double dr() {
		//����
		return 0.0;
	}

	
// ��ȯ���� return �ڿ� ���� �ݵ�� Ÿ���� ����.
// ��ȯ���� �ִ� �޼���� ������ ���� �� �ִ�.
// �̶� ������ Ÿ���� ��ȯ���� Ÿ���̴�.
// ===============================
// ������ ���� void.. 
/*	void sss() {
		
	}*/
	
	public static void main(String[] args) {
		MethodEx4 me = new MethodEx4();
		//me.str();
		String s = me.str(); // ���� ������ �̷��� ������ ��� ���·� �� �� �ִ�. 
		// s���� return �ڿ� �ִ� ������ ����.
		System.out.println(s);
		System.out.println(me.str());
		// ���� �� ������ ���� ��.
	}
	
}