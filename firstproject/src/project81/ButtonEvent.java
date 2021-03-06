package project81;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEvent {
	public static void main(String[] args) { // 메인은 다른곳에서 호출x 자기자신에서만.. 메인은 테스트용 정도.. 실제클래스라면 메인에 쓰지않음.
		JFrame frame = new JFrame(); // 메인은 없어도 된다. 메인은 실행하는 순서를 쓰는곳 
		frame.setLayout(new FlowLayout()); // 다른 곳에서 실행 할거면 필요 없는 부분.
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		frame.add(btn1);
		frame.add(btn2);
		
		//인터페이스를 생성하려면 생성과 동시에 내용을 작성해야 한다. implements를 안썼음 여기선 
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { //e에 무슨버튼을 눌렸는지 담김
				if(e.getSource()==btn1) { //btn1을 누르면 {~} ~를 실행시켜라
					System.out.println("버튼1");
				}else if(e.getSource()==btn2) {//btn2을 누르면 {~} ~를 실행시켜라
					System.out.println("버튼2");
				}				
			}
		};
		btn1.addActionListener(listener); //버튼에 액션 붙이기.
		btn2.addActionListener(listener);
		
		frame.setVisible(true);
	}
}
