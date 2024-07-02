package ex21jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	public static void main(String[] args) {
		try {
			/* JDBC 프로그래밍 절차 */
			/* 1. 오라클용 JDBC 드라이버를 메모리에 로드한다.
			: new를 사용하지 않고 클래스명으로 직접 인스턴스를 생성한 후
			메모리에 로드하는 forName()을 사용한다. */
			Class.forName("oracle.jdbc.OracleDriver");
			
			/* 2. 오라클 연결을 위해 커넥션 URL, 계정 아이디, 패스워드를 준비한다.
			
			jdbc:oracle:thin:@오라클서버의IP주소:포트번호:sid명
			-> 서버 환경에 따라 @ 뒷 부분은 변경될 수 있다. */
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pass = "1234";
			
			/* 3. DriveManager 클래스의 정적 메서드를 호출해서 데이터베이스 연결을 시도하고
			성공한 경우 Connection 인스턴스를 반환한다. */
			Connection con = DriverManager.getConnection(url, id, pass);
			
			/* 4. 반환된 Connection 인스턴스를 통해 DB작업(CRUD)를 진행하면 된다. */
			if (con != null) {
				System.out.println("Oracle 연결 성공");
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
