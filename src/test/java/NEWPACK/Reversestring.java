
package NEWPACK;


public class Reversestring {

	String new1 = "pranay godugu";
    static int FirstNumber = 10;
    static int SecondNumber = 20;
	double d = 10.00;
	char c = 'c';
	boolean b = true;
	public static void main(String[] args) {
		
		int resultadd = FirstNumber+SecondNumber;
		int resultsub = SecondNumber-FirstNumber;
		
		System.out.println(resultadd);
		System.out.println(resultsub);
		
		
		
		
		Reversestring R = new Reversestring();
	StringBuffer b=new StringBuffer(R.new1);
          String r=	b.reverse().toString();
          System.out.println(r);
                   
	}

}
