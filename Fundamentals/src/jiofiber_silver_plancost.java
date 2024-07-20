
public class jiofiber_silver_plancost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost = 699;
		float gst = 18;
		float taxes = (gst*cost)/100;
		System.out.println("Total taxes are " + taxes);
		
		float Total_plan_cost = cost + taxes;
		System.out.println("Total cost for jiofiber silver plan is " + Total_plan_cost);

	}

}
