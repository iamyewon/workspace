package firstproject;


public class Variable { //Ŭ����
	int k; //(k=100;)�� �������� ���� // Ŭ���� �����̴�. Ŭ���� ������ Ŭ������ �Ҽ�{}�̴� 
	// �� ������ �� Ŭ���� ���ο� ��ΰ� ��밡���� .��������
	String str = "���";
	public static void main(String[] args) { //�޼���(����ۼ��ϴºκ�) - �� �޼��嵵 Ŭ���� �Ҽ��̴�
		//System.out.println(k); // ��� �����ϴ�. �ٸ�. �׳� ������ȵȴ� ==> �޸𸮿� �÷��� ����ؾ��Ѵ�.
		
		//k=100; �� ����..? ���⼭ �Ǵ°ǰ�..?
		
		int i=10; // i�� �޼��忡 ���Ե� ���� / �޼����� ������ {} ���� �̴�. 
		//�� ������ �� �޼��� ����, �� = { }�ȿ����� ��밡����
		int j=10; 
		System.out.println(i==j);
		
		String str1 = "�ȳ�";
		String str2 = new String("�ȳ�"); // new = ���� �޸𸮿� ������
		System.out.println(str1 + ":" + str2);
		System.out.println(str1 == str2);
		
		String str3 = str2; //str2�� ���� ������ �ƴ϶� �ּҸ� ������ �־���..true��
		System.out.println(str2 == str3);
		// ���� �־��ذ��� �ƴ϶� ���� �ּҸ� ����Ų���̱� ������ �������ۿ�....
		
		String str4 = "�ȳ�";
		System.out.println(str1 == str4);
		//���۷����� ������ �ּҰ� �������ϱ�,,
		//1�� �ȳ��� �ְ� 4�� �ȳ��� �־ �ٸ� �ּҴϱ� false�� ���;��ϴµ�
		//���۷��� �������� ���? �ȹٲ�°�? �� ������......??
		//==> String�� �̷���.. �� �˸�� 
		
		//�Ϲ��� ������ ���ÿ� ���ϱ�......,,
		// == �� ���ú� / .equals()�� ���� 
		System.out.println(str1.equals(str2)); // ���۷��� Ÿ�� �� ��
		//System.out.println(i.equals(j)); //�⺻ Ÿ���� �񱳰� �ȵ�
	}

}