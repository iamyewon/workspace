package project719;

class Static{
	static int i; //static ������ (= ������ �ʴ� ) ==> �� ���� ������ 1���� ���������.
	// �� Ŭ������ ������ ��� �ν��Ͻ��� static ���� �����Ѵ�. 
	// static �� new ���� �ʾƵ� ��� �����ϴ�. ����� ���ÿ� �޸𸮿� �ö󰣴�. 
	int j;
}


public class StaticEx {

	public static void main(String[] args) {
	Static s1 = new Static();
	s1.i++; //1 �������Ѷ�
	s1.j++; //1 �������Ѷ�
	System.out.println(s1.i+" : "+s1.j);
	
	
	Static s2 = new Static();
	s2.i++; //1 �������Ѷ� ������ s1�� �ٸ��� s2�� �ִ� i�� 1 ������Ű��� �ڵ��ε�, i�� 2����..
	s2.j++; //1 �������Ѷ�
	System.out.println(s2.i+" : "+s2.j);
	
	}

}