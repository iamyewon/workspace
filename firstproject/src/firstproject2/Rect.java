package firstproject2;

public class Rect { // �簢�� Ŭ����
	int width;
	int height;
	
	
	//����� �����Ұ��̶�� �޼��� �̸��� ��������.. ����� �˼��ְ�.
	void setSize(int w, int h) { //�޾ƿ� �� w,h��
		this.width=w; 			// Ŭ���� ���� width�� height�� �־��ִ� �޼���.
		this.height=h;			// ó���� �̷��� ���� this �� �򰥸��� ��� �ȴٰ� �� .. 
	}
	
	
	//����� ����Ұ��̶�� �޼��� �̸��� ��������. 
	void printSize() {
		System.out.println("���δ�"+width+"�̰�, ���δ� "+height+"�Դϴ�.");
	}
	
	
}