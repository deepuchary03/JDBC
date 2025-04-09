
import java.sql.*;

public class DisplayData {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chary", "root", "5025");
             Statement s = con.createStatement()) {

            ResultSet rs = s.executeQuery("SELECT * FROM students");
            if (rs != null) {
                System.out.println("roll_no \t name \t location");
                System.out.println("________________________________________");

                while (rs.next()) {
                    System.out.println(rs.getString("roll_no") + " \t " + rs.getString("name") + " \t " + rs.getString("location"));
                    System.out.println("________________________________________");
                }
            }

        } catch (SQLException err) {
            System.out.println("ERROR: " + err);
        }
    }
}
