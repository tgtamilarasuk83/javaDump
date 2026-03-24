package com.mysql.mysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class updateva {
    public static void main(String args[]) {

        String db_url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(db_url, username, password);

            Statement stmt = con.createStatement();

           
            String query = "UPDATE student SET name = 'kUMARU' WHERE id = 1";
            String query2 = "SELECT * FROM student";
            String query3 = "DELETE from student where id =1";
            
            stmt.executeUpdate(query3);
            
            
            int rows = stmt.executeUpdate(query);
            
            ResultSet rs = stmt.executeQuery(query2);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + "   "+name +"   "+age);
            }
           
           

           
            

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
