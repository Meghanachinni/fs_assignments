//swapping 3 numbers without using temp variable
public class swap3_numbers_without_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("Before swap");
		System.out.println(a+"\t"+b+"\t"+c);
		
		a = a+b+c;
		b = a-(b+c);
		c = a-(b+c);
		a = a -(b+c);
		System.out.println("After swap");
		System.out.println(a+"\t"+b+"\t"+c);

	}

}
