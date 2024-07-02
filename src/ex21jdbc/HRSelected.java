package ex21jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class HRSelected {

	public static void main(String[] args) {
		try {
			// 오라클 데이터베이스 연결
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id=  "hr";
			String pass = "1234";
			
			// 연결 성공 시 반환되는 Connection 객체를 통해 JDBC 작업을 수행한다.
			Connection con = DriverManager.getConnection(url, id, pass);
			if (con != null) {
				System.out.println("Oracle 연결성공");
				/* 1. 쿼리문 작성
				: 작성 시 줄바꿈을 할 때 앞뒤로 스페이스를 삽입하는 것이 좋다.
				그렇지 않으면 문장이 서로 이어지게 되어 SyntaxError가 발생하게 된다. */
				String sql = "SELECT * FROM employees "
							+ " WHERE department_id=50 "
							+ " ORDER BY employee_id DESC";
				
				/* 2. 쿼리문 전송을 위해 Statement 인터페이스의 인스턴스를 생성한다. */
				Statement stmt = con.createStatement();
				
				/* 3. 쿼리문을 오라클로 전송한다.
				실행된 결과는 ResultSet 인스턴스를 통해 반환받는다. */
				ResultSet rs = stmt.executeQuery(sql);
				
				/* 4. 반환된 결과의 갯수만큼 반복하여 출력한다.
				next() 메서드는 출력할 레코드가 남았는지 확인하고
				더 이상 레코드가 없다면 false를 반환하여 while문을 탈출하게 된다. */
				while (rs.next()) {
					/* 5. getXXX() 메서드를 통해 각 컬럼에 접근한다.
					오라클의 자료형은 문자, 숫자, 날짜 3가지 형태이므로 메서드도 이와 동일한 형태를 가지고 있다.
					각 컬럼에 접근할 때 아래와 같이 인덱스와 컬럼명 두 가지를 사용할 수 있다. */
					
					// 인덱스 1이므로 employee_id를 가리킨다.
					String emp_id = rs.getString(1);
					String f_name = rs.getString("first_name");
					String l_name = rs.getString("last_name");
					// 날짜 형식으로 데이터를 얻어온다.
					java.sql.Date h_date = rs.getDate("hire_date");
					// 숫자 형식으로 데이터를 얻어온다.
					int sal = rs.getInt("salary");
					System.out.printf("%s %s %s%s %s\n", emp_id, f_name, l_name, h_date, sal);
				}
				/* 6. 자원 반납
				: 모든 작업을 마친 후에는 메모리 절약을 위해 연결했던 자원을 모두 반납한다. */
				rs.close();
				stmt.close();
				con.close();
			}
			else {
				System.out.println("Oracle 연결 실패");
			}
		}
		catch (Exception e) {
			System.out.println("Oracle 연결 시 예외 발생");
			e.printStackTrace();
		}
	}
}
