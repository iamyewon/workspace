package project81;

class ACRC implements RemoteController{

	@Override
	public void turnOn() {
		System.out.println("������ ������ �����ϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("������ ������ �����ϴ�.");
	}

	@Override
	public void soundUp() { // �Ⱦ��� ������ֱ⸸�ϰ� ������x
	}

	@Override
	public void soundDown() {	
	}

	public void tempUp() {
		System.out.println("������ �µ��� �ø��ϴ�.");
	}
	public void tempDown() {
		System.out.println("������ �µ��� �����ϴ�.");
	}
	public void windDirection() {
		System.out.println("ǳ���� �����մϴ�.");
	}
	public void windPowerUp() {
		System.out.println("�ٶ� ���⸦ ���Դϴ�.");
	}
	public void windPowerDown() {
		System.out.println("�ٶ� ���⸦ ����ϴ�.");
	}
	
	public static void main(String[] args) {
		ACRC acrc = new ACRC();
		acrc.turnOn();
		acrc.turnOff();
		acrc.tempUp();
		acrc.tempDown();
		acrc.windDirection();
		acrc.windPowerUp();
		acrc.windPowerDown();
	}
	
 }