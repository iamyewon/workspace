package project719;

public class Order { 
	Product product;
	User user;
	int orderNum;
	int allPrice;
	String userN;
	
	public Order(Product product, User user, int orderNum, int allPrice, String userN) {
		this.product=product;
		this.user=user;
		this.orderNum=orderNum;
		this.allPrice=allPrice;
		this.userN=userN;
	}
	
	public void printProductInfo() {
		product.printProductInfo();
		System.out.println("�ֹ� ������ "+orderNum+"�� �̰�, �� ������ "+allPrice+"�� �Դϴ�.");
	}
	public void printUserInfo() {
		user.printUserInfo();
		System.out.println("�ֹ��ڴ� "+userN+"�Դϴ�.");
	}
	
	public static void main(String[] args) {
		Order o = new Order(new Product(),new User(),2,5000,"yeni");
		o.printProductInfo();
		o.printUserInfo();
		
	//	Order o2 = new Order(new Product("�ϸ���"),new User(),4,10000,"yeni-freind");
	//	o2.printProductInfo();
	//	o2.printUserInfo();
	}
	
	//�����ʸ��콺 -> source -> generate constructor using fields.. �����ڸ������..0
}


//main(main = �����ϴ� ����) ���� ���� �ڵ带 ���󰡸鼭 �ؼ��ϸ� ��. 
// product�� new �Ҷ����� ���ο� ����.
// user�� new �Ҷ����� ���ο� �մ�..
// sell�Ҷ����� � �Ⱦҵ�..��� .. ���ָ��..��