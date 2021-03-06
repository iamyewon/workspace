package project719;

public class Product {
	private String productName;
	private int productPrice;
	private String productWeight;
	private int productStock;
	
	
	public void setProductName(String productName) {
		//권한 추가할 수 있음 .. 제어 할수있음.			
		this.productName = productName;
	}

	public void setProductWeight(String productWeight) {
		this.productWeight = productWeight;
	}
	
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}
	public void printProductInfo() {
		System.out.println("제품 - 이름 : "+productName+" // 내용량 : "+productWeight+" // 가격 : "+productPrice+" // 재고 : "+productStock);
	}


	public static void main(String[] args) {
		Product p = new Product();
		p.setProductName("하리보 골드베렌");
		p.setProductWeight("100g");
		p.setProductPrice(2000);
		p.setProductStock(7);
		p.printProductInfo();
		
		Product p2 = new Product();
		p2.setProductName("하리보 스타믹스");
		p2.setProductWeight("150g");
		p2.setProductPrice(2500);
		p2.setProductStock(11);
		p2.printProductInfo();
		
		Product p3 = new Product();
		p3.setProductName("하리보 해피그레이프");
		p3.setProductWeight("300g");
		p3.setProductPrice(3500);
		p3.setProductStock(4);
		p3.printProductInfo();
		

	}
}
