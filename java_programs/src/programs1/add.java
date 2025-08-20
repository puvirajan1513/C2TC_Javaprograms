package programs1;
import java.io.*;
//import java.util.*;

public class add {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner s = new Scanner(System.in);  // Unused, can be removed

        System.out.println("Enter the values:");
        int a, b, c;

        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = a + b;

        
        
        System.out.println("Sum is: " + c);


	}

}
