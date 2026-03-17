package collections;

import java.util.*;

class mobile implements Comparable<mobile> {

    private String name;
    private int price;
    private int ram;

    mobile(String name, int price, int ram) {
        this.name = name;
        this.price = price;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    
    public int compareTo(mobile o) {
		if(this.ram > o.getRam()) {
			return 1;
		}
		
		else {
			return -1;
		}
		
	}
}

public class ComparableExample {

    public static void main(String args[]) {

        List<mobile> mobileList = new ArrayList<>();

        mobileList.add(new mobile("apple", 12344, 34));
        mobileList.add(new mobile("apple", 12344, 39));
        mobileList.add(new mobile("apple", 12344, 36));
        mobileList.add(new mobile("apple", 12344, 35));

        Collections.sort(mobileList);

        for (mobile m : mobileList) {
            System.out.println(m.getName() + " " + m.getPrice() + " " + m.getRam());
        }
    }
}
