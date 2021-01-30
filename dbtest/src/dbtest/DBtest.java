package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class DBtest {

	public static void main(String[] args) {
		//접속정보
		String url = "jdbc:mysql://127.0.0.1:3306/local-xampp-mariadb-10";
		String id = "sbsst";
		String pw = "";
		
		//접속시도
		Class.forName("com.mysql.cj.jdb.Driver");
		Connection conn = DriverManager.getConnection(url, id, pw);
		
		
		//db처리
		ArrayList<String> strlist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("명령어를 입력해주세요. :");
			String command = sc.next();
			
			if(command.equals("add")) {
				//DB에 저장
				System.out.println("저장할 값 : ");
				String text = sc.nextLine();
				
				String sql = "INSERT INTO article SET id = 3, title = "+ text +",`body` = '내용3';";
				Statement stmt = conn.createStatement(); //
				stmt.executeUpdate(sql); //조회결과가 없는경우 - insert, update, delete
				
				

			}
			
			else if(command.equals("list")) {
				
				String sql = "SELECT * FROM article";
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);// 데이터상자
				//DB에서 출력
				stmt.executeQuery(sql); //조회결과가 있을경우 - select
				String body = rs.getString("title"); //문자꺼내오기
				System.out.println(body);
			}
		}

	}

}
