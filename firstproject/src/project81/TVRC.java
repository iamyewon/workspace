package project81;

public class TVRC implements RemoteController{
	int vol;
	int ch;
	boolean power;
	// �̹� �������̽��� �����Կ� �����簡 ������ Ű�� ����� ����� ��.
	@Override
	public void turnOn() {
		System.out.println("TV������ �����ϴ�.");
		power = true;
	}

	@Override
	public void turnOff() {
		System.out.println("TV������ �����ϴ�.");
		power = false;
	}

	@Override
	public void soundUp() {
		System.out.println("TV������ ���Դϴ�");
		vol++;
	}

	@Override
	public void soundDown() {
		System.out.println("TV������ ���Դϴ�");
		vol--;
		}
	
	void printVol() { // �� �������� �ִ� ���.
		System.out.println(vol);
	}
	
	
	public static void main(String[] args) {
		TVRC tvrc = new TVRC();
		tvrc.turnOn();
		tvrc.turnOff();
		tvrc.soundUp();
		tvrc.soundDown();
		tvrc.printVol();
	}
}