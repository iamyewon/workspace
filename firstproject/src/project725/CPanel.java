package project725;

import java.awt.Color;

import javax.swing.JPanel;

public class CPanel extends JPanel{ // this == JPanel
	public CPanel() {
		//super(); 가 없지만 존재함. JPanel 이 생성안되면 사용안되는데
		//이부분은 안보이지만 생성되어있음.
		//super(); <= 부모의 생성자를 반드시 불러야 하는것은 아니다.
		//부모가 빈생성자를 가지고 있으니까 알아서 호출한다.
		//만약 부모가 빈생성자 () <= 괄호 안에 아무것도 없는 생성자가 없다면 반드시
		//super(매개변수) <= 부모의 생성자를 명시적으로 호출해야함.
		
	}
	
	public CPanel(int width, int height, Color c) {
		//super(); 존재함.
		
		this.setSize(width,height);
		this.setBackground(c); //JPanel 이 들고 있는 메서드
		
	}
}


class YPanel extends CPanel{
	
}