package project81;

class IOParents{
	
}
class IOChild extends IOParents{
	
}
public class InstanceOfEx {
public static void main(String[] args) {
	IOParents iop = new IOChild();
	IOParents iop2 = new IOParents();
	//IOChild ioc = new IOParents(); �ȵ�
	//IOChild ioc = (IOChild) new IOParents(); //�ڽĺ��� �θ� �ʰ� ��������� ����
	System.out.println(iop instanceof IOParents);
	System.out.println(iop instanceof IOChild);
	System.out.println(iop2 instanceof IOChild); //false => Parents�� ���� Parents �� ��������ϱ� Child�� ���� �� ����.(Child�� ���� ������� ���� �ƴ�)
	// ������ ������ instanceOf Ÿ�� �ΰ�??? 
	// ������ ������ instanceOf Ÿ�� ������ ���� �� �ִ°�?
	String str = "����";
	System.out.println(str instanceof Object); //Object���� ��ӹ���


}
}