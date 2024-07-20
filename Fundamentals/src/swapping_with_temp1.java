// swapping 2 numbers using temp variable

public class swapping_with_temp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b = 20;
		System.out.println("actual values");
		System.out.println(a+ "\t" + b );
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping");
		System.out.println(a+ "\t" + b );

	}

}
