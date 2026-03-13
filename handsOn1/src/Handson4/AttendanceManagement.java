package Handson4;

/*
 * Author  : Tamilarasu K
 * Program : Employee Attendance
 * Description : Marks employee check-in and check-out times
 */

import java.time.LocalTime;
import java.util.*;

public class AttendanceManagement {

    private int empId;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private boolean isIn = false;
    private boolean isOut = false;

    public AttendanceManagement(int empId) {
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

    public void checkOut() {
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
        System.out.println("\nEmployee Details");
        System.out.println("ID           : " + empId);
        System.out.println("Check-in     : " + checkInTime);
        System.out.println("Check-out    : " + checkOutTime);
    }

    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int id = scanf.nextInt();

        AttendanceManagement emp = new AttendanceManagement(id);

        emp.markCheckIn();
        
        emp.checkOut();

        emp.getDetails();
    }
}