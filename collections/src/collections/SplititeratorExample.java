package collections;

import java.util.ArrayList;
import java.util.Spliterator;

public class SplititeratorExample {

	public static void main(String args[]) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);

		Spliterator<Integer> sp1 = arr.spliterator();
		Spliterator<Integer> sp2 = sp1.trySplit();

		
		sp1.forEachRemaining((n)->System.out.print(n+" "));

		
		sp2.forEachRemaining(System.out::println);
	}
}