package project81;

public class TVMonitor implements Monitor {
	boolean power;
	int vol;
	String resolution;
	int brightness;
	
	@Override
	public void turnOn() {
		System.out.println("TV전원이 켜집니다.");
		power = true;
	}

	@Override
	public void turnOff() {
		power = false;
		System.out.println("TV전원이 꺼집니다.");
		
	}
	public void volUp() {
		System.out.println("볼륨을 높입니다.");
		vol++;
	}
	
	public void volDown() {
		System.out.println("볼륨을 낮춥니다");
		vol--;
	}
	
	public void checkResolution() {
		resolution = "1920 X 1080";
		System.out.println("해상도는"+resolution+"입니다.");
	}
	public void checkBrightness() {
		brightness = 90;
		System.out.println("밝기는"+brightness+"%입니다.");
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
