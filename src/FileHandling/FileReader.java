package FileHandling;

/*
Name :Rajvardhan U. Patil
Roll No. :25
*/
import java.io.FileInputStream;
import java.io.IOException;

class FileReader {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("File.txt");

			int data;
			// int len = 0;
			// byte[] str = new byte[50];
			// fin.read(str);
			do {
				data = fin.read();
				// new String(data);
				if (data != -1)
					// str[len] = (byte) data;
					// len++;
					System.out.print((char) data);
			} while (data != -1);

			// System.out.println(new String(str));

			// System.out.println(new String(fin.readAllBytes()));

			// System.out.println(new String(fin.readNBytes(10)));
			// String content = new String(b);
			// System.out.println(content);
			fin.close();
			// System.out.println("Reading is completed.");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
