package NEWPACK;
/*write a program balance is greater than 100
they are eligible for withdraw money
Balance is < 100 here, we have to throw a insufficient balance
1.Here we have to creare a class in atm class we have to declare one method that method name is withdraw money
after that this method accepting one parameter that parameter name is balance is double data type
here we have to write a code*/
public class ATM extends Exception{
	
	



	public void withdrawmoney (double balance) throws ATM
	{
		
		if(balance>=100) {
			System.out.println("withdrawn successfuly");
		}
		else if(balance<100){
			throw new ATM();
		}
	}
	
	
	public static void main(String[] args) throws ATM{
		
	ATM E1= new ATM();
	
	try {E1.withdrawmoney(99);
	
	}
	
	catch(ATM ref) {
		System.out.println("Exception Handled");
	}
	
	
		
	
	}

}

