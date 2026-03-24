package com.mysql.mysqljdbc;

import java.sql.*;

public class jdbc_demo {
    public static void main(String args[]) {

        String db_url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";   // change if needed
        String password = "root";   // change if needed
//
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(db_url, username, password);
            System.out.println("Connected to database");

            Statement stmt = con.createStatement();
            
            String query =  "select * from the student";
            

//            String query = "CREATE TABLE student (" +
//                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
//                    "name VARCHAR(50), " +
//                    "age INT)";

            //stmt.executeUpdate(query);
//            
//            String query1 = "INSERT INTO student (name, age) VALUES ('Tamil', 21)";
//            int rows = stmt.executeUpdate(query1);
//            System.out.println(rows + " row inserted!");
//            
            //System.out.println("Table created successfully");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
