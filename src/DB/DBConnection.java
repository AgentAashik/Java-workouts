package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:mysql://localhost:3306/credo_systemz";
        String dbUsername = "root";
        String dbPassword = "root";
        String sql = "SELECT * FROM students";

        try {
            Connection con = DriverManager.getConnection(connectionUrl, dbUsername, dbPassword);
            System.out.println("Database connected successfully");
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);

            while (rs.next()) {
                System.out.println("Student ID: " + rs.getInt("id"));
                System.out.println("First Name: " + rs.getString("FIRSTNAME"));
                System.out.println("Last Name: " + rs.getString("LASTNAME"));
                System.out.println("Date of Birth: " + rs.getString("DOB"));
                System.out.println("Age: " + rs.getString("AGE"));
                System.out.println("---------------------------");

            }


        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
