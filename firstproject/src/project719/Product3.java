package project719;

public class Product3 { // Ŭ���� - ��ü�� �ڵ�ȭ ��Ų��. 
	 String productName; // ����
	 int productPrice, productWeight, productStock;
	
	 public Product3() {//new �Ҷ� �����.
		 
	 }
	 public Product3(String productName,int productPrice,int productWeight,int productStock ) {//new �Ҷ� �����.
		 this.productName = productName;
		 this.productPrice = productPrice;
		 this.productWeight = productWeight;
		 this.productStock = productStock;
	 }
	
	 //�ȳ����� �˾Ƽ� ������..
	 public void setInfo(String productName,int productPrice,int productWeight,int productStock) {
		 setInfo(productName,productPrice,productWeight,10);
		 //�ȳ����� stock�� 10�� ��..
	 }
	 public void setInfo(String productName,int productWeight,int productPrice) {
		 setInfo(productName,productWeight,5000,10);
	 }
	 public void setInfo(String productName,int productWeight) {
		 setInfo(productName,800,5000,10);
	 }
	 public void setInfo(String productName) {
		 setInfo(productName,800,5000,10);
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
		Product3 p1 = new Product3("�Ź�1",5000,600,10);
		Product3 p2 = new Product3("�Ź�2",7000,500,10);
		//p1.printProduct();
		//p2.printProduct();

		
		//��� ����
		
		p1.minusStock(); //P1�� ����� 1 ����
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
				
		Product3 p3 = new Product3();
		p3.setInfo("�尩");
		p3.printProduct();
		p3.minusStock();
		p3.printProduct();

	}
}