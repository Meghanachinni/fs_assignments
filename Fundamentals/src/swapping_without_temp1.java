// swapping 2 numbers without using temp variable
public class swapping_without_temp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		System.out.println("before swapping");
		System.out.println(a+"\t"+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("after swapping");
		System.out.println(a+"\t"+b);
		
	}

}
