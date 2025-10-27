

package Seleniuumwebdriver.Seleniuumwebdriver1;
import NEWPACK.Employeeanotherpackage;
public class EmployeeMain {

public static void main(String[] args) { //creating object inside the main method and accessing and assign the values //
		
		Employee Emp1 = new Employee();
		Emp1.eid = 101;
		Emp1.ename = "Mahesh";
		Emp1.sal = 20000;
		
		Emp1.display();
		
		Employeeanotherpackage S1 = new  Employeeanotherpackage();
		S1.sid = 102;
		S1.sname = "deepak";
		S1.sal = 25000;
		
		S1.printdata()
;

		
		
		
	}

}
