package ex21jdbc.crud;

import java.sql.SQLException;

public class SQLdelete extends MyConnection {
	public SQLdelete(String user, String pass) {
		super(user, pass);
	}
	
	String query;
	int result;
	
	@Override
	public void dbExecute() {
		try {
			// 정적 쿼리 실행을 위한 인스턴스 생성
			stmt = con.createStatement();
			// 레코드 삭제를 위한 delete 쿼리문 작성
			query = "DELETE FROM member WHERE id='test1'";
			/* delete, insert, update와 같은 DML문을 실행할 때는 executeUpdate()를 호출한다.
			이 3개의 쿼리문은 행의 변화가 생기게되므로 실행한 후 적용된 행의 갯수를 int로 반환하게 된다. */
			result = stmt.executeUpdate(query);
			System.out.println("[stmt]" + result + "행 삭제됨");
			
			////////////////////////////////////////////////////
			
			// 인파라미터가 있는 동적 쿼리문 작성
			query = "DELETE FROM member WHERE id=?";
			// 쿼리문을 인자로 prepared 인스턴스를 생성한다.
			psmt = con.prepareStatement(query);
			// 인파라미터를 입력값으로 설정한다.
			psmt.setString(1, inputValue("삭제할 아이디"));
			// 쿼리문을 실행한다.
			System.out.println("[psmt]" + psmt.executeUpdate() + "행 삭제됨");
		}
		catch (SQLException e) {
			System.out.println("쿼리 실행 중 예외 발생");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SQLdelete("study", "1234").dbExecute();
	}
}
