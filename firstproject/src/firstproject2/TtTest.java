package firstproject2;

 class Timetables {
	 void ttable(int i) {
		 for(int z=1;z<10;z++) {
		 System.out.println(i+"x"+z+"="+(i*z));
		 }
	 }
}



public class TtTest{ // 클래스가 2개일 경우 main 이 있는 클래스 이름으로 해야함. 
	// 클래스가 2개일 경우 파일명 = 클래스명 인곳에 public을 붙인다.  
	// 아니면 둘다 없어도 되는데 넣으려면 한군데만 가능함.
	// 보통은 기능별로 파일 다 나눠주기때문에. 두개를 쓸 일이 잘 없긴함.(?)
	public static void main(String[] args) {
		Timetables tt = new Timetables(); //항상 생성필요!!
		tt.ttable(2); // 2의 구구단이 출력.
		//3단 하고싶으면 tt.ttable(3); 이런식으로  
	}
}
