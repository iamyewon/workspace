package project82;

interface Tire{void printInfo();}

class Kumho implements Tire{

	@Override
	public void printInfo() { }
	public void setKumho() { }
	
}

class Hankook implements Tire{

	@Override
	public void printInfo() { }
	public void setHankook() { }
	
}

class Michelin extends Hankook{
	void setMichelin() {}
}


public class CastingEx {
	public static void main(String[] args) {
	Hankook h = new Hankook();
	h.setHankook();
	Kumho k = new Kumho();
	k.setKumho();
	
	Tire t1 = new Hankook();
	// t1.setHankook(); // �������̽����� ���� ����
	Tire t2 = new Kumho(); //new ��ȣ �κ��� t2�� ���� 
	//t2�� ��ȣŸ������ �ٲ�鼭 �ٽ� k2�� �ٲ�
	Kumho k2 = (Kumho) t2;
	k2.setKumho(); //k2�� ���󰡺��� �� ó���� ����������� Kumho �̹Ƿ� ������ k2�� Kumho() �̴�.
	
	Tire t3 = new Tire() { //����� ��ȣ Ÿ���� �ƴ϶� Ÿ�̾�Ÿ������ ó���� ������µ� ��ȣŸ������ ��ȯ....x

		@Override
		public void printInfo() {}
		
	};
	
	Kumho k3 = (Kumho) t3;
	k3.setKumho(); // ���� �߻� -> �������̽����� �������� �κа� ���̺����
	//
	
	
	
	Hankook m = new Michelin();
	//m.setMichelin(); // ����϶��� �翬�� �ȵ�.  //��������� �ѱ������� t1���� �ٲ�鼭 Ÿ�̾�Ÿ���� t1���� �ٲ��.. �ѱ����� ���� �̽����̴ϱ�........?????
	}
}