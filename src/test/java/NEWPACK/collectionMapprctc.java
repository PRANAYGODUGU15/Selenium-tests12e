package NEWPACK;

import java.util.*;
import java.util.Map.Entry;


public class collectionMapprctc {

	public static void main(String[] args) {
		/*Map<Integer, String> data1 = new LinkedHashMap<Integer, String>();
		data1.put(1,"HYD");
		data1.put(2,"CHN");
		data1.put(3,"PUNE");
		data1.put(4,"BNGLR");
		data1.put(5,"COCHIN");
		data1.put(1,"1hy");
	    data1.put(null,"vizag");
		
		System.out.println(data1);
		
	for(Integer keys:data1.keySet()) {
		
		System.out.println(data1.get(keys));
		
	
	}*/
	
	//doesnt allow null for hashtable//
	
	Map<Integer, String> data2 = new Hashtable();
	data2.put(1,"HYD");
	data2.put(2,"CHN");
	data2.put(3,"PUNE");
	data2.put(4,"BNGLR");
	data2.put(5,"COCHIN");
	data2.put(1,"1hy");
	//data2.put(null,"vizag");//
	data2.put(1,"HYD");
	
	
	
	System.out.println(data2);
	
for(Entry<Integer, String> keys:data2.entrySet()) {
		
		System.out.println(data2.get(keys));
		
	
	}
		
	}

}
