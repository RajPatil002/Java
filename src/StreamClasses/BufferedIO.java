package StreamClasses;

// package StreamClasses;

import java.io.*;

public class BufferedIO {
    public static void main(String[] args) throws Exception {
        FileInputStream fi = new FileInputStream("out.txt");
        FileReader fr = new FileReader(fi.getFD());
        BufferedInputStream bi = new BufferedInputStream(fi);
        BufferedReader br = new BufferedReader(new InputStreamReader(fi));

        System.out.println(
                fi.markSupported() + " " + fr.markSupported() + " " + bi.markSupported() + " " + br.markSupported());
        int x;
        do {
            x = bi.read();
            if (x != -1)
                System.err.print((char) x);
        } while (x != -1);
        System.out.println(new String(bi.readAllBytes()));
        bi.close();

    }
}
