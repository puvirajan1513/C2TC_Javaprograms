package day11;

public class Throw {

	public static void main(String[] args) {
		
		try {
			int a[] =new int[5];
			a[0]=11;
			a[1]=12;
			System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception "+e.getMessage());
		}
		
		System.out.println("Next Line");

	}

}
