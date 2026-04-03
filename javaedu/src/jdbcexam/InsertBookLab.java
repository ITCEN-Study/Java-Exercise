package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertBookLab {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		
		String sql = "INSERT INTO book (title, price, kind) VALUES (?, ?, ?)";
        int count = 0;
        
        try (Connection conn = DriverManager.getConnection(url, user, passwd);
        		PreparedStatement pstmt = conn.prepareStatement(sql);
        		Scanner sc = new Scanner(System.in)) {
        			
        		while (true) {
        			System.out.print("도서명을 입력하세요 : ");
        			String title = sc.nextLine();
        			System.out.print("가격을 입력하세요 : ");
        			int price = Integer.parseInt(sc.nextLine());
        			
        			System.out.println("도서분류에 대한 넘버를 입력하세요. ");
        			System.out.println("1. 프로그래밍 언어\n 2. 웹 프로그래밍\n 3. 빅데이터\n 4. 데이터베이스\n 5. 인프라");
        			System.out.print("선택(1~5)");
        			int kindNum = Integer.parseInt(sc.nextLine());
        			
        			String kind = "b0" + kindNum;
        			
        			pstmt.setString(1, title);
                    pstmt.setInt(2, price);
                    pstmt.setString(3, kind);
                    pstmt.executeUpdate();
                    System.out.println("정보가 입력되었습니다.");
                    count++;
                    
                    System.out.print("계속 입력하겠습니까?(y/n) : ");
                    String yn = sc.nextLine();
                    if (yn.equalsIgnoreCase("n")) break;
        		}
        		System.out.println(count + "개의 데이터 입력 완료!");
        		} catch (SQLException e) {
        			e.printStackTrace();
        		}
	}

}
