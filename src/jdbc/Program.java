package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//드라이버 로드, JAVA JDK 버전 7 이상에서는 안해도 됨
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM MEMBER WHERE MID LIKE '나정%'";
		
		String mid;
		
		
		//연결 생성
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		
		//문장 실행
		Statement st = con.createStatement();
		
		//결과 집합 사용
		ResultSet rs = st.executeQuery(sql);
		
		//rs.next(); 반환값은 boolean
		//1
		while(rs.next()){
		mid = rs.getString("MID");
		System.out.println(mid);
		}
		
		/*//2
		rs.next();
		mid = rs.getString("MID");
		
		System.out.println(mid);
		
		//3
		rs.next();
		mid = rs.getString("MID");
		
		System.out.println(mid);*/
		
		
	}

}
