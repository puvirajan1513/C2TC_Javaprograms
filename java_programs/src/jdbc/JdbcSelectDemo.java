package jdbc;
import java.sql.*;

public class JdbcSelectDemo {
	
	public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/employeedb"; // DB name
        String user = "postgressql";    // your username
        String password = "Bhumi.puvi1513"; // your password

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load Driver
            Class.forName("org.postgresql.Driver");

            // Connect to Database
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database!");

            // Create Statement
            stmt = conn.createStatement();

            // Execute Query
            String query = "SELECT id, name, city FROM employee";
            rs = stmt.executeQuery(query);

            // Process ResultSet
            System.out.println("Employee Details:");
            while (rs.next()) {
                int id = rs.getInt("id");         // get int column
                String name = rs.getString("name"); // get string column
                String city = rs.getString("city"); // get string column

                System.out.println("ID: " + id + " | Name: " + name + " | City: " + city);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
