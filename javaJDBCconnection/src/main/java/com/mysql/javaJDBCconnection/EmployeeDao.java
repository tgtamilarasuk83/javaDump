package com.mysql.javaJDBCconnection;

import java.sql.*;

public class EmployeeDao {

    // INSERT
    public void insertEmployee(Employee emp) {

        try (Connection con = DBConnection.getConnection()) {

            CallableStatement cs = con.prepareCall("{call insert_employee(?, ?, ?)}");

            cs.setInt(1, emp.getId());
            cs.setString(2, emp.getName());
            cs.setString(3, emp.getDept());

            cs.execute();

            System.out.println("Employee inserted successfully!");

            displayEmployee(); // show updated list

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DISPLAY ✅ FIXED PROCEDURE NAME
    public void displayEmployee() {

        try (Connection con = DBConnection.getConnection()) {

            CallableStatement cs = con.prepareCall("{call get_all_employees()}");

            ResultSet rs = cs.executeQuery();

            System.out.println("\n--- Employee List ---");

            while (rs.next()) {
                int id = rs.getInt("eid");
                String name = rs.getString("name");
                String dept = rs.getString("dept");

                System.out.println(id + " | " + name + " | " + dept);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void updateEmployee() {

        try (Connection con = DBConnection.getConnection()) {

            CallableStatement cs = con.prepareCall("{call update_value()}");

            cs.executeUpdate();

            System.out.println("Employee updated!");

            displayEmployee();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteEmployee() {

        try (Connection con = DBConnection.getConnection()) {

            CallableStatement cs = con.prepareCall("{call delete_value()}");

            cs.execute();

            System.out.println("Employee deleted!");

            displayEmployee();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
