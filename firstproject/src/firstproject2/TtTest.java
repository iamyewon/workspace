package firstproject2;

 class Timetables {
	 void ttable(int i) {
		 for(int z=1;z<10;z++) {
		 System.out.println(i+"x"+z+"="+(i*z));
		 }
	 }
}



public class TtTest{ // Ŭ������ 2���� ��� main �� �ִ� Ŭ���� �̸����� �ؾ���. 
	// Ŭ������ 2���� ��� ���ϸ� = Ŭ������ �ΰ��� public�� ���δ�.  
	// �ƴϸ� �Ѵ� ��� �Ǵµ� �������� �ѱ����� ������.
	// ������ ��ɺ��� ���� �� �����ֱ⶧����. �ΰ��� �� ���� �� ������.(?)
	public static void main(String[] args) {
		Timetables tt = new Timetables(); //�׻� �����ʿ�!!
		tt.ttable(2); // 2�� �������� ���.
		//3�� �ϰ������� tt.ttable(3); �̷�������  
	}
}