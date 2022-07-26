package project726;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class AButton extends JButton {
	
	// 객체 start 필드(변수)랑 기능(메서드)
	int a;
	int b;
	BButton c;
	
	public AButton() {
		this.setText("A");
	}
	
	public AButton(int a) {
		System.out.println(a);
	}
	
	public void aButton() {
		
	}
	// 객체 end
}

class BButton extends JButton {
	public BButton() {
		this.setBackground(Color.RED);
	}
}

class CButton extends JButton {
	public CButton(String s) {
		this.setText(s);
		this.setForeground(Color.YELLOW);
	}
}

public class MyEx extends JFrame { // MyEx 는 JFrame을 상속 받은.
	public MyEx() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
	}

	public void addButton(JButton btn) { // A,B,C Button이 모두 JButton을 상속받았기때문에, 가능함
		this.add(btn);
	}

	public static void main(String[] args) {
		MyEx m = new MyEx();
		AButton aButton = new AButton();
		BButton bButton = new BButton();
		CButton cButton = new CButton("Click me");

		m.setLayout(new GridLayout());

		m.addButton(aButton);
		m.addButton(bButton);
		m.addButton(cButton);

		m.setVisible(true);
	}

}

// 3가지 타입의 JButton 만들어서 JButton 을 상속받는 메서드 3개 만들기.
// AButton = new AButton() // 자동으로 글씨가 A라고 붙어잇음.
// BButton = new BButton() // 색이 파란색임
// CButton = new CButton() // 글자 색이 빨간색임.

// public void addButton(JButton btn){// 매개변수의 다형성
// 		xxx <= JFrame 을 상속 받았다면, this 
// 				직접 생성했다면 JFrame 변수
// 		xxx.add(btn);
//}
//
// xxx.addButton(btn1);
// xxx.addButton(btn2);
// xxx.addButton(btn3);