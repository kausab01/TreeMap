import java.util.TreeMap;

public class T6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeMap<String, String> tm=new TreeMap<String, String>();
		    
		    tm.put("C1", "Red");
	        tm.put("C2", "Green");
	        tm.put("C3", "Black");
	        tm.put("C4", "White");
		    System.out.println(tm);
		    
		    tm.clear();
		    System.out.println("new map: "+tm);
	}

}
