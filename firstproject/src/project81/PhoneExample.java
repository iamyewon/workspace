package project81;
//����Ŭ����

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); => ������ 
		//Phone phone = new Phone(null){}; �̷��� �߰�ȣ �־ �� ����.. ����X ���������� ���������� ���x
		
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn(); //phone�� �޼ҵ�
		smartPhone.internetSearch();
		smartPhone.turnOff(); //phone�� �޼ҵ�
		
	}
}
