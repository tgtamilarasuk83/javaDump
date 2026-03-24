package com.mysql.javaJDBCconnection;

import java.util.Scanner;

public class APP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDao dao = new EmployeeDao();

        while (true) {
            
            System.out.println("1. Insert Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Update Employee (eid = 1)");
            System.out.println("4. Delete Employee (eid = 1)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Dept: ");
                    String dept = sc.nextLine();

                    dao.insertEmployee(new Employee(id, name, dept));
                    break;

                case 2:
                    dao.displayEmployee();
                    break;

                case 3:
                    dao.updateEmployee();
                    break;

                case 4:
                    dao.deleteEmployee();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
