package JAVAPRACTICE;

public class VariablesDemo {

	public static void main(String[] args) {
		
		int a; // declaration
		a = 100; //assignment
		int b = 100; //declaration+assignment
		
		System.out.println(b); // if we put in "" its not variable now it is a string it will print as it is 
		
		b = 200; // if we want to change the value , we can change the values of the varaibles
		
		System.out.println(b);
		
		//Approach1 if all the variables are belongs to differnet datatype
		int c = 100;
		int d = 200;
		int e = 300;
		
		// Approach 2
		
		int f, g, h;  //Here we written in one single line if these varaibles are belongs to same datatype then this syntax is applicable
		
		
		f = 100;
		g =200;
		h=300;
		
		//Approach 3 if all the variables belongs to same datatypes
		int i=5,j=8,k=5;
		System.out.println("the value of a is :"+a); //concatenate
	    
		 System.out.println(i+" "+j+" "+c); // print in single line with space between each variable concatenate with space
		 
		 
		


	}

}
