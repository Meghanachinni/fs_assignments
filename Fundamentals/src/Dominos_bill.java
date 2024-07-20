
public class Dominos_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pizzacost= 399;
		double discount = 20;
		int quantity = 2;
		double  totalcost = pizzacost * quantity;
		System.out.println(totalcost);
		
		double disc = (totalcost * discount)/100;
		double Final_bill = totalcost - disc;
		System.out.println("Total Pizza cost after discount is " + Final_bill);
		
		
		
		
		
	}

}
