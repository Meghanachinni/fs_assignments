//swapping 3 numbers with temp variable
public class swap3_numbers_with_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("before swapping");
		System.out.println(a+"\t"+b+"\t"+c);
		
		int temp = a;
		a = b;
		b = c;
		c = temp;
		System.out.println("after swapping");
		System.out.println(a+"\t"+b+"\t"+c);
	
	}

}
