package project81;

class ACRC implements RemoteController{

	@Override
	public void turnOn() {
		System.out.println("에어컨 전원이 켜집니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("에어컨 전원이 꺼집니다.");
	}

	@Override
	public void soundUp() { // 안쓰면 만들어주기만하고 내용은x
	}

	@Override
	public void soundDown() {	
	}

	public void tempUp() {
		System.out.println("에어컨 온도를 올립니다.");
	}
	public void tempDown() {
		System.out.println("에어컨 온도를 내립니다.");
	}
	public void windDirection() {
		System.out.println("풍향을 변경합니다.");
	}
	public void windPowerUp() {
		System.out.println("바람 세기를 높입니다.");
	}
	public void windPowerDown() {
		System.out.println("바람 세기를 낮춥니다.");
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