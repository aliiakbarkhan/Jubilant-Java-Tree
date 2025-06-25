import java.sql.*;

public class SimpleDB {
    public static void main(String[] args) {
        try {
            // Connect to MySQL
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", "aslam2617");

            // Insert data
            String sql = "INSERT INTO students (id, name, phone, lang) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, 1);
            stmt.setString(2, "Ali");
            stmt.setLong(3, 9876543210L);
            stmt.setString(4, "Java");

            stmt.executeUpdate();
            System.out.println("Student added successfully!");

            conn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
