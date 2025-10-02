package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBUpdate {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:mysql://localhost:3306/credo_systemz";
        String dbUsername = "root";
        String dbPassword = "root";
        String updateQuery = "UPDATE STUDENTS SET FIRSTNAME = 'Aashiq', AGE = 24 WHERE LASTNAME = 'Ibrahim'";

        try {
            Connection con = DriverManager.getConnection(connectionUrl, dbUsername, dbPassword);
            System.out.println("Database connected successfully");

            Statement st = con.createStatement();
            int rowsAffected = st.executeUpdate(updateQuery);
            System.out.println("Rows updated: " + rowsAffected);

            st.close();
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
