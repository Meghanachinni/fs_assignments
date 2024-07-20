// swapping 4 numbers using temp variable
public class swap4_numbers_with_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		System.out.println("Before swap");
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
		
		int temp = a;
		a=b;
		b=c;
		c=d;
		d=temp;
		System.out.println("After swap");
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);

	}

}
