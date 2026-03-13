package Handson7;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Symboliclinkpath {

    public static void main(String[] args) {

        File movie = new File("D:\\gta\\withlove.mkv");

        System.out.println(movie.getAbsolutePath());
        System.out.println("File exists: " + movie.exists());

        if (movie.exists()) {
            try {
                Desktop.getDesktop().open(movie);
                System.out.println("Movie opened successfully");
            } catch (IOException e) {
                System.out.println(e);
            }
        } else {
            System.out.println("Movie file not found");
        }
    }
}