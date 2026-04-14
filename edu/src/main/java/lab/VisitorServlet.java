package lab;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/visitor")
public class VisitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");

		String name = request.getParameter("visitorName");
		String content = request.getParameter("content");

		LocalDate now = LocalDate.now();
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();

		PrintWriter out = response.getWriter();
		out.print("<h2>" + name + " 님이 " + year + "년 " + month + "월 " + day + "일에 남긴 글입니다.</h2>");
		out.print("<hr>");
		out.print("<p>" + content + "</p>");
		out.print("<hr>");
		out.print("<a href='/edu/clientexam/visitorForm.html'>입력 화면으로 이동</a>");

		out.close();
	}

}
