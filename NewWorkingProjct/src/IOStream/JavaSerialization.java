package IOStream;

package Fileiostreams;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Employee implements Serializable {

    String name;
    String id;

    Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

public class JavaSerialization {

    public static void main(String args[]) {

        Employee emp = new Employee("Arun", "E101");

        // Serialization
        try {

            FileOutputStream file =
                    new FileOutputStream("D:\\Expleo Main directory\\ExpleoTrainingPrograms\\text_folder\\employee.ser");

            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(emp);

            out.close();
            file.close();

            System.out.println("Employee object serialized successfully.");

        } catch (Exception e) {
            System.out.println(e);
        }

        // Deserialization
        Employee emp2 = null;

        try {

            FileInputStream file =
                    new FileInputStream("D:\\Expleo Main directory\\ExpleoTrainingPrograms\\text_folder\\employee.ser");

            ObjectInputStream in = new ObjectInputStream(file);

            emp2 = (Employee) in.readObject();

            in.close();
            file.close();

            System.out.println("Employee object deserialized successfully.");
            System.out.println("Name: " + emp2.name);
            System.out.println("ID: " + emp2.id);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}