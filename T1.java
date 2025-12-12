
import java.util.Map;
import java.util.TreeMap;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
    
    tm.put(1, "Red");
    tm.put(2, "Green");
    tm.put(3, "Black");
    tm.put(4, "White");
    tm.put(5, "Blue");
    
    System.out.println(tm);
    
    for(Map.Entry me : tm.entrySet()){
    	System.out.println(me.getKey()+" => "+me.getValue());
    }
	}

}
