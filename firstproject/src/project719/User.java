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
		System.out.println("����� - ID : "+userId+" // �̸� : "+userName+" // �ּ� : "+userAdress+" // ��ȭ��ȣ : "+userPhoneNum);
	}
	
	
	public static void main(String[] args) {
		User user = new User();
		user.userId = "yeni";
		user.userName = "�迹��";
		user.userAdress = "������";
		user.userPhoneNum = "010-2742-2695";
		user.printUserInfo();
		
		User user2 = new User();
		user2.userId = "yeni-friend";
		user2.userName = "����ģ��";
		user2.userAdress = "��";
		user2.userPhoneNum = "010-8282-7979";
		user2.printUserInfo();
		
		User user3 = new User();
		user3.userId = "min";
		user3.userName = "�ΰ�";
		user3.userAdress = "���Ǵ뿪 5�аŸ�";
		user3.userPhoneNum = "010-0000-0000";
		user3.printUserInfo();
	}

	
	
}