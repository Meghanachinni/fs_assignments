
public class grossamount_netamount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double himabasicsalary = 85000;
		
		//ta is 15% of salary
		double ta = (85000*15)/100;
		System.out.println("ta amount is " + ta);
		
		//da is 20% of salary
		double da = (85000*20)/100;
		System.out.println("da amount is " + da);
		
		//hra is 18% of salary
		double hra = (85000*18)/100;
		System.out.println("hra amount is " + hra);
		
		double grossamount = himabasicsalary + ta + da + hra;
		System.out.println("grossamount amount is " + grossamount);
		
		//pf is 20% of salary
		double pf = (85000*20)/100;
		System.out.println("pf amount is "+pf);
		
		//tax is 25% of salary
		double tax = (85000 * 25)/100;
		System.out.println("tax amount is "+tax);
		
		double netamount = grossamount - (pf+tax);
		System.out.println("netamount is "+netamount);

		

	}

}
