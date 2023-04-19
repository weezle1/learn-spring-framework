package my.testing.examples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example_Files {

	public static void main(String[] args) {
		// lets create a file in a directory
		try {
			File myObj = new File("c:\\temp\\filename1.txt");
			if(myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			}else {
				System.out.println("File already exists.");
			}
		}catch(IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		// now lets write to the file we created
		try {
			// omit the boolean in FileWriter constructor if not appending text to file
			//FileWriter myWriter = new FileWriter("c:\\temp\\filename1.txt", true);
			FileWriter myWriter = new FileWriter("c:\\temp\\filename1.txt");
			myWriter.write("Files in Java might be tricky, but it is fun enough!");
			myWriter.close();
		}catch(IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		// now lets read the file we created
		try {
			File myObj = new File("c:\\temp\\filename1.txt");
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
		}catch(FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
		// now lets get info of the file
		File myObj = new File("c:\\temp\\filename1.txt");
		if(myObj.exists()) {
			System.out.println("File name: " + myObj.getName());
			System.out.println("Absolute path: " + myObj.getAbsolutePath());
			System.out.println("Writeable: " + myObj.canWrite());
			System.out.println("Readable " + myObj.canRead());
			System.out.println("File size in bytes " + myObj.length());
		}else {
			System.out.println("The file does not exists.");
		}
	}

}
