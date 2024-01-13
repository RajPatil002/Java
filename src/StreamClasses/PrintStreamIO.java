package StreamClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamIO {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fo = new FileOutputStream("ps.txt");
        PrintStream ps = new PrintStream(fo);
        ps.println("false");
        ps.close();
    }
}
