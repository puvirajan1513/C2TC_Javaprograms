package day10;

public class Driver {

	public static void main(String[] args) {
		int n = 10;
		int a[]; // declaration
		a = new int[n]; // instantiation

		// displaying the array
		ArrayOperation.printArray(a);

		// assigning values in array a
		for (int i = 0; i < a.length; i++)
			a[i] = 5 * i;

		ArrayOperation.printArray(a);

		int b[] = { 10, 20, 30, 40, 50 }; // initialization at the time of declaration
		ArrayOperation.printArray(b);

		// calling variable argument function
		System.out.println("sum of array elements is : " + ArrayOperation.getSum(b));
		System.out.println("sum of array elements is : " + ArrayOperation.getSum(10, 20));

		b[2] = 999; // assigning single element
		// RTE - ArrayIndexOutOfBoundsException
		// b[20]=10;
		ArrayOperation.printArray(b);

		// Display total no. of Odd and Even Numbers in array b

		System.out.println("Odd numbers : " + ArrayOperation.getOddCount(b) + "\tEven numbers : "
				+ ArrayOperation.getEvenCount(b));
		System.out.println();
		System.out.println("---------------------------------------");



	}

}
