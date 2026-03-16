package collections;

import java.util.TreeMap;

public class TreeMAPdemo {
	public static void main(String args[]) {
		
		TreeMap<Integer, String> hash = new TreeMap<Integer, String>();
		
		hash.put(1999999911,"A");
		hash.put(1245,"B");
		hash.put(134523,"C");
		hash.put(15434531,"D");
		hash.put(1623123123,"E");
		hash.put(172345,"F");
		hash.put(18435345,"H");
		
		System.out.println(hash);
	}
}