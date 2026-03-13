package IOStream;

package Fileiostreams;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriters {

    public static void main(String args[]) {

        char b[] = new char[128];

        try (FileReader ins = new FileReader(args[0]);
             FileWriter out1 = new FileWriter(args[1])) {

            int count = 0;
            int read = 0;

            while ((read = ins.read(b)) != -1) {

                out1.write(b, 0, read);

                count += read;
            }

            System.out.println("Characters copied: " + count);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}