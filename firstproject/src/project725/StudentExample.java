package project725;

 class People {
	public String name;
	public String ssn;
	
	//������ڰ� ������ ��������..
	//���� �����Ǳ����� �θ���� ���� �����ȴٴ°��� �ٽ�..
	
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); //super - �� �ڽ��� ��ӹ��� �θ��� ������
		//new People(sName, sSsn); // �̰��� ��ӹ��� Ŭ������ �ƴ� ���ο� People��
		this.studentNo = studentNo;
	}
}

public class StudentExample{
	public static void main(String[] args) {
		Student student = new Student("ȫ�浿", "123456-1234567", 1);
		System.out.println("name : "+ student.name);
		System.out.println("ssn : "+ student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}
}

