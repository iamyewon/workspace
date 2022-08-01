package project81;

public class NavigationMonitor implements Monitor {
	boolean power;
	int vol;
	double monitorSize;
	int brightness;

	@Override
	public void turnOn() {
		System.out.println("네비게이션 전원이 켜집니다.");
		power = true;
		
	}
	@Override
	public void turnOff() {
		System.out.println("네비게이션 전원이 꺼집니다.");
		power = false;
		
	}
	public void volUp() {
		System.out.println("볼륨을 높입니다.");
		vol+=3;
	}
	
	public void volDown() {
		System.out.println("볼륨을 낮춥니다");
		vol--;
	}
	
	public void checkMonitorSize() {
		monitorSize = 10.25;
		System.out.println("휴대폰 모니터의 사이즈는 "+monitorSize+"인치 입니다.");
	}
	public void checkBrightness() {
		brightness = 70;
		System.out.println("밝기는"+brightness+"%입니다.");
	}
	public void checkVol() {
		System.out.println("현재 볼륨은 "+vol+"입니다.");
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
