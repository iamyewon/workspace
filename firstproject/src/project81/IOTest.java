/*package project81;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//instance of test
public class IOTest extends JFrame{ //JFrame은 컨테이너
	JPanel pnl;
	JButton btn;
	JCheckBox ck;
	JRadioButton rb;
	public IOTest() {
		pnl = new JPanel(); //컨테이너이자 컴포넌트
		btn = new JButton("버튼");
		ck = new JCheckBox("체크박스");
		rb = new JRadioButton("라디오버튼");
		pnl.add(btn);
		pnl.add(ck);
		pnl.add(rb);
		this.pnl.add(pnl); //this는 JFrame을 의미한다
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		IOTest iot = new IOTest();
		System.out.println(iot.pnl.getComponentCount());
		int cnt=0;
		for(int i=0;i<iot.pnl.getComponentCount();i++) {
			if(iot.pnl.getComponent(i) instanceof JButton) {
				System.out.println(((JButton)iot.pnl.getComponent(i)).getText());
				cnt++;
			}//가져온 변수(생성된 instance)가 어떤 타입인지 확인 가능
		}
		System.out.println(cnt);
	}
}


오ㅐ안돼 */