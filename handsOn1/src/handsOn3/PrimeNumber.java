package handsOn3;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Prime Numbers from 1 to 100
Description : This program prints all prime numbers between 1 and 100 using a method to check prime numbers.
*/

public class PrimeNumber {

    static boolean isPrime(int number) {

        if (number <= 1)
            return false;

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("Prime numbers between 1 and 100:");

        for (int number = 2; number <= 100; number++) {

            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }
}
