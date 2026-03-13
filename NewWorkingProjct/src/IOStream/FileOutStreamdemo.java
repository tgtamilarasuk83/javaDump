package IOStream;

package Fileiostreams;

import java.io.FileOutputStream;
import java.io.IOException;

/*
Author: Tamilarasu
Program Title: FileOutputStream Demo
Description: Write text data into a file using FileOutputStream.
*/

public class FileOutStreamdemo {

    public static void main(String args[]) {

        String data = "Hello world to all";

        try {
            FileOutputStream output = new FileOutputStream("ExpleoTrainingPrograms\\text_folder\\sample.txt");

            byte[] array = data.getBytes();

            output.write(array);

            output.close();

            System.out.println("Data written successfully to file.");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e);
        }
    }
}