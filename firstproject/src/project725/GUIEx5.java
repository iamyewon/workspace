package project725;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIEx5 {
	public static void main(String[] args) {
		JFrame f = new JFrame(); //BorderLayout
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x누르면 실행이 아에 종료됨 , 일일이 중지해줄필요x
		f.setLayout(null);
		f.setSize(500, 500);
		
		JPanel p = new JPanel(); //JFrame 기능을 가진 컴포넌트
		// 적재 가능한 컨테이너(여기에 뭐든 add 할 수 있다는 말)
		// 단독으로 사용이 안되므로 결국엔 JFrame에 붙여서 사용가능하다.
		
		p.setSize(500, 200);
		p.setLocation(0, 300);
	
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		btn1.setSize(70, 50);
		btn2.setSize(70, 50);
		
		p.add(btn1);
		p.add(btn2);
		
		f.add(p);
		f.setVisible(true);
		
		
		
		
		
	}
}
//JFrame 같은걸 Container 라고 하는데, JFrame은 하나만 있어야함 JFrame에 JFrame을 겹칠수x
//JPanel 은 JFrame과 기능은 같은데, 메인이 될 수는 없고 JFrame 위에 붙여 쓸 수 있음.
//JPanel은 기본적으로 FlowLayout 
