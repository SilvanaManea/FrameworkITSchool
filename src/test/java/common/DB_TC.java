package common;

import java.sql.*;

public class DB_TC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String dbUrl = "jdbc:mysql://localhost:3306/sample";
        String username = "root";
        String password = "Berila123*";

        String querry = "select * from agents;";


        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(dbUrl, username, password);

        Statement statement = connection.createStatement();

        statement.executeQuery(querry);

        ResultSet result = statement.executeQuery(querry);

        while(result.next()){
            String agentCode = result.getString(1);
            String agentName = result.getString(2);
            String workingArea = result.getString(3);

            System.out.println(agentCode+" "+agentName+" "+workingArea);
        }
        connection.close();
    }
}
