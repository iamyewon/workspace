package project81;

public class SetBoxRC implements RemoteController{

		@Override
		public void turnOn() {
			System.out.println("����ڽ� ������ �����ϴ�.");
		}

		@Override
		public void turnOff() {
			System.out.println("����ڽ� ������ �����ϴ�.");
		}

		@Override
		public void soundUp() {
		}

		@Override
		public void soundDown() {
		}
		
		public void netflix() {
			System.out.println("���ø����� �̵��մϴ�.");
		}
		public void menu() {
			System.out.println("�޴��� �����ݴϴ�.");
		}
		
		public static void main(String[] args) {
			SetBoxRC sbrc = new SetBoxRC();
			sbrc.turnOn();
			sbrc.turnOff();
			sbrc.netflix();
			sbrc.menu();
		}
	}
