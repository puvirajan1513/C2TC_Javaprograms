
package bufferedreader_example;
import java.io.*;

public class BufferedDemo {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enterb the name: ");
		String name=br.readLine();
		System.out.println("Enter the age: ");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter the salary: ");
		double salary=Double.parseDouble(br.readLine());
		System.out.println("Name:"+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);

	}

}
