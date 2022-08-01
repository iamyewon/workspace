package project81;

public class SetBoxRC implements RemoteController{

		@Override
		public void turnOn() {
			System.out.println("셋톱박스 전원이 켜집니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("셋톱박스 전원이 꺼집니다.");
		}

		@Override
		public void soundUp() {
		}

		@Override
		public void soundDown() {
		}
		
		public void netflix() {
			System.out.println("넷플릭스로 이동합니다.");
		}
		public void menu() {
			System.out.println("메뉴를 보여줍니다.");
		}
		
		public static void main(String[] args) {
			SetBoxRC sbrc = new SetBoxRC();
			sbrc.turnOn();
			sbrc.turnOff();
			sbrc.netflix();
			sbrc.menu();
		}
	}

