package project725;

import javax.swing.JFrame;

public class ExtendsEx2 extends JFrame{ //내부적으로 상속받아서 JFrame을 들고있다. 
	public ExtendsEx2() {
		this.setSize(300, 300); //부모(JFrame)가 가지고 있던 메소드 
		//this 는 ExtendsEx2를 의미 //없어도 되지만 명확한 의미를 위해
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//부모가 가지고 있던 메소드
		this.setVisible(true);//부모가 가지고 있던 메소드
	}
	
	
	public void setSize(int w, int h) { //부모가 가지고 있는 것과 같은 이름의 내 메서드
		// 부모의 메서드가 마음에 안들면 똑같이 만들어서 내용을 바꾸면 된다.
		// 오버라이딩 - 내용을 바꿔버리는 것.
	}

	
	public void printSize() { //내가 만든 메서드 
		System.out.println(this.getSize());
	}

	
	public static void main(String[] args) {
		ExtendsEx2 ee = new ExtendsEx2();
		//JFrame f = new JFrame(); 원래는 이렇게 했음.
	}

}
//기본적으로 부모 것을 들고 있고, 내가 원하면 만들어 쓸 수도 있고, 오버라이딩도 되고
