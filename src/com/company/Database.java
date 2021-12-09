package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    Connection conn;

    public Database()
    {

        String url = "jdbc:mysql://localhost:3306/testwithjava";
        String dbUsername = "test";
        String dbPassword = "testing123";
        try {
            conn = DriverManager.getConnection(url, dbUsername, dbPassword);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void addUser(String username, String password, String firstName, String lastName)
    {

        String fullName = firstName + " " + lastName;
        try {
            Statement stmt = conn.createStatement();

            stmt.executeUpdate("INSERT INTO users (username, password, fullname)" +
                    "VALUES ('"+ username + "', '"+ password +"', '"+ fullName +"')");


        } catch (SQLException e) {
            e.printStackTrace();
        }



    }

    public void printDatabase()
    {
        try {

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("select * from users");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+ " " +rs.getString(2)+ " " +rs.getString(3)+ " " +rs.getString(4));

            }
        } catch (SQLException e)
        {
            System.out.println(e);
        }
    }

    public void closeDatabase()
    {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
