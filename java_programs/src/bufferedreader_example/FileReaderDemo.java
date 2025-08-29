package bufferedreader_example;

import java.io.*;
import java.net.URL;

public class FileReaderDemo {
	 public static void main(String[] args) throws IOException {
	        URL resource = FileReaderDemo.class.getResource("javaprogram.txt");
	        if (resource == null) {
	            System.err.println("File not found");
	            return; // Exit the program if file is not found
	        }

	        // Convert the URL to a File object
	        File file = new File(resource.getFile());

	        // Create a FileReader object to read the file
	        FileReader fileReader = new FileReader(file);

	        // Create a BufferedReader object to wrap the FileReader
	        BufferedReader reader = new BufferedReader(fileReader);

	        // Variable to hold each line read from the file
	        String line;

	        // Read the file line by line using readLine() method
	        while ((line = reader.readLine()) != null) {
	            // Print each line to the console
	            System.out.println(line);
	        }

	        // Close the BufferedReader to free up resources
	        reader.close();
	    }

}
