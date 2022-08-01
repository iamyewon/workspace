package project81;

interface RemoteController { //퍼블릭 있어도 되고 없어도 되고 상관 없음
	void turnOn();
	void turnOff();
	void soundUp();
	void soundDown();
}

// 상위의 인터페이스를 이용하여 
// tv리모컨, 에어컨 리모컨, 셋톱박스 리모컨 만들기
// 각각의 특이한 메서드를 추가하셔야 합니다. 
