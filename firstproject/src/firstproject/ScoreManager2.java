/*package firstproject;

import java.util.Scanner;

public class ScoreManager2 {
	Student[] std; //Ŭ���� ����
	// Ŭ���� ������ �� ������ ������ �ִ� Ŭ������ �����Ǿ�߸� ��밡���ϴ� 
	// => std�� ����ϱ� ���ؼ��� ScoreManager2 �� ����(new)�ؾ� ��밡���ϴ�
	//���࿡ �޼���(main)�ȿ��� �����Ѵٸ�(Student[] std;) 
	// new ScoreManager �� ���ص� �ȴ�.
	
	public static void main(String[] args) {
		Student[] std2;
		std2 = new Student[100]; //���� ����  	 --main �ȿ����� ��밡�� 
//		std = new Student[100]; // ���� �߻� -- Ŭ���� �����ϱ�  - ��Ŭ���� ��ü���� ��밡��.
		
		
		ScoreManager sm = new ScoreManager();  // ���� Ŭ���� �̸��� 2�ٿ��µ� �׷� 2�ٿ��� ����Ǵ°�?
		// ScoreManager Ŭ������ �޸𸮿� �ö󰬴�. - ��밡���ϴ�. 
		//std = new Student[3]; //std�� �޸𸮿� �ö� ���� ���� ���� �� ���̴�.
		// sm.std <-���ڱ� ��.std...
		sm.std = new Student[3];
		�� ����� �Ʒ� ������ ���� ���̴�. - �迭�� ����(���� ���»�����) ����� ����.
		Student std0;
		Student std1;
		Student std2;
		
		int is = new int[3]
		int is0; = 100; ���� ���̴ϱ� �̷��� �־��ֵ�..
		int is1;
		int is2;
		
		
		sm.std[0] = new Student(); // Student�� 3�� �޸𸮿� �ö��ִ�. 
		sm.std[1] = new Student(); // 3�� �� ��� �����ϴ� 
		sm.std[2] = new Student(); // �� Student�� ���� �� ���� ������. --> Student.java ����
		//
		//sm.std[0] = new Student(); �̹��� ������ ���� ����(?)�� ������ ��..?
		//
		sm.std[0].number=1;
		sm.std[0].name="kim"
		sm.std[0].korean = 100;
		sm.std[0].english = 100;
		sm.std[0].math = 100;
		
		
		// �ݺ������� ���� 
		for(int i=0;i<3;i++) {//0 1 2
		sm.std[i] = new Student(); // 3�� �ݺ��Ǹ鼭 26-28��° �ٰ� ������
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣ�� �Է��ϼ���");
		sm.std[0].number = sc.nextInt();
		System.out.println("�̸��� �Է��ϼ���");
		sm.std[0].name = sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		sm.std[0].korean = sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		sm.std[0].english = sc.nextInt();
		System.out.println("���������� �Է��ϼ���");
		sm.std[0].math = sc.nextInt();
		
	}// ��� �Է��� ����, std[0],std[1],std[2],���� ���� �� �������.
	
	System.out.println(sm.std[0].number);
	//�Ȱ��� +4��  �̸�+������
		
		
		
		
		
				
		
	}

}
*/