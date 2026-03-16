package collections;

import java.util.*;

public class VectorsList {
public static void main(String args[]) {
		
		Vector <Integer> Str = new Vector<Integer>();
		
		
		Str.add(10);
		Str.add(10);
		Str.add(10);
		Str.add(10);
		Str.add(10);
		Str.add(10);
		Str.add(10);
		Str.add(10);
		Str.add(10);
		
		System.out.println("Size"+Str.capacity());
		Str.add(10);
		
		
		
		
		Object[] array = Str.toArray();
		
		
		for( Object A : array) {
			System.out.println(A	);
		}
		
		System.out.println(Str);
		Str.clear();
		
		System.out.println(Str);
		
		
		
		
	}

}
