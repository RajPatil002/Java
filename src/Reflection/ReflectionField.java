package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import StreamClasses.data.Data;

public class ReflectionField {
    public static void main(String[] args) throws Exception {

        Class<Data> data = Data.class;
        Constructor<Data> con = data.getDeclaredConstructor(String.class, int.class, boolean.class);
        Data d = con.newInstance("Raj", 21, true);

        Field f = data.getDeclaredField("me");
        // sets access of variable for Field class instance which we can use to change
        // the value of that field
        f.setAccessible(true);
        f.set(d, 50);
        System.out.println(f.getInt(d));
        // we cannot directly access private field using instance of that class
        // System.out.println(d.me); //error
        d.print();

        for (Field string : data.getDeclaredFields()) {
            System.out.println(string);
        }

    }
}
