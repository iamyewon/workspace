package firstproject3;

//�޼ҵ�� �ϳ����� ���� ������ ���� �� �ִ�........... 

public class ParameterEx {
	void sum(int ... i) {
		// ��������
		// �迭�� ����ϸ� �ȴ�
		//������ ���� �� �ִ� ������ �Ѱ��� �� �� �ִ�.
		//�ٸ� Ÿ���� ������ ���� �ް� �ʹٸ� �տ� ����Ѵ�.
		// (String s, int ... i) -> �̷��� ������ �޴� �� �տ��ٰ� �ٸ� Ÿ�� ������ ��.
		//sum(10) <= int Ÿ���� �Ű������� ������ ���Ѵ�.
		
		int s = 0;
		for(int x=0;x<i.length;x++) { //�迭�� ����ϱ⶧���� length�� ��.
			s=s+i[x]; // �迭�� ���.... 
		}
		System.out.println(s);
		
		
	}
	
	public static void main(String[] args) {
		ParameterEx pe = new ParameterEx();
		pe.sum(10,20,30,40,50);
		pe.sum(20);
		//�޼ҵ�� �ϳ����ε� ���� ������ �־��� �� �ִ�.....?
	}
	
}
