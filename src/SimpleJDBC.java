import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleJDBC {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/chary";
        String user = "root";
        String password = "5025";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            System.out.println("Connected to the database successfully.");

           
            String createTableSQL = "CREATE TABLE students (" +
                                    "roll_no VARCHAR(10) PRIMARY KEY, " +
                                    "name VARCHAR(50), " +
                                    "location VARCHAR(50))";
            statement.execute(createTableSQL);
            System.out.println("Table 'students' created successfully.");
            String insertRow1 = "INSERT INTO students (roll_no, name, location) " +
                                "VALUES ('05L8', 'S Pranav', 'NagarKurnool')";
            String insertRow2 = "INSERT INTO students (roll_no, name, location) " +
                                "VALUES ('05L1', 'R Balaji', 'Hyderabad')";
            statement.executeUpdate(insertRow1);
            statement.executeUpdate(insertRow2);
            System.out.println("Rows inserted successfully.");

        } catch (SQLException e) {
            System.out.println("An error occurred:");
            e.printStackTrace();
        }
    }
}
