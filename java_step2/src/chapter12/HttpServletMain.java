package chapter12;

public class HttpServletMain {
	public static void main(String[] args) {
		FileDownloadServlet fds = new FileDownloadServlet();
		LoginServlet ls = new LoginServlet();
		fds.service();
		ls.service();
		System.out.println("-====================");
		method(new FileDownloadServlet());
		method(new LoginServlet());
		System.out.println("-====================");
	}

	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
