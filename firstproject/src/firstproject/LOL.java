package firstproject;

public class LOL {
	Item item;
	String champ;
	
	public LOL(Item item, String champ) {
		this.item = item;
		this.champ = champ;
	}
	
	public static void main(String[] args) {
		Item item2 = new Item("magic_box");
		LOL lol = new LOL(item2, "Teemo");
	System.out.println(lol.item.magic_box);
	System.out.println(lol.champ);
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	String collect;
	int level;*/
	
}