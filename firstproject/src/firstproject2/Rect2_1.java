package firstproject2;

public class Rect2_1 { // �簢�� Ŭ����
	private int width;
	private int height;
	//private?.. �� Ŭ���� �ȿ����� ����� �� �ִ�..
	
	
//	Rect(){} // �ڵ����� ��������⸸ �ϸ� �Ǵ� �� ������
//	
//	Rect(int w, int h){ //�����ڰ� �ϳ��� ������ ������ڴ� �������Ƿ� 
//		width=w;		// ���� ����� �����.
//		height=h;
//	}
//	
	
	//����� �����Ұ��̶�� �޼��� �̸��� ��������.. ����� �˼��ְ�.
	void setSize(int w, int h) { //�޾ƿ� �� w,h��
//		this.width=w; 			// Ŭ���� ���� width�� height�� �־��ִ� �޼���.
//		this.height=h;			// ó���� �̷��� ���� this �� �򰥸��� ��� �ȴٰ� �� .. 
//	}
		if(w>=1000)w=1000; //��ȣ������ ���ٷ�
		if(h>=1000) {
			h=1000;
		}
		
		width=w;
		height=h;
		
	}
	
	
	
	//����� ����Ұ��̶�� �޼��� �̸��� ��������. 
	void printSize() {
		System.out.println("���δ�"+width+"�̰�, ���δ� "+height+"�Դϴ�.");
	}
	
	
}
