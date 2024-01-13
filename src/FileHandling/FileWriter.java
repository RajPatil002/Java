package FileHandling;

/*
Name :Rajvardhan U. Patil
Roll No. :25
*/
import java.io.FileOutputStream;
import java.io.IOException;

class FileWriter {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("File.txt");
			String s = "Welcome to Java Programming.";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Writing is completed.");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
