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
		Stock = "재고없음";
		if(y==true) {
			Stock = "재고있음";
		}
			
	
	}
	void insertScore(double s) {
		Score = s;
	}
	void showData() {
		System.out.println("책 제목:"+title+"     가격:"+Price+"원     재고:"+Stock+"     평점 "+Score+" ");
	}
}




public class Book {
	public static void main(String[] args) {
		BookTest b = new BookTest();
		b.insertTitle("오만과 편견");
		b.insertPrice(12000);
		b.insertStock(true);
		b.insertScore(9.5);
		b.showData();
		// 결과 - 오만과 편견, 12000, 재고 있음, 평점 9.5
	}
}