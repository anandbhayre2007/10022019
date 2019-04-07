package collections;

import java.util.HashMap;
import java.util.Hashtable;

public class MapInterface {

	public static void main(String[] args) 
	{
		/*HashMap<String, String> map= new HashMap<String, String>();
		
		map.put("name", "Pradnya");
		map.put("surname", "anc");
		map.put("org", "xyz");
		map.put(null, "xyz");
		System.out.println(map.get(null));*/
		
		
		Hashtable<String, String> map2= new Hashtable<String, String>();
		
		map2.put("name", "Pradnya");
		map2.put("surname", "anc");
		map2.put("org", "xyz");	
		map2.put(null, "xyz");	
		System.out.println(map2.get(null));
		
		
		
	}

}
