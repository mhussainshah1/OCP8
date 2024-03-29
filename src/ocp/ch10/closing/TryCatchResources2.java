package ocp.ch10.closing;

import java.sql.*;

public class TryCatchResources2 {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo";
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select count(*) from animal")) {

            if (rs.next()) {
                System.out.println(rs.getInt(1));
            }

            ResultSet rs2 = stmt.executeQuery("select count(*) from animal");
            int num = stmt.executeUpdate("update animal set name = 'clear' where name = 'other'");
        }
    }
}