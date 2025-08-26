package day11;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		
		System.out.println("I am in main method");
		int numberOne, numberTwo, numberThree;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		while (true) {
			try {
				numberOne = sc.nextInt();
				numberTwo = sc.nextInt();
				numberThree = numberOne / numberTwo;
				System.out.println("Division is " + numberThree);
				break;
			} catch (Exception e) {
				System.out.println("Exception caught: " + e.getMessage());
				break;
			}
		}
		sc.close();
		
		

	}

}
