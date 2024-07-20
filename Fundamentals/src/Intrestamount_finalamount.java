
public class Intrestamount_finalamount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double principalamount = 500000;
		double timeperiod = 5;
		double rateofintrest = 6.5;
		
		double intrestamount = (principalamount * timeperiod * rateofintrest)/100;
		System.out.println(intrestamount);
		
		double finalamount = principalamount + intrestamount;
		System.out.println(finalamount);
		

	}

}
