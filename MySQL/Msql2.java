import java.sql.*;

public class Msql2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gp","root","admin");
			
			Statement st = cn.createStatement();
			
			String sql = ("select * from st;");
			
			ResultSet rs = st.executeQuery(sql);
			
			
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getFloat(3)+" "+rs.getString(4));  
			
			cn.close();
			System.out.println("Query run SuccessFully...");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
