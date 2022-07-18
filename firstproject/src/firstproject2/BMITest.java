package firstproject2;

class BMI {
	 void calc(String name, int h, int w) { //반환형 메서드명 - void 뜻은 반환할게없다. 
		 System.out.println(name+"의 bmi지수는 "+(w/((h*0.01)*(h*0.01)))+"입니다.");
	 }
}



public class BMITest {
	public static void main(String[] args) {
		BMI bmi = new BMI();
	bmi.calc("최홍석",176,80); //최홍석의 bmi 지수는 xxx입니다. 라고 출력하기.
}
	}
	
