package firstproject3;

class Gugu{
	int xx;
	int zz;
	
	void setNum(int x, int z) {
		this.xx=x;
		this.zz=z;
		
	}
	void showData(){
		for(int i=1;i<=zz;i++) {
		System.out.println(xx+"X"+i+"="+(xx*i));
		}
	}
}



public class Gugudan {
	public static void main(String[] args) {
		Gugu g = new Gugu();
		g.setNum(2,5); //2???? x5????
		g.showData();
	}
}
