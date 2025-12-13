import java.util.TreeMap;

public class T2 {


		    public static void main(String[] args) {
		        // Creating first TreeMap
		        TreeMap<String, String> map1 = new TreeMap<String, String>();
		        map1.put("C1", "Red");
		        map1.put("C2", "Green");
		        map1.put("C3", "Black");
		        map1.put("C4", "White");
		        map1.put("C5", "Blue");

		        TreeMap<String, String> map2 = new TreeMap<String, String>();
		        map2.put("A1", "Orange");
		        map2.put("A2", "Pink");

		        System.out.println("Tree Map 1: " + map1);
		        System.out.println("Tree Map 2: " + map2);

		        map1.putAll(map2);
                System.out.println("After coping map2 to map1: " + map1);
		    }
		

	}


