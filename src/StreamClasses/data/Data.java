package StreamClasses.data;

import java.io.Serializable;

/**
 * Data
 */
public class Data implements Serializable {

    /*
     * Serialization :
     * Any changes in No. of class's member will throw InvalidClassException when
     * reading from previosly saved obj
     */
    public String name;
    public int num;
    private int me = 20;
    public boolean ismale;

    public Data() {
        System.out.println("Default Constructor");
    }

    public Data(String name, int num, boolean ismale) {
        this.name = name;
        this.num = num;
        this.ismale = ismale;
    }

    public void print() {
        System.out.printf("%s  %h %d\n", name + num + ismale, this, me);
    }
}
