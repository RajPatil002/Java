package StreamClasses;

import java.io.*;

public class ByteIO {
    public static void main(String[] args) throws Exception {
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        ByteArrayInputStream bi = new ByteArrayInputStream(alpha.getBytes());
        // int ch;
        // b.skip(1);

        // while ((ch = bi.read()) != -1) {
        // System.out.print((char) ch);
        // bi.skip(1);
        // }

        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        bo.write(bi.readAllBytes());
        bo.write('\n');
        bo.writeTo(new FileOutputStream("out.txt", true));
        bo.close();
    }
}
