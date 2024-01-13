package StreamClasses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import StreamClasses.data.Data;

import java.io.ObjectInputStream;

public class ObjectIO {
    public static void main(String[] args) throws Exception {

        // Data data = new Data("RP", 0, true);
        // ObjectOutputStream os = new ObjectOutputStream(new
        // FileOutputStream("obj.txt"));
        // os.writeObject(data);
        // os.writeObject(data);

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("obj.txt"));
        Data d = (Data) is.readObject();
        Data d1 = (Data) is.readObject();
        d.print();
        d1.print();
    }
}
