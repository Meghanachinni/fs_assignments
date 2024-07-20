//swapping 4 numbers without using temp variable
public class swap4_numbers_without_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		System.out.println("Before swap");
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
		
		a = a+b+c+d;
		b = a-b-c-d;
		c = a-b-c-d;
		d = a-b-c-d;
		a = a-b-c-d;
		System.out.println("After swap");
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
		

	}

}
