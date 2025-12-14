import java.util.TreeMap;

public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   TreeMap<String, String> map1 = new TreeMap<String, String>();
	        map1.put("C1", "Red");
	        map1.put("C2", "Green");
	        map1.put("C3", "Black");
	        map1.put("C4", "White");
	        
	        
	        String a="C1";
	        String b="C5";
	        
	        if(map1.containsKey(a)){
	        System.out.println("The treemap contains key "+a);
	        }
	        else{
	        	System.out.println("The TreeMap does not contain key"+a);
	        }
	        
	        if(map1.containsKey(b)){
		        System.out.println("The treemap contains key "+b);
		        }
		        else{
		        	System.out.println("The TreeMap does not contain key"+b);
		        }
	        
	}

}
