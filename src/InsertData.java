import java.sql.*;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chary", "root", "5025");
             Statement s = con.createStatement()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserting Data into student table:");
            System.out.println("");
            System.out.print("Enter student id: ");
            int sid = sc.nextInt();
            System.out.print("Enter student name: ");
            sc.nextLine(); // consume newline character
            String sname = sc.nextLine();
            System.out.print("Enter student address: ");
            String saddr = sc.nextLine();
            String insertQuery = "INSERT INTO student VALUES(" + sid + ",'" + sname + "','" + saddr + "')";
            s.executeUpdate(insertQuery);

            System.out.println("Data inserted successfully into student table");

        } catch (SQLException err) {
            System.out.println("ERROR: " + err);
        }
    }
}