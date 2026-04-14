package lab;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reservation")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		String resName = request.getParameter("resName");
		String room = request.getParameter("room");
		String[] options = request.getParameterValues("option");
		String resDateStr = request.getParameter("resDate");

		if (room != null) {
			switch (room) {
			case "dooly":
				room = "둘리";
				break;
			case "heedong":
				room = "희동";
				break;
			case "douner":
				room = "도우너";
				break;
			case "ttocchi":
				room = "또치";
				break;
			}
		}

		String formattedDate = "날짜가 선택되지 않았습니다.";
		if (resDateStr != null && !resDateStr.isEmpty()) {
			LocalDate date = LocalDate.parse(resDateStr);
			formattedDate = date.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
		}

		String optionsStr = "";
		if (options != null && options.length > 0) {
			for (int i = 0; i < options.length; i++) {
				switch (options[i]) {
				case "bbq":
					options[i] = "바베큐";
					break;
				case "pool":
					options[i] = "수영장";
					break;
				case "fishing":
					options[i] = "낚시";
					break;
				case "breakfast":
					options[i] = "조식";
					break;
				}
			}
			optionsStr = String.join(", ", options);
		} else {
			optionsStr = "없음";
		}

		out.print("<h1>" + resName + "님의 예약 내용</h1>");
		out.print("<hr>");
		out.print("<ul>");
		out.print("<li>선택한 룸: " + room + "</li>");
		out.print("<li>추가 요청 사항: " + optionsStr + "</li>");
		out.print("<li>예약 날짜: " + formattedDate + "</li>");
		out.print("</ul>");
		out.print("<br>");
		out.print("<a href='/edu/clientexam/reservation.html'>예약 페이지로 이동</a>");

		out.close();
	}
}