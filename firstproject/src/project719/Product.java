package project719;

public class Product {
	private String productName;
	private int productPrice;
	private String productWeight;
	private int productStock;
	
	
	public void setProductName(String productName) {
		//���� �߰��� �� ���� .. ���� �Ҽ�����.			
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
		System.out.println("��ǰ - �̸� : "+productName+" // ���뷮 : "+productWeight+" // ���� : "+productPrice+" // ��� : "+productStock);
	}


	public static void main(String[] args) {
		Product p = new Product();
		p.setProductName("�ϸ��� ��庣��");
		p.setProductWeight("100g");
		p.setProductPrice(2000);
		p.setProductStock(7);
		p.printProductInfo();
		
		Product p2 = new Product();
		p2.setProductName("�ϸ��� ��Ÿ�ͽ�");
		p2.setProductWeight("150g");
		p2.setProductPrice(2500);
		p2.setProductStock(11);
		p2.printProductInfo();
		
		Product p3 = new Product();
		p3.setProductName("�ϸ��� ���Ǳ׷�����");
		p3.setProductWeight("300g");
		p3.setProductPrice(3500);
		p3.setProductStock(4);
		p3.printProductInfo();
		

	}
}