package ex21jdbc.crud;

import java.sql.SQLException;

public class SQLupdate extends MyConnection {
	public SQLupdate(String user, String pass) {
		super(user, pass);
	}
	
	String query;
	int result;
	
	@Override
	public void dbExecute() {
		try {
			// update 쿼리문 실행을 위해 Statement 인스턴스 생성
			stmt = con.createStatement();
			// Java에서 쿼리문 작성 시 예약어는 대문자로 기술하는 것이 가독성이 좋다.
			query = "UPDATE member SET "
					+ " pass='0412', "
					+ " name='성유겸', "
					+ " regidate=sysdate "
					+ " WHERE id='test1'";
			// update가 적용된 행의 갯수가 반환됨
			result = stmt.executeUpdate(query);
			System.out.println("[stmt]" + result + "행 업데이트 됨");
			
			////////////////////////////////////////////////////////
			
			// 인파라미터가 있는 동적 쿼리문 작성
			query = "UPDATE member SET "
					+ " name=?, "
					+ " pass=? "
					+ " WHERE id=?";
			psmt = con.prepareStatement(query);
			// 무한루프로 구성하여 exit를 입력할 때까지는 지속적으로 실행됨
			while (true) {
				// 인파라미터는 ?의 순서대로 1~3까지 지정하면 된다.
				psmt.setString(3, inputValue("수정할 아이디"));
				psmt.setString(1, inputValue("이름"));
				psmt.setString(2, inputValue("패스워드"));
				// 쿼리문 실행 및 결과 반환
				result = psmt.executeUpdate();
				System.out.println("[psmt]" + result + "행 업데이트 됨");
			}
		}
		catch (SQLException e) {
			System.out.println("쿼리 실행 중 예외 발생");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SQLupdate("study", "1234").dbExecute();
	}
}
