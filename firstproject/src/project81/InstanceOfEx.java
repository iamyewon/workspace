package project81;

class IOParents{
	
}
class IOChild extends IOParents{
	
}
public class InstanceOfEx {
public static void main(String[] args) {
	IOParents iop = new IOChild();
	IOParents iop2 = new IOParents();
	//IOChild ioc = new IOParents(); 안됨
	//IOChild ioc = (IOChild) new IOParents(); //자식보다 부모가 늦게 만들어져서 에러
	System.out.println(iop instanceof IOParents);
	System.out.println(iop instanceof IOChild);
	System.out.println(iop2 instanceof IOChild); //false => Parents를 통해 Parents 를 만들었으니까 Child에 넣을 수 없다.(Child를 통해 만들어진 것이 아님)
	// 생성된 변수가 instanceOf 타입 인가??? 
	// 생성된 변수를 instanceOf 타입 변수에 넣을 수 있는가?
	String str = "하이";
	System.out.println(str instanceof Object); //Object에서 상속받음


}
}
