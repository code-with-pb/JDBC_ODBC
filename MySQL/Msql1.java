import java.sql.*;

public class Msql1 {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.oracle.ojdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "ojdbc:oracle://localhost:3306/stdnt", "root", "admin");
            // here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from st");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
