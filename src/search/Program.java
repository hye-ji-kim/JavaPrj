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
		//����̹� �ε�, JAVA JDK ���� 7 �̻󿡼��� ���ص� ��
		//Class.forName("oracle.jdbc.driver.OracleDriver");

		System.out.println("����������������������������");
		System.out.println("��      ȸ�� �˻� ���α׷�     ��");
		System.out.println("����������������������������");

		System.out.print("�̸� �˻��� �Է�: ");
		name = scan.nextLine();

		//����
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String sql = "SELECT MID, NAME, AGE FROM MEMBER WHERE NAME LIKE '%"+name+"%'";

		//���� ����
		Connection con = DriverManager.getConnection(url, "c##sist", "dclass");

		//���� ����
		Statement st = con.createStatement();

		//��� ���� ���
		ResultSet rs = st.executeQuery(sql);

		//rs.next(); ��ȯ���� boolean
		//1
		System.out.println("����������������������������");
		System.out.println("��          ȸ�� �˻� ���       ��");
		System.out.println("����������������������������");

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