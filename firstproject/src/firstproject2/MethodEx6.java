package firstproject2;

public class MethodEx6 {
	char charAt(String s, int i){
		//String[] sarr = s.split(""); //�ѱ��ھ� �߶� �迭�� ����� �޼���
		char[] carr = s.toCharArray(); //���ڿ��� �迭�� �����
		
		return carr[i];
	}
	
	
	
	public static void main(String[] args) {
		MethodEx6 me = new MethodEx6();
		char a = me.charAt("abcde",4); // 0~4��°���� ����.
		System.out.println(a);
		//������� me <= ���ڿ��̾�� �Ѵ�. 
		//�׷��� ���� �־���.
		//"abcde",0  ==> abcde�߿� 0��° ���ڰ� �����ΰ�?
		
		
		
	}
}
