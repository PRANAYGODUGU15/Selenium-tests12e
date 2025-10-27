package NEWPACK;

import java.util.*;

public class collectionssetprctc {

	public static void main(String[] args) {
		Set<String> data = new HashSet<>();
		
		data.add("pranay");
		data.add("lokesh");
		data.add("null");
		data.add("null");
		data.add("lokesh");
		
		System.out.println(data);
		
Set <String>data1 = new LinkedHashSet<>();
		
		data1.add("pranay");
		data1.add("lokesh");
		data1.add("null");
		data1.add("lokesh");
		
		//insertion order//
		System.out.println(data1);
		
		
		//validation for single o/p//
		for(String data2:data1){
			
			if(data2.equalsIgnoreCase("lokesh")) {
				
				System.out.println(data2);
			}
			
		}
		
		

	}

}
