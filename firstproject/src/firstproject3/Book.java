package firstproject3;


class BookTest{
	
	String title;
	int Price;
	String Stock;
	double Score;
	
	
	
	void insertTitle(String t) {
		title = t;
	}
	void insertPrice(int p) {
		Price = p;
	}
	void insertStock(boolean y) {
		Stock = "�������";
		if(y==true) {
			Stock = "�������";
		}
			
	
	}
	void insertScore(double s) {
		Score = s;
	}
	void showData() {
		System.out.println("å ����:"+title+"     ����:"+Price+"��     ���:"+Stock+"     ���� "+Score+" ");
	}
}




public class Book {
	public static void main(String[] args) {
		BookTest b = new BookTest();
		b.insertTitle("������ ����");
		b.insertPrice(12000);
		b.insertStock(true);
		b.insertScore(9.5);
		b.showData();
		// ��� - ������ ����, 12000, ��� ����, ���� 9.5
	}
}