package collections;
import java.util.LinkedList;
public class linkedlist {
	public static void main(String args[]) {
		
		LinkedList<String> Str = new LinkedList<>();
		
		
		Str.add("hello");
		Str.add("TAmil");
		Str.add("Vimal");
		Str.remove(0);
		Str.addLast("Sugan");
		Str.addFirst("pavan");
		Str.contains("hai");
		
		
		Object[] array = Str.toArray();
		
		
		for( Object A : array) {
			System.out.println(A	);
		}
		
		System.out.println(Str);
		Str.clear();
		
		System.out.println(Str);
		
		
	}

}
