package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//����̹� �ε�, JAVA JDK ���� 7 �̻󿡼��� ���ص� ��
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT * FROM MEMBER WHERE MID LIKE '����%'";
		
		String mid;
		
		
		//���� ����
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
		
		//���� ����
		Statement st = con.createStatement();
		
		//��� ���� ���
		ResultSet rs = st.executeQuery(sql);
		
		//rs.next(); ��ȯ���� boolean
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
