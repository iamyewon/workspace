package firstproject2;

public class MethodEx5 {
	public static void main(String[] args) {
		String str = "abcdefg";
		String str2 = new String("abcdefg");
//		String str3 = new String();
//		str3 = "abcdefg" str.set? text? ��� �����������ִµ� ���ϱ��.
		
	//	str.charAt(index)
//		charAt ���� ���� int ������� �Ǿ�����.
		char c = str.charAt(0); //���������� ������ ������...? - 0��°�� a�� ������?? --> ����x
		//char c2 = str.charAt(100); //api ���鼭 ������ �д´ٸ�  --> 100��° ���ڴ� �����ϱ�..����,,,,?
						 // �� �޼��尡 �ϴ���, �Ű������� �ǹ� ���� �˼��ִ�. 
		
		int i = str.indexOf("d"); // ->d�� ���°�� �ִ���.
		
		System.out.println(c);
		//System.out.println(c2);
	}
}