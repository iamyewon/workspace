package project81;

public class TVMonitor implements Monitor {
	boolean power;
	int vol;
	String resolution;
	int brightness;
	
	@Override
	public void turnOn() {
		System.out.println("TV������ �����ϴ�.");
		power = true;
	}

	@Override
	public void turnOff() {
		power = false;
		System.out.println("TV������ �����ϴ�.");
		
	}
	public void volUp() {
		System.out.println("������ ���Դϴ�.");
		vol++;
	}
	
	public void volDown() {
		System.out.println("������ ����ϴ�");
		vol--;
	}
	
	public void checkResolution() {
		resolution = "1920 X 1080";
		System.out.println("�ػ󵵴�"+resolution+"�Դϴ�.");
	}
	public void checkBrightness() {
		brightness = 90;
		System.out.println("����"+brightness+"%�Դϴ�.");
	}

	public static void main(String[] args) {
		TVMonitor tvm = new TVMonitor();
		tvm.turnOn();
		tvm.turnOff();
		tvm.volUp();
		tvm.volDown();
		tvm.checkResolution();
		tvm.checkBrightness();
	}
	
	

}