package firstproject2;

public class MethodEx5 {
	public static void main(String[] args) {
		String str = "abcdefg";
		String str2 = new String("abcdefg");
//		String str3 = new String();
//		str3 = "abcdefg" str.set? text? 없어서 직접넣을수있는데 안하기로.
		
	//	str.charAt(index)
//		charAt 설명 보면 int 넣으라고 되어있음.
		char c = str.charAt(0); //문법적으로 문제가 없지만...? - 0번째인 a를 가져옴?? --> 실행x
		//char c2 = str.charAt(100); //api 보면서 설명을 읽는다면  --> 100번째 글자는 없으니까..오류,,,,?
						 // 이 메서드가 하는일, 매개변수의 의미 등을 알수있다. 
		
		int i = str.indexOf("d"); // ->d가 몇번째에 있는지.
		
		System.out.println(c);
		//System.out.println(c2);
	}
}
