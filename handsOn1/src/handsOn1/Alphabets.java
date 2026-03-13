package handsOn1;

/*
 * Author : Tamilarasu K
 * Program: Alphabets
 * Description:
 * This program stores alphabets from 'a' to 'z' in an array
 * and prints them in pairs like first and last (a-z, b-y, c-x).
 */

public class Alphabets {

	public static void main(String[] args) {
		char[] a = new char[26];

		for (int i = 0; i < 26; i++) {
			a[i] = (char) ('a' + i);
		}

		int n = a.length;

		for (int i = 0; i < 26; i++) {
			System.out.print(a[i] + "" + a[n - i - 1] + " ");
		}
	}
}