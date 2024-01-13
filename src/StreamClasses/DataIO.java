package StreamClasses;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;

import StreamClasses.data.Data;

public class DataIO implements Cloneable {
    static void writeFile(DataOutputStream dos, Data data) throws Exception {
        dos.writeUTF(data.name);
        dos.writeInt(data.num);
        dos.writeBoolean(data.ismale);
    }

    static void readFile(DataInputStream dis, Data data) throws Exception {
        data.name = dis.readUTF();
        data.num = dis.readInt();
        data.ismale = dis.readBoolean();
    }

    public static void main(String[] args) throws Exception {
        Data data = new Data();
        // Data d2 = (Data) data.print();
        // System.out.printf("%h %h", data, d2);

        readFile(new DataInputStream(new FileInputStream("ps.txt")), data);
        data.print();
        // Data data = new Data("RP", 0, true);
        // writeFile(new DataOutputStream(new FileOutputStream("ps.txt")), data);
    }
}
