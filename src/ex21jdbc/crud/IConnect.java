package ex21jdbc.crud;

// JDBC 프로그램에서 최상위 인터페이스로 사용
public interface IConnect {
	/* interface에,,,
	선언한 변수는 public static final이 자동으로 추가된다. 즉, 멤버상수로 선언된다.
	선언한 메서드는 public abstract가 자동으로 추가된다. 즉, 추상메서드만 선언할 수 있다. */
	
	// 드라이버와 커넥션 URL을 멤버상수로 선언
	String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
	String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	// 추상 메서드 선언
	void dbExecute();						// 쿼리문 실행하기 위한 메서드
	void dbClose();							// 자원 반납하기 위한 메서드
	String inputValue(String title);		// 사용자로부터 입력값 받기 위한 메서드
}
