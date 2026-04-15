package lab;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/lotto2")
public class LottoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String clientNumStr = request.getParameter("lottoNum");
		int clientNum = Integer.parseInt(clientNumStr);

		Random rand = new Random();
		int serverNum = rand.nextInt(6) + 1;

		System.out.println("전달된 값: " + clientNum + ", 추출된 값: " + serverNum);

		if (clientNum == serverNum) {
			request.setAttribute("msg", "당첨~~~ 추카추카");
			request.setAttribute("imginfo", "/edu/images/success.jpg");
		} else {
			request.setAttribute("msg", "실패~~~ 아쉽아쉽");
			request.setAttribute("imginfo", "/edu/images/fail.jpg");
		}

		RequestDispatcher rd = request.getRequestDispatcher("/jspexam/lottoResult.jsp");
		rd.forward(request, response);
	}
}