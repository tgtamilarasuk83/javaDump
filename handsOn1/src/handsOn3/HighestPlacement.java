package handsOn3;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Highest Placement Department
Description : This program determines which department has the highest number
              of student placements among CS, EC, and ME.
*/

public class HighestPlacement {

    static void findHighestPlacement(int cs, int ec, int me) {

        if (cs < 0 || ec < 0 || me < 0) {
            System.out.println("Input is Invalid");
            return;
        }

        if (cs == ec && ec == me) {
            System.out.println("None of the departments has the highest placement.");
            return;
        }

        int maxPlacement = Math.max(cs, Math.max(ec, me));

        System.out.print("Highest Placement Department: ");

        if (cs == maxPlacement)
            System.out.print("CS ");

        if (ec == maxPlacement)
            System.out.print("EC ");

        if (me == maxPlacement)
            System.out.print("ME ");
    }

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        System.out.print("Enter the number of students placed in CS: ");
        int cs = scanf.nextInt();

        System.out.print("Enter the number of students placed in EC: ");
        int ec = scanf.nextInt();

        System.out.print("Enter the number of students placed in ME: ");
        int me = scanf.nextInt();

        findHighestPlacement(cs, ec, me);
    }
}