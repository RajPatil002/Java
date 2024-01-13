package StreamClasses.data;

import java.io.Serializable;

/**
 * Data
 */
public class Data implements Serializable {

    /*
     * Any changes in No. of class's member will throw InvalidClassException when
     * reading from previosly saved obj
     */
    public String name;
    public int num;
    public boolean ismale;

    public Data() {
    }

    public Data(String name, int num, boolean ismale) {
        this.name = name;
        this.num = num;
        this.ismale = ismale;
    }

    public void print() {
        System.out.printf("%s  %h \n", name + num + ismale, this);
    }
}
