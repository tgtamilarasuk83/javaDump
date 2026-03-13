package Handson7;

import java.util.Scanner;
public class RemovingLeadingAndTrailspaces {

    public static void main(String args[]) {
    	
    	System.out.println("Enter the imputs in");
    	Scanner scanf = new Scanner(System.in);

        String str = scanf.nextLine();
        
        
        char Array[] = str.toCharArray();

        // Calculate leading spaces
        int start = 0;
        for (int i = 0; i < Array.length - 1; i++) {

            if (Array[i] == '\"') {
                continue;  // skip quotes
            }

            if (Array[i] == ' ') {
                start++;   // count leading spaces
                continue;
            }

            if (Array[i] >= 'A') {   // first letter found
                break;
            }
        }

        System.out.println(start);  // 2

        // Calculate trailing spaces
        int end = 0;
        int j = Array.length - 1;

        for (; j > 0; j--) {

            if (Array[j] == '\"') {
                continue;  // skip quotes
            }

            if (Array[j] == ' ') {
                end++;   // count trailing spaces
                continue;
            }

            if (Array[j] >= 'A') {   // last letter found
                break;
            }
        }

        end = j;
        System.out.println(end);  // 10

        // Print string without leading/trailing spaces
        for (int k = 0; k < Array.length; k++) {

            if ((k > 0 && k <= start) || (k > end && k < Array.length - 1)) {
                continue;  // skip spaces
            }

            System.out.print(Array[k]);
        }
    }
}