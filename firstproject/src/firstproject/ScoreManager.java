package firstproject;


import java.util.Scanner;

public class ScoreManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		/*s1.name="��ʶ�";
		s1.number=1;
		s1.english=100;
		s1.math=10;
		s1.korean=80;
		
		
		s2.name="��ʶ�";
		s2.number=1;
		s2.english=100;
		s2.math=10;
		s2.korean=80;
		
		s3.name="��ʶ�";
		s3.number=1;
		s3.english=100;
		s3.math=10;
		s3.korean=80;
		
		
		System.out.println(s1.number);
		System.out.println(s1.name);
		System.out.println(s1.korean);
		System.out.println(s1.english);
		System.out.println(s1.math);
		System.out.println(s1.korean+s1.math+s1.english);*/
		
		
//		int[][] ScoreInf = new int[3][5];
//		String[] inf= {"�й�","�̸�","����","����","����"};
//			for(int i=0; i<3; i++) {
//				for(int j=0; j<2; j++) {
//					System.out.println((i+1)+"��° �л��� "+inf[j]+" ��/�� �Է��ϼ���");
//					ScoreInf[i][j]= sc.nextInt();
////					String j = sc.next();
//	}
		
				
		
				
				
				
		Student s[] = new Student[3];
	
		
		for(int i=0;i<s.length;i++) {
			s[i] = new Student(); //??
			
			System.out.println("�й��� �Է��ϼ���.:");
			s[i].number = sc.nextInt();
			System.out.println("�̸��� �Է��ϼ���.:");
			s[i].name = sc.next();
			System.out.println("���� ������ �Է��ϼ���.:");
			s[i].korean = sc.nextInt();
			System.out.println("���� ������ �Է��ϼ���.:");
			s[i].english =sc.nextInt();
			System.out.println("���� ������ �Է��ϼ���.:");
			s[i].math = sc.nextInt();
			
			System.out.println(" (�й�:"+s[i].number+")"+s[i].name+"�л���  ����:"+s[i].korean+"  ����:"+s[i].english+"  ����:"+s[i].math+"�� �Դϴ�");
		
		}
		
		
		
			for(int i=0;i<s.length;i++) {
				System.out.println(s[i].name+"�л��� ����,����,���� ������ ������ "+(s[i].english+s[i].korean+s[i].math)+"�� �Դϴ�.");
				System.out.println(s[i].name+"�л��� ����� "+((s[i].english+s[i].korean+s[i].math)/3)+"�� �Դϴ�.");
			}
		
		
		
//		System.out.println(Arrays.toString(ScoreInf[0]));
//		System.out.println(Arrays.toString(ScoreInf[1]));
//		System.out.println(Arrays.toString(ScoreInf[2]));
		
	}
		}
		
		

				
				
		
		

		
		
		
	