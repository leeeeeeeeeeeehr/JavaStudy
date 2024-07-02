package ex21jdbc.crud;

import java.sql.SQLException;

// MyConnection 클래스를 상속하여 정의한다.
public class SQLinsert extends MyConnection {
	/* 부모 생성자의 호출을 통해 DB 연결을 하고
	자식 클래스에서는 DB 작업을 수행한다. */
	public SQLinsert(String user, String pass) {
		// 부모 생성자 호출 시 계정 아이디와 비밀번호를 전달한다.
		super(user, pass);
	}
	
	// 멤버변수
	String query;		// 쿼리문 작성
	int result;			// 쿼리 실행 결과 반환

	// CRUD 작업을 위한 메서드 오버라이딩
	@Override
	public void dbExecute() {
		try {
			// 정적 쿼리문 실행을 위한 Statement 인스턴스 생성
			stmt = con.createStatement();
			// insert 쿼리문 작성
//			query = "INSERT INTO member VALUES ('test1', '1111', '테스터1', sysdate)";	// 첫 번째 실행
//			query = "INSERT INTO member VALUES ('test2', '2222', '테스터2', sysdate)";	// 두 번째 실행할 땐 데이터 변경해줘야 함
			query = "INSERT INTO member VALUES ('test3', '3333', '테스터3', sysdate)";
			// 쿼리 실행 및 결과 반환
			result = stmt.executeUpdate(query);
			// insert 성공 시 1, 실패 시 0을 반환한다.
			System.out.println("[stmt]" + result + "행 입력됨");
			
			////////////////////////////////////////////////////////////////////////
			
			// 인파라미터가 있는 동적 쿼리문 작성
			query = "INSERT INTO member VALUES (?, ?, ?, sysdate)";
			// 쿼리문을 인자로 preparedStatement 인스턴스 생성
			// 인터페이스는 preparedStatement이고 메서드는 prepareStatement이므로 주의해야 한다.
			psmt = con.prepareStatement(query);
			// 입력값을 받은 후 인파라미터를 순서대로 설정 (DB는 인덱스가 1부터 시작)
			psmt.setString(1, inputValue("아이디"));
			psmt.setString(2, inputValue("패스워드"));
			psmt.setString(3, inputValue("이름"));
			// 쿼리문 실행 및 결과 반환
			result = psmt.executeUpdate();
			// insert 성공 시 1, 실패 시 0을 반환한다.
			System.out.println("[psmt]" + result + "행 입력됨");
		}
		catch (SQLException e) {
			System.out.println("쿼리 실행 중 예외 발생");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// insert 쿼리 실행을 위한 인스턴스 생성 및 메서드 호출
		new SQLinsert("study", "1234").dbExecute();
	}
}
