package project725;

import java.awt.Color;

import javax.swing.JButton;

public class GUIEx9 extends MFrame{
	public GUIEx9() {
		//super(); 없어도 자동 호출
//		super(1000,500,Color.RED); //color는 contentPane 사용해야함.
		super(1000,500,null,MFrame.FLOW_LAYOUT); //호출가능
		
		JButton btn = new JButton("클릭");
		this.add(btn);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIEx9();
	}
}


//JTextField > MTextField => flowlayout일 경우 크기 필수. 
//
//JPanel > MPanel -> 레이아웃 관리자 추가 
//					 색추가 등...
//나만의 MCheck 
//MRadioButton..
//JButton에 setBackgroud:배경색 / setForeground:글자색