package project719;

public class CarMethod {
	Engine makeEngine() { //Engine�� ��ȯ���̴�. int, String ���� ����. => ����� Engine�̴�. 
//		Engine e=null; -������	//�ݵ�� return�� �־�� �ϰ�, return �ڿ��� ������ Engine�� �־���Ѵ�.
		Engine e = new Engine(); // �̷��� �ٲ���� printInfo���� �����ȳ�.
		
		return e; // class������ �ƴϸ� �ݵ�� ������ �ʱⰪ�� ����Ѵ�.
	}
	
	
	//�޼��带 ���ؼ� ��ü �����ϱ� - ������ ��ü�� �̿��ؼ� �ٸ� ��ü ����ϱ�.
	public static void main(String[]args) {
		CarMethod cm = new CarMethod();
		
//		Car c = new Car(engine, type)
		Car c = new Car(cm.makeEngine(),"������ī");
		//���� ���¿����� makeEngine()���� ������ ������ ��������� �ʾ���. new �� �����ʾƼ� ! 		
		c.printInfo(); // => null ��¼�� ���� ��.
		
		
		//�̷��� �ص���........
//		Engine e = new Engine();
//		Car c2 = new Car(e,"������ī");
	}
}
