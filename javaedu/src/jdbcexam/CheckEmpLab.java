package jdbcexam;
import java.sql.*;
import java.util.Scanner;

public class CheckEmpLab {
    public static void main(String[] args) {
    	String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";

        try (Connection conn = DriverManager.getConnection(url, user, passwd);
             Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.print("검색할 직원의 이름을 입력하세요: ");
                String name = sc.next();

                String sql = "SELECT ename, hiredate, deptno FROM emp WHERE UPPER(ename) = UPPER(?)";
                
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    pstmt.setString(1, name);
                    try (ResultSet rs = pstmt.executeQuery()) {
                        if (rs.next()) {
                            String ename = rs.getString("ename");
                            Date hiredate = rs.getDate("hiredate");
                            int deptno = rs.getInt("deptno");
                            
                            System.out.printf("%s 직원은 근무중입니다.\n", ename);
                            System.out.printf("%tY년 %tm월에 입사했고 현재 %d 번부서에서 근무하고 있습니다.\n", 
                                              hiredate, hiredate, deptno);
                        } else {
                            System.out.printf("%s 직원은 근무하지 않습니다.\n", name);
                        }
                    }
                }
                System.out.print("계속 검토하시겠습니까? (y/n): ");
                String choice = sc.next();
                if (choice.equalsIgnoreCase("n")) {
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}