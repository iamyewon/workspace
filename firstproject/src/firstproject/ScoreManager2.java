/*package firstproject;

import java.util.Scanner;

public class ScoreManager2 {
	Student[] std; //클래스 변수
	// 클래스 변수는 이 변수를 가지고 있는 클래스가 생성되어야만 사용가능하다 
	// => std를 사용하기 위해서는 ScoreManager2 를 생성(new)해야 사용가능하다
	//만약에 메서드(main)안에서 정의한다면(Student[] std;) 
	// new ScoreManager 를 안해도 된다.
	
	public static void main(String[] args) {
		Student[] std2;
		std2 = new Student[100]; //에러 없음  	 --main 안에서만 사용가능 
//		std = new Student[100]; // 에러 발생 -- 클래스 변수니까  - 이클래스 전체에서 사용가능.
		
		
		ScoreManager sm = new ScoreManager();  // 내가 클래스 이름에 2붙였는데 그럼 2붙여서 쓰면되는거?
		// ScoreManager 클래스가 메모리에 올라갔다. - 사용가능하다. 
		//std = new Student[3]; //std는 메모리에 올라가 있지 않은 문자 일 뿐이다.
		// sm.std <-갑자기 왜.std...
		sm.std = new Student[3];
		위 내용과 아래 내용은 같은 말이다. - 배열은 변수(값이 없는상태의) 선언과 같다.
		Student std0;
		Student std1;
		Student std2;
		
		int is = new int[3]
		int is0; = 100; 없는 값이니까 이렇게 넣어주듯..
		int is1;
		int is2;
		
		
		sm.std[0] = new Student(); // Student가 3개 메모리에 올라가있다. 
		sm.std[1] = new Student(); // 3개 다 사용 가능하다 
		sm.std[2] = new Student(); // 각 Student는 따로 각 값을 가진다. --> Student.java 참고
		//
		//sm.std[0] = new Student(); 이문장 없으면 값이 없다(?)는 오류가 뜸..?
		//
		sm.std[0].number=1;
		sm.std[0].name="kim"
		sm.std[0].korean = 100;
		sm.std[0].english = 100;
		sm.std[0].math = 100;
		
		
		// 반복문으로 변경 
		for(int i=0;i<3;i++) {//0 1 2
		sm.std[i] = new Student(); // 3번 반복되면서 26-28번째 줄과 같아짐
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 입력하세요");
		sm.std[0].number = sc.nextInt();
		System.out.println("이름를 입력하세요");
		sm.std[0].name = sc.nextInt();
		System.out.println("국어점수를 입력하세요");
		sm.std[0].korean = sc.nextInt();
		System.out.println("영어점수를 입력하세요");
		sm.std[0].english = sc.nextInt();
		System.out.println("수학점수를 입력하세요");
		sm.std[0].math = sc.nextInt();
		
	}// 모든 입력이 끝남, std[0],std[1],std[2],에는 값이 다 들어있음.
	
	System.out.println(sm.std[0].number);
	//똑같이 +4개  이름+국영수
		
		
		
		
		
				
		
	}

}
*/