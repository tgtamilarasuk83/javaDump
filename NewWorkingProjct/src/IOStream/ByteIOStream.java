/*
Author: Tamilarasu
Program Title: ByteIOStream
Description: Reads characters from one file and writes them to another file while counting total characters.
*/

package IOStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class ByteIOStream {

    public static void main(String[] args) {

        char[] buffer = new char[128];

        try (FileReader fr = new FileReader(args[0]);
             FileWriter fw = new FileWriter(args[1])) {

            int count = 0;
            int read = 0;

            while ((read = fr.read(buffer)) != -1) {
                fw.write(buffer, 0, read);
                count += read;
            }

            System.out.println("Total Count: " + count + " characters.");

        } catch (FileNotFoundException f) {
            System.out.println("File " + args[0] + " not found.");
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}