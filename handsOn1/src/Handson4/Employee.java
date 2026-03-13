package Handson4;

/*
 * Author  : Tamilarasu K
 * Program : Employee Attendance System
 * Description : Marks employee check-in and check-out using Attendance class
 */



import java.time.*;

class Attendance {
    private int empId;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private boolean isIn = false;
    private boolean isOut = false;

    public Attendance(int empId) {
        this.empId = empId;
    }

    public void markCheckIn() {
        if (!isIn) {
            checkInTime = LocalTime.now();
            isIn = true;
            System.out.println("Employee checked in at: " + checkInTime);
        } else {
            System.out.println("Employee has already checked in");
        }
    }

    public void checkout() {
        if (!isIn) {
            System.out.println("Employee must check in first");
        } else if (isOut) {
            System.out.println("Employee has already checked out");
        } else {
            checkOutTime = LocalTime.now();
            isOut = true;
            System.out.println("Employee checked out at: " + checkOutTime);
        }
    }

    public void getDetails() {
        System.out.println("\nAttendance Details");
        System.out.println("Employee ID    : " + empId);
        System.out.println("Check-in Time  : " + checkInTime);
        System.out.println("Check-out Time : " + checkOutTime);
    }
}

public class Employee {
    private int empId;
    private String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public void checkIn(Attendance a) {
        a.markCheckIn();
    }

    public void checkOut(Attendance a) {
        a.checkout();
    }

    @Override
    public String toString() {
        return "Employee [ID=" + empId + ", Name=" + empName + "]";
    }

    public static void main(String[] args) {
        Employee emp = new Employee(12, "Tamil");
        Attendance att = new Attendance(12);

        System.out.println(emp);

        emp.checkIn(att);
        att.getDetails();

        emp.checkOut(att);
        att.getDetails();
    }
}