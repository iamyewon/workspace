package project725;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx1 {
	public static void main(String[] args) {
		JFrame f = new JFrame(); //창을 만들었다.
		f.setSize(300, 200); //만들어진 창이름 f 안에 있는 여러 메서드를 사용 할 수 있다. 
		  					 //이 메서드들은 대부분 f의 설정, 값들을 넣거나 가져오는 기능들이다. 
	
		JButton btn1 = new JButton("버튼1"); // 생성자 매개변수
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton();
		btn5.setText("버튼5"); // 글씨넣는 메서드도 있다.
		//이렇게만 만든다면, BorderLayout 은 붙이면 가운데로 가기때문에 버튼5번만 보일것임
		
		
		
		f.add(btn1,"North");
		f.add(btn2,"East");
		f.add(btn3,"West");
		f.add(btn4,"South");
		f.add(btn5,"Center"); // center는 아무것도안써도 center로 감.
		
		//"방향"을 추가해줬는데 이렇게 방향까지 넣어주면
		//레이아웃대로 버튼이 배치됨
		
		
		
		 f.setVisible(true); //화면에 보여라. - 없애주면 안나타남.....
	}
	
	// BorderLayout - JFrame 이 여기 속함.
	// FlowLayout - 자동으로 채우다가 자리없으면 아래줄로.........
	// GridLayout - 모눈종이 같이..  칸칸이 나눠진,...ㅇ.?
	// null <- 절대 레이아웃 - 붙일 위치, 크기, 각각 설정  - 제일 쉽긴 함.. 하나하나 각각 설정해줄수있음 - 매우일이많아짐
	
	
	
}
