package project719;

public class Product2 { // 클래스 - 객체를 코드화 시킨것. 
	 String productName; // 정보
	 int productPrice, productWeight, productStock;
	

	 public Product2(String productName,int productPrice,int productWeight,int productStock ) {//new 할때 실행됨.
		 this.productName = productName;
		 this.productWeight = productWeight;
		 this.productPrice = productPrice;
		 this.productStock = productStock;
	 }
	 
	 public Product2(String productName,int productPrice,int productWeight) {//new 할때 실행됨.
		 this.productName = productName;
		 this.productWeight = productWeight;
		 this.productPrice = productPrice;
		 this.productStock = 10;
	 }
	
	 void plusStock() { //1번 실행 할때마다 하나씩 증가. 여러개면 괄호에 넣어야하는데 하나라서 비움.
		 productStock++;
	 }
	 void minusStock() {
		 productStock--;
	 }
	 
	 void printProduct() {
		 System.out.print("제품명:"+productName);
		 System.out.print("가격:"+productPrice);
		 System.out.print("무게:"+productWeight);
		 System.out.println("재고:"+productStock);
	 }
	 
	 
//	public void setProductName(String productName) {
//		//권한 추가할 수 있음 .. 제어 할수있음.			
//		this.productName = productName;}


// 이 메인은 이클래스를 만들때 테스트용으로 씀. 완성되면 지워주면 좋음.
	public static void main(String[] args) {
		Product2 p1 = new Product2("신발1",5000,600,10);
		Product2 p2 = new Product2("신발2",7000,500,10);
		Product2 p3 = new Product2("신발3",6000,500);
		//p1.printProduct();
		//p2.printProduct();

		
		//재고 증감
		
		p1.minusStock(); //P1의 재고가 1 빠짐
		//p1.printProduct(); // 찍어주면 확인 가능.
		p1.minusStock();
		p1.minusStock();
		p1.minusStock();
		p1.printProduct();
		
		p2.plusStock();
		p2.plusStock();
		p2.plusStock();
		p2.plusStock();
		p2.printProduct();
				

	}
}
