package StreamClasses;

import java.io.FileInputStream;
import java.io.RandomAccessFile;

/**
 * RandomAccessFileIO
 * RandomAccessFile class uses single pointer for read and write.
 */
public class RandomAccessFileIO {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("out.txt");
        RandomAccessFile file = new RandomAccessFile("out.txt", "rw");
        System.out.println((char) file.read());
        System.out.println((char) fileInputStream.read());
        file.write('b');
    }
}