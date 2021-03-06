package project82;

interface Tire{void printInfo();}

class Kumho implements Tire{

	@Override
	public void printInfo() { }
	public void setKumho() { }
	
}

class Hankook implements Tire{

	@Override
	public void printInfo() { }
	public void setHankook() { }
	
}

class Michelin extends Hankook{
	void setMichelin() {}
}


public class CastingEx {
	public static void main(String[] args) {
	Hankook h = new Hankook();
	h.setHankook();
	Kumho k = new Kumho();
	k.setKumho();
	
	Tire t1 = new Hankook();
	// t1.setHankook(); // 인터페이스에서 되지 않음
	Tire t2 = new Kumho(); //new 금호 부분이 t2로 가고 
	//t2가 금호타입으로 바뀌면서 다시 k2로 바뀜
	Kumho k2 = (Kumho) t2;
	k2.setKumho(); //k2를 따라가보면 젤 처음에 만들어진것이 Kumho 이므로 실제로 k2는 Kumho() 이다.
	
	Tire t3 = new Tire() { //여기는 금호 타입이 아니라 타이어타입으로 처음에 만들었는데 금호타입으로 변환....x

		@Override
		public void printInfo() {}
		
	};
	
	Kumho k3 = (Kumho) t3;
	k3.setKumho(); // 에러 발생 -> 인터페이스에서 되지않음 부분과 같이보면됨
	//
	
	
	
	Hankook m = new Michelin();
	//m.setMichelin(); // 상속일때도 당연히 안됨.  //만들어진게 한국이지만 t1으로 바뀌면서 타이어타입의 t1으로 바뀐것.. 한국에서 만든 미쉐린이니까........?????
	}
}
