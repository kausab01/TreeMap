import java.util.Map;
import java.util.TreeMap;

public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeMap<String, String> tm=new TreeMap<String, String>();
		    
		    tm.put("C1", "Red");
	        tm.put("C2", "Green");
	        tm.put("C3", "Black");
	        tm.put("C4", "White");
		    System.out.println(tm);
		    
		    for(Map.Entry me : tm.entrySet()){
		    	System.out.println( "get key : "+me.getKey());
		    }
	}

}
