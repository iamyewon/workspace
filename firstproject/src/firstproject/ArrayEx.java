package firstproject;

import java.util.Scanner;

public class ArrayEx {
	int k;
	
	ArrayEx(){//������ �ϳ� �������. ������ ������ ���� ������ ����� �ȴ�.
		k=10;//�����Ҷ� �ҷ����� �κ��̹Ƿ� �ٷ� ����� �ȵ����� ����, �޼��� �� ����� �����ϴ�.
	}
	
	public static void main(String[] args) {
		int[] arr = new int [10]; // new �Ѵ� = ����(construct)�Ѵ�.
		// �迭�� �޸� �÷��� ����ؾ��Ѵ�.
	
		System.out.println(arr);
		
		//ArrayEx ae = new ArrayEx(); //new �ڿ��� �ݵ�� �����ڰ� �;��Ѵ�.
		// ArrayEx() �̷��� �Ⱥ��δ�. ??
		//������ ����ӽ��� �Ѱ� ������ش�. 
		// ==> ������ = constructor
		
		
		//Scanner sc = new Scanner(System.in);
		int[] i = new int[10];
		i[10]=10;
		i[1]=20;
		
		
		
		Scanner[] scs = new Scanner[10];
		scs[0] = new Scanner(System.in); //Scanner �ϱ� �������(new) Scanner �� �ִ´�.
		scs[1] = new Scanner(System.in);
		scs[2] = new Scanner(System.in);
		
	int x = scs[0].nextInt();
	System.out.println(x);
		
	}
}
