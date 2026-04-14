package lab;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/lotto1")
public class LottoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String clientNumStr = request.getParameter("lottoNum");
		int clientNum = Integer.parseInt(clientNumStr);

		Random rand = new Random();
		int serverNum = rand.nextInt(6) + 1;

		System.out.println("전달된 값: " + clientNum + ", 추출된 값: " + serverNum);

		String targetPath;
		if (clientNum == serverNum) {
			targetPath = "/clientexam/success.html";
		} else {
			targetPath = "/clientexam/fail.html";
		}

		RequestDispatcher rd = request.getRequestDispatcher(targetPath);
		rd.forward(request, response);
	}
}
