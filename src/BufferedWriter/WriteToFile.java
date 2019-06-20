
package BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {

		String textToWrite = "I am learning Java from SoftwareTestingMaterial";

		// Import BufferedWriter and FileWriter classes
		/*
		 * BufferedWriter writes text to a character-output stream, buffering characters
		 * so as to provide for the efficient writing of single characters, arrays, and
		 * strings.
		 */
		// Import FileWriter and BufferedWriter class

		FileWriter fileWrite = new FileWriter("C:/Users/Mosarrof Hossain/Documents/validation and verifications.txt");
		BufferedWriter writer = new BufferedWriter(fileWrite);
		writer.write(textToWrite);
		writer.newLine();
		writer.write(textToWrite);
		System.out.println("Please open your selected file and enjoy the writting in java ");
		// Close the BufferedWriter object to prevent memory leak
		writer.close();
	}
}
