package firstproject; // �̰� �ֻ���..

public class ClassEx {
	int k; //Ŭ���� ���� - ���������� ���� �ȳ����� �˾Ƽ� �ʱ�ȭ�ȴ�.
	double d;
	boolean b;
	String str;
	
	
public static void main(String[] args) {
	//Ŭ���� �Ҽ� ������ �׳� ����� �ȵȴ�. �ݵ�� �޸𸮿� �÷��� ����ؾ��Ѵ�.
	// => �޸𸮿� ����(new) �÷���. 
	// new �޸𸮿� ������ ����϶�. 
	
	//System.out.println(k);
	//System.out.println(str); 
	// ���� �Ѵ� �۵� �ȵ� (new �ϱ�������)
	
	String str = "���"; // �޼��� �Ҽ� �����̴�. �׳� ��밡�� 
	//���ڿ�Ÿ�� ���� = ���ڿ� 
	//�� Ÿ�Կ� �´� ���� ������ �ִ´�. ��� ���� 
	
	
	//ClassEx ce = ClassEx Ÿ���� ������ �ȴ�.
	//int x = ���� // �̷��� �ֵ���..
	//System.out.println(k); // ���� �޸𸮿� �ö����� ���� ����k
	//\ClassEx ce = new ClassEx(); //ce���� �������( �޸𸮿� �ö��ִ�) ClassEx �� ����ִ�.
	//ce.k=100;
	//System.out.println(ce.k); // �޸𸮿� �÷����ִ� ����k //ceŬ�����ȿ��ִ�..?
	// => Ŭ���� �Ҽ� ���� �϶��� �̷��� ���.
	// Ŭ���� ���� - ���������� ���Ǵ� �׳� �ϸ� ������ ����� �ݵ�� new ���Ŀ� ���� (�޸𸮿� �ø� ����)
	
	//ClassEx ce2 = new ClassEx();
	//ce2.k=200;
	//System.out.println(ce2.k);
	
	//System.out.println(ce.k);//���ٸ� 200, Ʋ���ٸ� 100
	//System.out.println(ce2.k);
	
	
	ClassEx ce3 = new ClassEx();
	System.out.println(ce3.k);//����
	System.out.println(ce3.d);//�Ǽ�
	System.out.println(ce3.b);//�Ҹ���
	System.out.println(ce3.str);//���ڿ�
	
	//System.out.println(ce3.str.equals(null)); //�� �Ұ�
	System.out.println(ce3.str==null);
	//null �� �� �� x 
}
}