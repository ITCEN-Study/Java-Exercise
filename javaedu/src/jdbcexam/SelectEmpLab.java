package jdbcexam;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class SelectEmpLab {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		
		Random rd = new Random();
        boolean flag = rd.nextBoolean();
        
        String sql = "";
        if (flag) {
        	sql = "SELECT ename, sal FROM emp";
        } else {
        	sql = "SELECT ename, hiredate FROM emp ORDER BY hiredate ASC";
        }
        
        try (Connection conn = DriverManager.getConnection(url, user, passwd);
        		Statement stmt = conn.createStatement();
        		ResultSet rs = stmt.executeQuery(sql)) {
        	
        	while (rs.next()) {
        		if (flag) {
        			System.out.printf("%s 직원의 월급은 %,d달러입니다.\n", rs.getString("ename"), rs.getInt("sal"));
        		} else {
        			Date date = rs.getDate("hiredate");
        			System.out.printf("%s 직원은 %tY년 %tm월 %td일에 입사하였습니다.\n", 
                            rs.getString("ename"), date, date, date);
        		}
        	}
        } catch (SQLException e) {
        	e.printStackTrace();
        }
	}

}
