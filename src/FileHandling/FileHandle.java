package FileHandling;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;

public class FileHandle {
    public static void main(String[] args) {
        File f = new File("./file.txt");
        Date date = new Date(f.lastModified());
        DateFormat df = DateFormat.getDateInstance();
        ;
        System.out.println(date);

    }
}
