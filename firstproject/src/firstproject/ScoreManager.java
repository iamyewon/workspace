package firstproject;


import java.util.Scanner;

public class ScoreManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		/*s1.name="김똘똘";
		s1.number=1;
		s1.english=100;
		s1.math=10;
		s1.korean=80;
		
		
		s2.name="김똘똘";
		s2.number=1;
		s2.english=100;
		s2.math=10;
		s2.korean=80;
		
		s3.name="김똘똘";
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
//		String[] inf= {"학번","이름","국어","수학","영어"};
//			for(int i=0; i<3; i++) {
//				for(int j=0; j<2; j++) {
//					System.out.println((i+1)+"번째 학생의 "+inf[j]+" 을/를 입력하세요");
//					ScoreInf[i][j]= sc.nextInt();
////					String j = sc.next();
//	}
		
				
		
				
				
				
		Student s[] = new Student[3];
	
		
		for(int i=0;i<s.length;i++) {
			s[i] = new Student(); //??
			
			System.out.println("학번을 입력하세요.:");
			s[i].number = sc.nextInt();
			System.out.println("이름을 입력하세요.:");
			s[i].name = sc.next();
			System.out.println("국어 점수를 입력하세요.:");
			s[i].korean = sc.nextInt();
			System.out.println("영어 점수를 입력하세요.:");
			s[i].english =sc.nextInt();
			System.out.println("수학 점수를 입력하세요.:");
			s[i].math = sc.nextInt();
			
			System.out.println(" (학번:"+s[i].number+")"+s[i].name+"학생은  국어:"+s[i].korean+"  영어:"+s[i].english+"  수학:"+s[i].math+"점 입니다");
		
		}
		
		
		
			for(int i=0;i<s.length;i++) {
				System.out.println(s[i].name+"학생의 국어,영어,수학 점수의 총합은 "+(s[i].english+s[i].korean+s[i].math)+"점 입니다.");
				System.out.println(s[i].name+"학생의 평균은 "+((s[i].english+s[i].korean+s[i].math)/3)+"점 입니다.");
			}
		
		
		
//		System.out.println(Arrays.toString(ScoreInf[0]));
//		System.out.println(Arrays.toString(ScoreInf[1]));
//		System.out.println(Arrays.toString(ScoreInf[2]));
		
	}
		}
		
		

				
				
		
		

		
		
		
	