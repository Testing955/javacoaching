package OOPS.com;

public class Mainemployee {

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		emp1.eid = 102;
		emp1.ename = "Prince Gaurav";
		emp1.job = "Engineer";
		emp1.esal = 200000;
		emp1.display();
		
		Employee emp2 = new Employee();
		emp2.empid = 105;
		emp2.empname = "Aashna Kumari";
		emp2.empjob = "Business Analyst";
		emp2.esalary = 200000;
		emp2.estate = "Noida";
		emp2.employeetable();
				
		
		
		Employee emp3 = new Employee();
		emp3.eid = 106;
		emp3.job = "Automation tester";
		emp3.ename = "Gaurav ojha";
//		emp3.estate = "Delhi";
		emp3.esal = 500000;
		emp3.display();
		
		Employee emp4 = new Employee();
		emp4.empid = 521;
		emp4.empname = "Golu rani";
		emp4.empjob = "Senior Business Analyst";
		emp4.estate = "Delhi";
		emp4.esalary = 89000;
		emp4.employeetable();
		


	}

}




