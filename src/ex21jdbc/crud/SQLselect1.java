package ex21jdbc.crud;

import java.sql.SQLException;

public class SQLselect1 extends MyConnection {
	public SQLselect1(String user, String pass) {
		super(user, pass);
	}
	
	String query;
	int result;
	
	@Override
	public void dbExecute() {
		try {
			stmt = con.createStatement();
			// 정적 쿼리문 작성, to_char 함수를 통해 날짜의 서식을 지정한 컬럼은 별칭을 부여함
			String query = "SELECT id, pass, name,"
					+ " regidate, to_char(regidate, 'yyyy.mm.dd hh24:mi') d1 FROM member";
			/* 행의 변화가 발생되지 않는 select 쿼리문은 executeQuery()를 호출하여 실행한다.
			조건에 맞는 레코드가 반환되므로 ResultSet 타입의 인스턴스가 반환값으로 return 된다. */
			rs = stmt.executeQuery(query);
			
			/* 반환된 레코드의 갯수만큼 반복한다.
			조건에 따라 갯수는 달라질 수 있으므로 while문을 주로 사용한다.
			next() 메서드는 인출할 레코드가 있는지를 판단하여 true / false를 반환한다. */
			while (rs.next()) {
				// select 절의 첫 번째 컬럼이므로 id 컬럼이 지정된다.
				String id = rs.getString(1);
				// 컬럼을 지정할 때는 인덱스 혹은 컬럼명 둘 다 사용할 수 있다.
				String pw = rs.getString("pass");
				String name = rs.getString("name");
				
				/* 오라클의 date 타입을 getDate()로 인출하면 0000-00-00 형식으로 출력된다.
				또한, 자료형이 Date이므로 java.sql 패키지의 클래스를 사용해야 한다. */
				java.sql.Date regidate = rs.getDate("regidate");
				/* 날짜를 getString()으로 인출하면 시간까지 포함돼서 출력된다.
				0000-00-00 00:00:00 형식이므로 적당한 크기로 자르고싶다면
				문자열 처리 메서드를 사용하면 된다. */
				String regidate2 = rs.getString("regidate");
				String regidate3 = rs.getString("regidate").substring(0, 13);
				/* 오라클의 변환함수를 통해 출력하고자 하는 형태로 포매팅한 후 문자 형식으로 출력한다.
				쿼리문에 별칭을 사용한 경우 그대로 사용할 수 있다.
				즉, 컬럼명, 인덱스, 별칭을 통해 컬럼을 지정하여 인출할 수 있다. */
				String regidate4 = rs.getString("d1");
				
				System.out.printf("%s %s %s %s %s %s %s\n", id, pw, name, regidate,
						regidate2, regidate3, regidate4);
			}
		}
		catch (SQLException e) {
			System.out.println("쿼리 실행 중 예외 발생");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new SQLselect1("study", "1234").dbExecute();
	}
}
