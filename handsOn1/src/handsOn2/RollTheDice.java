package handsOn2;

import java.util.*;

/*
Author : Tamilarasu K
Program Title : Roll The Dice Simulation
Description : This program simulates rolling a dice 100 times and counts the frequency of each dice face (1–6).
*/

public class RollTheDice {

    public static void main(String[] args) {

        int[] diceResults = new int[100];
        int[] frequency = new int[6];

        Random random = new Random();

        for (int index = 0; index < 100; index++) {
        	
            diceResults[index] = random.nextInt(6) + 1;
           
            frequency[diceResults[index] - 1]++; 
           
        }

        System.out.println("Dice Face Frequency:");

        for (int face = 0; face < 6; face++) {
            System.out.println((face + 1) + " : " + frequency[face]);
        }
    }
}