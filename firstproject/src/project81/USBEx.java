/*package project81;

interface USBA{
	String TYPE = "A";
	void speed();
	void printType();
}

interface Samsung extends USBA {// �������̽��� �������̽��� ����� �� �ִ�. // �׳� �ΰ��� �������̽� ���ϱ��� �����ϸ� �ȴ�. 
	void warranty();
}


public class USBEx implements USBA,Samsung{ //USBA�� ���ֵ� �ȴ�. 

	@Override
	public void warranty() {
		// TODO Auto-generated method stub
		
	}
	//����� �ݵ�� 1���� ���������� ����(inplements)�� ������ ������
}

public class USBEx implements USBA {

	@Override
	public void speed() {
	System.out.println("2.0 ���ǵ� �Դϴ�.");
		
	}

	@Override
	public void printType() {
		System.out.println("AŸ��, �귣�� �Ｚ");
		
	}
	
	public static void main(String[] args) {
		USBEx ue = new USBEx();
		ue.speed();
		ue.printType();
	}

}
*/