package project81;
//�߻� Ŭ����

public abstract class Phone { //�����ڸ� ����ȭ ��Ų��. (������ �̷��Դ� ��������)
	//�ʵ�
	public String owner;
	
	//������
	public Phone(String owner) {
		this.owner = owner;
		
	}
	
	//�޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
		
	}
	
}
