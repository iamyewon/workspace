package project81;

abstract class HttpServlet{
	public abstract void service();
}
public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());  //1 //로그인 출력
		method(new FileDownloadServlet());//2 //다운로드 출력
	}
	// LoginServlet, FileDownloadServlet 
	// 둘다 HttpServlet 타입이다.
	
	public static void method(HttpServlet servlet) { //1,2가 servlet으로 들어감
		servlet.service();
	}
}

//login파일이랑 fileDownload파일을 합치려면 따로 만든 클래스파일 지우고 쓸 수 있음