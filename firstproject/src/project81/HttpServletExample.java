package project81;

abstract class HttpServlet{
	public abstract void service();
}
public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());  //1 //�α��� ���
		method(new FileDownloadServlet());//2 //�ٿ�ε� ���
	}
	// LoginServlet, FileDownloadServlet 
	// �Ѵ� HttpServlet Ÿ���̴�.
	
	public static void method(HttpServlet servlet) { //1,2�� servlet���� ��
		servlet.service();
	}
}

//login�����̶� fileDownload������ ��ġ���� ���� ���� Ŭ�������� ����� �� �� ����