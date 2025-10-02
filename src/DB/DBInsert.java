package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBInsert {
        public static void main(String[] args) {
            String connectionUrl = "jdbc:mysql://localhost:3306/credo_systemz";
            String dbUsername = "root";
            String dbPassword = "root";
            String InsertQuery = "INSERT INTO STUDENTS(FIRSTNAME, LASTNAME, DOB, AGE) VALUES('Dharun', 'J', '2002-08-02', 23)";

            try {
                Connection con = DriverManager.getConnection(connectionUrl, dbUsername, dbPassword);
                System.out.println("Database connected successfully");
                Statement st = con.createStatement();
                int rs = st.executeUpdate(InsertQuery);
                if(rs >= 0) {
                    System.out.println(rs + " row(s) inserted");
                }
                st.close();
                con.close();
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }