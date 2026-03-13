package IOStream;

/*
Author: Tamilarasu
Program Title: File Input and Output Creation
Description: Reads data from input.txt and writes it to output.txt using FileInputStream and FileOutputStream.
*/

package Fileiostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Inputandoutfileceation {

    public static void main(String args[]) {

        byte b[] = new byte[128];

        try (FileInputStream ins = new FileInputStream("D:\\Expleo Main directory\\ExpleoTrainingPrograms\\text_folder\\input.txt");
             FileOutputStream out = new FileOutputStream("D:\\Expleo Main directory\\ExpleoTrainingPrograms\\text_folder\\output.txt")) {

            int count;

            while ((count = ins.read(b)) != -1) {
                out.write(b, 0, count);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
