package firstproject;

class HouseEx{
	String mete; 
	int floor; 
		
	HouseEx(){
		
	}
	
	HouseEx(String mete){
		this.mete = mete;
	}
	HouseEx(String mete, int floor){
		this.mete = mete;
		this.floor = floor;
	}
	
	
	public static void main(String[] args) {
	
		HouseEx house1 = new HouseEx();
		HouseEx house2 = new HouseEx("????");
		HouseEx house3 = new HouseEx("????",2);
	
		System.out.println(house1.mete +" "+house1.floor);
		System.out.println(house2.mete +" "+house2.floor);
		System.out.println(house3.mete +" "+house3.floor);
	
	}
}

// ???? ī?忡 ?ö???.





