package project719;

class Constructor{
	int num;
	String str;
	
	//������ �ϳ��� �� ����� �ȴ�. �ߺ� �ڵ尡 �پ���.
	
	public Constructor() {//��ȣ�ȿ� �Ű����� ����, Ÿ��, ������ �޶���Ѵ�.
		this("�ȳ�",10); //1   //this�� �� Ŭ������ �ǹ��ϰ�, super�� �θ� Ŭ������ �ǹ��Ѵ�.
	}
	public Constructor(int a) {
		this("�ȳ�",a);//Constructor("�ȳ�",a); �� ����. //2
	}
	public Constructor(String s, int a) { //this�� Ŭ�������̶�� �����ϸ� �ȴ�.
		//s�� str�̶��ϰ� a�� num�̶� ġ��.. num=num;�̵ǰ� str=str;�� �Ǵµ�. �׷��� this�� ����..
		this.num=a; //Constructor.num �� �ǹ��̴�.
		this.str=s; //1�� 2�� 3��° ���� �θ��� �ִ�......??
		//this �� ���� ������ ���� ���� ������ �� ��Ȯ�ϰ� ���ֱ� ���ؼ��̴�.
	}
}



public class ConstructorEx {
	public static void main(String[] args) {
		
	}
}
