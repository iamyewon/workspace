package project81;

public class TVRC implements RemoteController{
	int vol;
	int ch;
	boolean power;
	// 이미 인터페이스를 구현함에 제조사가 실제로 키는 기능을 만들어 둠.
	@Override
	public void turnOn() {
		System.out.println("TV전원이 켜집니다.");
		power = true;
	}

	@Override
	public void turnOff() {
		System.out.println("TV전원이 꺼집니다.");
		power = false;
	}

	@Override
	public void soundUp() {
		System.out.println("TV볼륨을 높입니다");
		vol++;
	}

	@Override
	public void soundDown() {
		System.out.println("TV볼륨을 줄입니다");
		vol--;
		}
	
	void printVol() { // 내 리모컨에 있는 기능.
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