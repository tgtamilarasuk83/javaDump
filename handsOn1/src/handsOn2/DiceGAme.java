package handsOn2;

/*
 * Author : Tamilarasu K
 * Program: Dice Game Winner
 * Description: This program compares the dice scores of Arun and Naveen and displays the winner.
 */

import java.util.*;

public class DiceGAme {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);

		int[] arunScores = new int[10];
		int[] naveenScores = new int[10];

		for (int i = 0; i < 10; i++) {
			arunScores[i] = scanf.nextInt();
			naveenScores[i] = scanf.nextInt();
		}

		int arunTotal = 0, naveenTotal = 0;

		for (int i = 0; i < 10; i++) {
			arunTotal += arunScores[i];
			naveenTotal += naveenScores[i];
		}

		if (arunTotal > naveenTotal) {
			System.out.println("Arun wins");
		} 
		else {
			System.out.println("Naveen wins");
		}
	}
}