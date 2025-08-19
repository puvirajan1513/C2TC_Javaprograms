package day4.firstproject;
import java.util.*;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1=new Person();
		
		Scanner sc=new Scanner(System.in);
		String name,city;
		int age;
		System.out.println("enter the person detials: ");
		name=sc.nextLine();
		city=sc.nextLine();
		age=sc.nextInt();
		
		p1.setName(name);
		p1.setCity(city);
		p1.setAge(age);
		System.out.println("Person Details Name : " + p1.getName() + "\tAge : " + p1.getAge() + "\tCity : "
				+ p1.getCity());
		
		
		
		

	}

}
