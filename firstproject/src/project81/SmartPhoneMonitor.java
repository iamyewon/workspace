package project81;

public class SmartPhoneMonitor implements Monitor {
	boolean power;
	int vol;
	double monitorSize;
	int brightness;
	
	@Override
	public void turnOn() {
		System.out.println("?޴??? ?????? ?????ϴ?.");
		power = true;
	}

	@Override
	public void turnOff() {
		System.out.println("?޴??? ?????? ?????ϴ?.");
		power = false;
	}
	
	public void volUp() {
		System.out.println("?????? ???Դϴ?.");
		vol++;
	}
	
	public void volDown() {
		System.out.println("?????? ?????ϴ?");
		vol--;
	}
	
	public void checkMonitorSize() {
		monitorSize = 6.1;
		System.out.println("?޴??? ???????? ???????? "+monitorSize+"??ġ ?Դϴ?.");
	}
	public void checkBrightness() {
		brightness = 50;
		System.out.println("??????"+brightness+"%?Դϴ?.");
	}

	public static void main(String[] args) {
		SmartPhoneMonitor phoneM = new SmartPhoneMonitor();
		phoneM.turnOn();
		phoneM.turnOff();
		phoneM.volUp();
		phoneM.volDown();
		phoneM.checkMonitorSize();
		phoneM.checkBrightness();
	}
	
}
