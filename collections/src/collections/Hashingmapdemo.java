package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashingmapdemo {
	public static void main(String args[]) {
		
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(19,"A");
		hash.put(12,"B");
		hash.put(13,"C");
		hash.put(15,"D");
		hash.put(16,"E");
		hash.put(17,"F");
		hash.put(18,"H");
		
		System.out.println(hash);
		
		Set<Map.Entry<Integer, String>> set = hash.entrySet();
		
		System.out.println(set);
		
	}

}
