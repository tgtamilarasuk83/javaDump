package com.mysql.mysqljdbc;



import java.sql.*;

public class GETVALUES {
    public static void main(String args[]) {

        String db_url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(db_url, username, password);
            

            Statement stmt = con.createStatement();

           
            String query = "SELECT * FROM student";

           
            ResultSet rs = stmt.executeQuery(query);

           
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

