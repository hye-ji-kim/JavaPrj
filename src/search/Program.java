package search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String id;
		String name;
		int age=0;

		Scanner scan = new Scanner(System.in);
		//드라이버 로드, JAVA JDK 버전 7 이상에서는 안해도 됨
		//Class.forName("oracle.jdbc.driver.OracleDriver");

		System.out.println("┌────────────┐");
		System.out.println("│      회원 검색 프로그램     │");
		System.out.println("└────────────┘");

		System.out.print("이름 검색어 입력: ");
		name = scan.nextLine();

		//연결
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT MID, NAME, AGE FROM MEMBER WHERE NAME LIKE '%"+name+"%'";

		//연결 생성
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");

		//문장 실행
		Statement st = con.createStatement();

		//결과 집합 사용
		ResultSet rs = st.executeQuery(sql);

		//rs.next(); 반환값은 boolean
		//1
		System.out.println("┌────────────┐");
		System.out.println("│          회원 검색 결과       │");
		System.out.println("└────────────┘");

		while(rs.next()){
			id = rs.getString("MID");
			System.out.printf("\t%s",id);
			name = rs.getString("NAME");
			System.out.printf("\t%s",name);
			age= rs.getInt("AGE");
			System.out.printf("\t%s", age);
			System.out.println("");
		}

	}
}