package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Armstrong Number Check
 * Description: This program checks whether a given number is an Armstrong number.
 */



import java.util.*;

public class Armstrong {

	public static void main(String[] args) {

		Scanner scanf = new Scanner(System.in);
		int n = scanf.nextInt();
		int t = n, sum = 0, l = String.valueOf(n).length();

		while (t != 0) {
			int d = t % 10;
			sum += Math.pow(d, l);
			t /= 10;
		}

		if (sum == n) {
			System.out.println("This is Armstrong");
		} else {
			System.out.println("This is not Armstrong");
		}
	}
}