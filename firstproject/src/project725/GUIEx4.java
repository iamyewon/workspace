package project725;

import javax.swing.JButton; //swing안에 기능
import javax.swing.JFrame;

public class GUIEx4 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(null);//기본 레이아웃을 없애버림
		//null 은 붙일 위치,크기를 설정해주어야함.
	
		JButton btn = new JButton("버튼");
		btn.setSize(70, 50);
		btn.setLocation(0, 10);
		
		
		f.add(btn);
		
		
		f.setSize(300, 200);
		f.setVisible(true);
	}
}

// JFrame 같은걸 Container 라고 하는데, JFrame은 하나만 있어야함 JFrame에 JFrame을 겹칠수x
// JPanel 은 JFrame과 기능은 같은데, 메인이 될 수는 없고 JFrame 위에 붙여 쓸 수 있음.
// JPanel은 기본적으로 FlowLayout 
