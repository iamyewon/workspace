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
		System.out.println("주문 수량은 "+orderNum+"개 이고, 총 가격은 "+allPrice+"원 입니다.");
	}
	public void printUserInfo() {
		user.printUserInfo();
		System.out.println("주문자는 "+userN+"입니다.");
	}
	
	public static void main(String[] args) {
		Order o = new Order(new Product(),new User(),2,5000,"yeni");
		o.printProductInfo();
		o.printUserInfo();
		
	//	Order o2 = new Order(new Product("하리보"),new User(),4,10000,"yeni-freind");
	//	o2.printProductInfo();
	//	o2.printUserInfo();
	}
	
	//오른쪽마우스 -> source -> generate constructor using fields.. 생성자만들어줌..0
}


//main(main = 실행하는 순서) 에서 부터 코드를 따라가면서 해석하면 됨. 
// product에 new 할때마다 새로운 물건.
// user에 new 할때마다 새로운 손님..
// sell할때마다 몇개 팔았따..등등 .. 해주면됨..ㄴ
