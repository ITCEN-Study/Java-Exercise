package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SelectBookLab {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		
		Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###원");
        		
        try (Connection conn = DriverManager.getConnection(url, user, passwd)) {
        	while (true) {
        		System.out.println("\n1. 모두 출력하기\n2. 가격이 높은 순으로 출력하기\n3. 20000 이상의 도서들만 출력하기");
                System.out.println("4. 웹 프로그래밍 도서들만 출력하기\n5. 데이터베이스와 인프라 도서들만 출력하기");
                System.out.println("6. 도서명에 '자바'를 포함하는 도서들만 출력하기");
                System.out.print("\n원하는 메뉴의 번호를 선택 : ");
                
                int menu = Integer.parseInt(sc.nextLine());
                String sql = "";
                
                switch (menu) {
                case 1: sql = "SELECT * FROM book"; break;
                case 2: sql = "SELECT * FROM book ORDER BY price DESC"; break;
                case 3: sql = "SELECT title, price FROM book WHERE price >= 20000"; break;
                case 4: sql = "SELECT title, price FROM book WHERE kind = 'b02'"; break;
                case 5: sql = "SELECT title, price FROM book WHERE kind IN ('b04', 'b05')"; break;
                case 6: sql = "SELECT title, price FROM book WHERE title LIKE '%자바%'"; break;
            }
                try (Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql)) {
                	
                	while (rs.next()) {
                		if (menu <= 2) {
                			System.out.printf("%d | %-20s | %s | %s\n", 
                                    rs.getInt("id"), rs.getString("title"), 
                                    df.format(rs.getInt("price")), rs.getString("kind"));
                		}
                		else {
                			System.out.printf("%-20s | %s\n", 
                                    rs.getString("title"), df.format(rs.getInt("price")));
                		}
                	}
                }
                
                System.out.print("\n계속 처리하겠습니까?(y/n) : ");
                if (sc.nextLine().equalsIgnoreCase("n")) break;
        	}
        } catch (SQLException e) {
        	e.printStackTrace();
        }
	}

}
