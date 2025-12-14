import java.util.Scanner;
import java.util.TreeMap;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   TreeMap<String, String> map1 = new TreeMap<String, String>();
	        map1.put("C1", "Red");
	        map1.put("C2", "Green");
	        map1.put("C3", "Black");
	        map1.put("C4", "White");
	        
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.println("enter value 1 : ");
	        String a=sc.nextLine();
	     
	        
	        if(map1.containsValue(a)){
	        System.out.println("The treemap contains key "+a);
	        }
	        else{
	        	System.out.println("The TreeMap does not contain key "+a);
	        }
	        System.out.println("enter value 2 : ");
	        String b=sc.nextLine();
	        if(map1.containsValue(b)){
		        System.out.println("The treemap contains key "+b);
		        }
		        else{
		        	System.out.println("The TreeMap does not contain key "+b);
		        }
	}

}
