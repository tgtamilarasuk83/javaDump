package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Monthly Calendar Display
 * Description: This program displays the calendar of a given month based on the starting day and number of days.
 */



import java.util.*;

public class Calender {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
		String[] dayNames = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		int[] daysInMonth = {31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31};

		int monthIndex = scanf.nextInt() - 1;

		System.out.println(monthNames[monthIndex]);

		int startingDay = scanf.nextInt();

		System.out.println("Mon Tue Wed Thu Fri Sat Sun");

		for (int dayNumber = 1; dayNumber <= daysInMonth[monthIndex]; dayNumber++) {
			System.out.println(dayNumber);
		}
	}
}