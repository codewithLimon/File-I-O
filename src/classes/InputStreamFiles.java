package classes;

import java.io.*;

public class InputStreamFiles {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("src/Files/abc.txt");

        // Create a buffer to hold the contents of the file
        byte[] buffer = new byte[1024];

        // Read the contents of the file into the buffer
        int bytesRead = inputStream.read(buffer);

        // Convert the bytes in the buffer to a string
        String fileContents = new String(buffer, 0, bytesRead);

        // Close the input stream
        inputStream.close();

        // Print the contents of the file
        System.out.println(fileContents);
    }
}
