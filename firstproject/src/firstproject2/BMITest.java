package firstproject2;

class BMI {
	 void calc(String name, int h, int w) { //��ȯ�� �޼���� - void ���� ��ȯ�ҰԾ���. 
		 System.out.println(name+"�� bmi������ "+(w/((h*0.01)*(h*0.01)))+"�Դϴ�.");
	 }
}



public class BMITest {
	public static void main(String[] args) {
		BMI bmi = new BMI();
	bmi.calc("��ȫ��",176,80); //��ȫ���� bmi ������ xxx�Դϴ�. ��� ����ϱ�.
}
	}
	
