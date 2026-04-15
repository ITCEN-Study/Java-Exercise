package lab;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/lotto3")
public class LottoServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}

		int count = (int) session.getAttribute("count");

		if (count >= 3) {
			request.setAttribute("msg", "더 이상 응모할 수 없어요… 브라우저를 재기동한 후에 가능하답니다.");
			RequestDispatcher rd = request.getRequestDispatcher("/jspexam/lottoResult2.jsp");
			rd.forward(request, response);
			return;
		}

		session.setAttribute("count", ++count);

		String clientNumStr = request.getParameter("lottoNum");
		int clientNum = Integer.parseInt(clientNumStr);

		Random rand = new Random();
		int serverNum = rand.nextInt(6) + 1;

		System.out.println("전달된 값: " + clientNum + ", 추출된 값: " + serverNum + ", 응모 횟수: " + count);

		if (clientNum == serverNum) {
			request.setAttribute("msg", "당첨~~~ 추카추카");
			request.setAttribute("imginfo", "/edu/images/success.jpg");
			session.setAttribute("count", 3);
		} else {
			request.setAttribute("msg", "실패~~~ 아쉽아쉽");
			request.setAttribute("imginfo", "/edu/images/fail.jpg");
		}

		RequestDispatcher rd = request.getRequestDispatcher("/jspexam/lottoResult2.jsp");
		rd.forward(request, response);
	}
}