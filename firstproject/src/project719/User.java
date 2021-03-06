package project719;

public class User {
	private String userId;
	private String userName;
	private String userAdress;
	private String userPhoneNum;
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setUserAdress(String userAdress) {
		this.userAdress = userAdress;
	}
	
	public void set(String userPhoneNum) {
		this.userPhoneNum = userPhoneNum;
	}
	public void printUserInfo() {
		System.out.println("사용자 - ID : "+userId+" // 이름 : "+userName+" // 주소 : "+userAdress+" // 전화번호 : "+userPhoneNum);
	}
	
	
	public static void main(String[] args) {
		User user = new User();
		user.userId = "yeni";
		user.userName = "김예원";
		user.userAdress = "엘이즈";
		user.userPhoneNum = "010-2742-2695";
		user.printUserInfo();
		
		User user2 = new User();
		user2.userId = "yeni-friend";
		user2.userName = "예원친구";
		user2.userAdress = "집";
		user2.userPhoneNum = "010-8282-7979";
		user2.printUserInfo();
		
		User user3 = new User();
		user3.userId = "min";
		user3.userName = "민경";
		user3.userAdress = "동의대역 5분거리";
		user3.userPhoneNum = "010-0000-0000";
		user3.printUserInfo();
	}

	
	
}
