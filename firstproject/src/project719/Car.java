package project719;

public class Car {
	Engine engine; //3. ���� engine���� ����.. �ᱹ 1=3
	String type;
	int speed;
	public Car() {
		this(new Engine(),"����",250); //1! // ������ Engine�� ������ ���� �޾� �� �� ����. �׷��� ���⼭ ���� ������ ������. 
	}
	public Car(Engine engine, String type) { //1. ����engine��
		this(engine,type,250); //2!  //������ Engine�� �ٸ������� new �� ���� �޾ƿ´�.
	}
	public Car(Engine engine, String type, int speed) {
		this.engine=engine; //1!,2!�� ��� ������ engine�� ������ ����..�� ..?
		this.type=type;
		this.speed=speed; //2.���� engine���� ������.
	}
	public void printCom() { // �޼���� ������ ������ ��������, �ڵ带 �����ϱ� ����(��ɺ��� ��������)
		System.out.println("����");
	}
	
	public void printInfo() { 
		printCom(); // ���� �޼���� �ȿ��� �����Ӱ� ��밡���ϴ�.
		engine.printInfo(); //�������� �����༭ ������ �ִ� ������,, // �޼��忡�� �޼���ȣ���ϱ�.
		System.out.println("������"+type+"�̰� �ִ�ӵ���"+speed+"�Դϴ�.");
		//�����ڵ鸸 �̿��ؼ�.. ���� �ٲ㾵��..����
	}
	public static void main(String[] args) { //�ڵ� �м��� �׻� main �������� ����
		Car c = new Car(); // new �����ϱ� �� �Ѵ� �����Ѱ���.
		c.printInfo(); // �̹� ���� ������ �� �ִ�. 
		
		Car c2 = new Car(new Engine(),"Ʈ��",200); // �⺻���� ������ ������ ���������� �����. ��ü�� ������ new�� �����..
		c2.printInfo();
		
		Car c3 = new Car(new Engine(3000,"����"),"����",230);
		c3.printInfo();
	}
	
}