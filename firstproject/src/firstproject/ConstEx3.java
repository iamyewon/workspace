/*package firstproject;
class ConEx2{
	int i;
	String s;
	
	
	
	ConEx2(){ //기본 생성자가 필수는 아니다.
		i=10;
		s="안녕";
				
			
	}
	ConEx2(int k){ // 변수명은 틀리던 말던 상관없다. 타입, 개수, 순서로 구분한다.
		i=k;
		s="안녕";
	}
	ConEx2(String str){ //생성할때 new뒤에생성자명() 괄호에 넣는 것에 따라 골라 실행
		i=10;
		s=str;
	}
	
	ConEx2(int k, String str){
		i=k;
		s=str;
	} //숫자,문자
	ConEx2(String str, int k){} //문자, 숫자 

	
	
	
	
}	
public class ConstEx3 {	
	public static void main(String[] args) {
		ConEx2 c = new ConEx2();
		System.out.println(c.i+" "+c.s);
//		
//		
//		ConEx2 c = new ConEx2(100); // 이러면 ConEx2(int k)이부분이 실행
//		System.out.println(c.i+" "+c.s);
//	
//		ConEx2 c = new ConEx2("헬로헬로"); //이러면 ConEx2(String str)이부분이 실행
//		System.out.println(c.i+" "+c.s);
//	
//		ConEx2 c = new ConEx2(1000,"올라올라");
//		System.out.println(c.i+" "+c.s); // 이러면 ConEx2(int k, String str) 이부분이 실행됨
//	
//	//카톡에 전체내용 올라와있음. 
//	
//	}
//}
*/