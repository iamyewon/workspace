package project719;

public class Product2 { // Ŭ���� - ��ü�� �ڵ�ȭ ��Ų��. 
	 String productName; // ����
	 int productPrice, productWeight, productStock;
	

	 public Product2(String productName,int productPrice,int productWeight,int productStock ) {//new �Ҷ� �����.
		 this.productName = productName;
		 this.productWeight = productWeight;
		 this.productPrice = productPrice;
		 this.productStock = productStock;
	 }
	 
	 public Product2(String productName,int productPrice,int productWeight) {//new �Ҷ� �����.
		 this.productName = productName;
		 this.productWeight = productWeight;
		 this.productPrice = productPrice;
		 this.productStock = 10;
	 }
	
	 void plusStock() { //1�� ���� �Ҷ����� �ϳ��� ����. �������� ��ȣ�� �־���ϴµ� �ϳ��� ���.
		 productStock++;
	 }
	 void minusStock() {
		 productStock--;
	 }
	 
	 void printProduct() {
		 System.out.print("��ǰ��:"+productName);
		 System.out.print("����:"+productPrice);
		 System.out.print("����:"+productWeight);
		 System.out.println("���:"+productStock);
	 }
	 
	 
//	public void setProductName(String productName) {
//		//���� �߰��� �� ���� .. ���� �Ҽ�����.			
//		this.productName = productName;}


// �� ������ ��Ŭ������ ���鶧 �׽�Ʈ������ ��. �ϼ��Ǹ� �����ָ� ����.
	public static void main(String[] args) {
		Product2 p1 = new Product2("�Ź�1",5000,600,10);
		Product2 p2 = new Product2("�Ź�2",7000,500,10);
		Product2 p3 = new Product2("�Ź�3",6000,500);
		//p1.printProduct();
		//p2.printProduct();

		
		//��� ����
		
		p1.minusStock(); //P1�� ��� 1 ����
		//p1.printProduct(); // ����ָ� Ȯ�� ����.
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
