package IOStream;

package Fileiostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StreamChaining {

    public static void main(String args[]) {

        try (
            BufferedReader buffin = new BufferedReader(new FileReader(args[0]));
            BufferedWriter buffout = new BufferedWriter(new FileWriter(args[1]))
        ) {

            String line;

            while ((line = buffin.readLine()) != null) {

                buffout.write(line);
                buffout.newLine();

            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}