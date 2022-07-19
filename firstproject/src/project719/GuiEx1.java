package project719;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuiEx1 { // 스윙 - 로컬 프로그램  / 요즘은 온라인프로그램
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // 창하나 만들기
		frame.setSize(500, 500); // 크기 설정
		
		JPanel pnl = new JPanel(); //패널 만들기
		pnl.setBackground(Color.RED); //패널 배경색 빨간색
		
		JButton btn = new JButton("click"); //버튼 만들기
		pnl.add(btn); // 만들어진 버튼을 패널에 붙이기
				
		frame.add(pnl); // 프레임에 패널을 붙이기. 		
		frame.setVisible(true); // 화면에 표시하기 
		
		//화면 갱신(표시?)은 마지막에 하면 좋음.
	}
}
	