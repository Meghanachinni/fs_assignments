
public class Total_Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salary = 85000;
		double tax = 20;
		
		double taxinamount = (salary * tax)/100;
		System.out.println("total taxes is " +taxinamount);
		
		double salaryaftertaxes = salary - taxinamount;
		System.out.println("Salary after taxes is " +salaryaftertaxes);		

	}

}
