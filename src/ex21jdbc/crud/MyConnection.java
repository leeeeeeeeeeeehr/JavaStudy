package ex21jdbc.crud;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

// 인터페이스를 구현한 클래스로 DB 연결, 자원 해제 등읜 기능을 담당한다.
public class MyConnection implements IConnect {
	// 멤버변수
	public Connection con;				// DB 연결
	public ResultSet rs;				// select 결과를 반환받기 위한 인스턴스
	public Statement stmt;				// 정적 쿼리문 실행
	public PreparedStatement psmt;		// 동적 쿼리문 실행
	public CallableStatement csmt;		// 프로시저 실행
	
	// 생성자: DB 연결을 처리한다.
	public MyConnection(String user, String pass) {
		try {
			// 오라클 드라이버 로드
			Class.forName(ORACLE_DRIVER);
			// DB에 연결한 후 Connection 인스턴스 반환
			con = DriverManager.getConnection(ORACLE_URL, user, pass);
		}
		catch (Exception e) {
			System.out.println("DB 커넥션 예외 발생");
			e.printStackTrace();
		}
	}
	
	/* 인터페이스를 구현했으므로
	추상메서드를 오버라이딩 하지 않으면 에러가 발생한다.
	반드시 오버라이딩 해야 하는 규칙이 생기므로
	인터페이스를 클래스 상속 간의 설계도라 표현한다. */
	
	@Override
	public void dbExecute() {}

	// 자원 해제
	@Override
	public void dbClose() {
		try {
			if (con != null) con.close();
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (psmt != null) psmt.close();
			if (csmt != null) csmt.close();
			System.out.println("DB 자원 반납");
		}
		catch (Exception e) {
			System.out.println("DB 자원 반납 시 예외 발생");
			e.printStackTrace();
		}
	}
	
	// 사용자로부터 입력값을 받음
	@Override
	public String inputValue(String title) {
		Scanner scan = new Scanner(System.in);
		System.out.print(title + "을(를) 입력 (exit -> 종료): ");
		String inputStr = scan.nextLine();
		// 대소문자 구분 없이 exit 라고 입력하면
		if ("EXIT".equalsIgnoreCase(inputStr)) {
			System.out.println("프로그램을 종료합니다.");
			// DB 자원을 반납하고
			dbClose();
			// 즉시 프로그램을 종료한다.
			System.exit(0);
		}
		// 입력받은 값을 반환한다.
		return inputStr;
	}
}
