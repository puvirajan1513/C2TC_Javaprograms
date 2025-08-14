package day3;
import java.util.*;

public class ProductDemo {

	public static void main(String[] args) {
		Product p1=new Product();
		Product p2=new Product(102,"mouse",456.6f);
		
		
		Scanner s=new Scanner(System.in);
		int sid=s.nextInt();
		s.nextLine();
		String product_name=s.nextLine();
		float price=s.nextFloat();
		
		
		Product p3=new Product(sid,product_name,price);
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
		
	}

}
