package firstproject;
class Car238{

		String company;
		String model; 
		String color;
		int price; 
			
	
Car238(){ //�ƹ��͵� ���� ������ ����������..
	// ������(�޼���) �̸��� Car238() �Ȱ���. () ��ȣ �ȿ� �ִ� Ÿ��, ����, ����
	model="���׽ý�"; // �̰� �ٸ��ٸ� �����ε� �Ǿ��ִٰ� ��..
	color="����";
	price=1000;
}

Car238(String str){
	/*Car238(String model){
	model=model; // Ŭ���� ������ model = �޾ƿ� ������ ��� model .......
	==>
	this.name=name;
	this.color="����";
	this.price=800; // this�� ��Ŭ������ ����Ű��,
					// this.price�� �� Ŭ���� ���� price�� ���Ѵ�. 
	}
	*/
//	model=str; 
//	color="����";
//	price=800;  ���� �̷��� �Ǿ��ִ� �ֵ��� �Ʒ�ó�� this. �� �־ �ٲ���.
	
	
	this.model=str; 
	this.color="����";
	this.price=800;
	
}
Car238(String str,String str2){
	this.model=str;
	this.color=str2;
	this.price=700;	
}

Car238(String model,String color, int price){ //this.~ = �ڿ� �� �ٲ���.. 
	this.model=model;
	this.color=color;
	this.price=price;
} 

}
public class Car239 {
	public static void main(String[] args) {
		
		Car238 car1 = new Car238();
		Car238 car2 = new Car238("�׷���");
		Car238 car3 = new Car238("�׷���","���");
		Car238 car4 = new Car238("�׷���","���",300);
		
		System.out.println(car1.model+" "+car1.color+" "+car1.price);
		System.out.println(car2.model+" "+car2.color+" "+car2.price);
		System.out.println(car3.model+" "+car3.color+" "+car3.price);
		System.out.println(car4.model+" "+car4.color+" "+car4.price);
		
		}
	}



// ���� ���̵� -���� �ִ�(��ӹ޾Ƽ� ���������� ������ �ִ�) �޼����� ������ ������(���ξ���)�ϴ°�.
// ���� �ε� - �޼���(������) �̸��� ������ Ÿ���̳�, ����, ������ �ٸ��� �ؼ� ���� �̸����� ����ϴ� ��.