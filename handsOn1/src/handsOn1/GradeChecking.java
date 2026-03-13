package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Grade Checking
 * Description: This program calculates and displays the grade based on exam and practical marks.
 */



import java.util.*;

public class GradeChecking {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int examMarks = scanf.nextInt();
		int practicalMarks = scanf.nextInt();

		if ((examMarks >= 30 / 2) && (practicalMarks >= 70 / 2)) {
			System.out.println("Grade " + (examMarks + practicalMarks) / 10);
		}
	}
}