package p1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SignupDao {

	private static String URL = "jdbc:mysql://localhost:3306/thothit_db";
	private static String USERNAME = "root";
	private static String PASSWORD = "root";
	private static String DRIVER= "com.mysql.jdbc.Driver";

	private static Connection getConnection() throws Exception {
		// Step-1
		// Loading the driver
		Class.forName(DRIVER);
		// Step-2
		// Making connect to the database
		Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		if (conn != null) {
			System.out.println("Ahahah! connected is established!");
		}
		return conn;
	}
	public static void deleteData(String username) {
		// delete data from database
		try {
			// loading all the data from database
			// Loading the driver
			Class.forName("com.mysql.jdbc.Driver");
			//Making connection to the database
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thothit_db", "root", "root");
			String deleteQuery = "delete  from signups_tbl where username = ? ";
			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
			pstmt.setString(1, username);
			pstmt.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	static public void loadData() {
		// write JDBC Wala code to push data inside underlying database
		try {
			Connection conn = getConnection();
			// loading all the data from database
			String fetchData = "select username,password, email, mobile from signups_tbl";
			PreparedStatement pstmt = conn.prepareStatement(fetchData);
			ResultSet rs = pstmt.executeQuery();
			List<SignupDTO> lists = new ArrayList<SignupDTO>();
			while (rs.next()) {
				SignupDTO dto = new SignupDTO();
				dto.setUsername(rs.getString(1));
				dto.setPassword(rs.getString(2));
				dto.setEmail(rs.getString(3));
				dto.setMobile(String.valueOf(rs.getInt(4)));
				lists.add(dto);
			}
			SignupDataStore.lista = lists;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void saveData(String username, String password, String email, String mobile) {
		// write JDBC Wala code to push data inside underlying database
		try {
			// Loading the driver
			Class.forName("com.mysql.jdbc.Driver");
			//Making connection to the database
			Connection conn = DriverManager.
					getConnection("jdbc:mysql://localhost:3306/thothit_db", "root", "root");
			// Step-3 writing my query
			String sql = "insert into signups_tbl values(?,?,?,?)";
			// Step-4
			// wrap the query inside PreparedStatement object
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			pstmt.setString(3, email);
			pstmt.setInt(4, Integer.parseInt(mobile));
			// Step-5
			// Fire the query
			pstmt.execute();
			System.out.println("Ahahah query is fired!!");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	static public List<SignupDTO> searchData(String ptext) {
		// write JDBC Wala code to push data inside underlying database
		List<SignupDTO> lists = new ArrayList<SignupDTO>();
		try {
			Connection conn = getConnection();
			// loading all the data from database
			String fetchData = "select username,password, email, mobile from signups_tbl where username = ? or password = ? or email = ? or  mobile =?";
			PreparedStatement pstmt = conn.prepareStatement(fetchData);
			pstmt.setString(1, ptext);
			pstmt.setString(2, ptext);
			pstmt.setString(3, ptext);
			pstmt.setString(4, ptext);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				SignupDTO dto = new SignupDTO();
				dto.setUsername(rs.getString(1));
				dto.setPassword(rs.getString(2));
				dto.setEmail(rs.getString(3));
				dto.setMobile(String.valueOf(rs.getInt(4)));
				lists.add(dto);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return lists;
	}

}
