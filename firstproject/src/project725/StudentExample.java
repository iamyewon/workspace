package project725;

 class People {
	public String name;
	public String ssn;
	
	//빈생성자가 없으면 만들어줘야..
	//내가 생성되기전에 부모부터 먼저 생성된다는것이 핵심..
	
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); //super - 내 자신이 상속받은 부모의 생성자
		//new People(sName, sSsn); // 이것은 상속받은 클래스가 아닌 새로운 People임
		this.studentNo = studentNo;
	}
}

public class StudentExample{
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println("name : "+ student.name);
		System.out.println("ssn : "+ student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}
}


