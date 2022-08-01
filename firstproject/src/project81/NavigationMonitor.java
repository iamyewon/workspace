package project81;

public class NavigationMonitor implements Monitor {
	boolean power;
	int vol;
	double monitorSize;
	int brightness;

	@Override
	public void turnOn() {
		System.out.println("�׺���̼� ������ �����ϴ�.");
		power = true;
		
	}
	@Override
	public void turnOff() {
		System.out.println("�׺���̼� ������ �����ϴ�.");
		power = false;
		
	}
	public void volUp() {
		System.out.println("������ ���Դϴ�.");
		vol+=3;
	}
	
	public void volDown() {
		System.out.println("������ ����ϴ�");
		vol--;
	}
	
	public void checkMonitorSize() {
		monitorSize = 10.25;
		System.out.println("�޴��� ������� ������� "+monitorSize+"��ġ �Դϴ�.");
	}
	public void checkBrightness() {
		brightness = 70;
		System.out.println("����"+brightness+"%�Դϴ�.");
	}
	public void checkVol() {
		System.out.println("���� ������ "+vol+"�Դϴ�.");
	}
	
	public static void main(String[] args) {
		NavigationMonitor navM = new NavigationMonitor();
		navM.turnOn();
		navM.turnOff();
		navM.volUp();
		navM.volDown();
		navM.checkMonitorSize();
		navM.checkBrightness();
		navM.checkVol();
	}
	
}
