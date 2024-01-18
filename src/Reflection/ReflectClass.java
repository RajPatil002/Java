package Reflection;

import java.lang.reflect.Constructor;

import StreamClasses.data.Data;

public class ReflectClass {
    ReflectClass() {
        System.out.println("Reflect");
    }

    public static void main(String[] args) throws Exception {

        // We can use name.class to refer any class
        Class<Data> data = Data.class;
        Constructor<Data> con = data.getDeclaredConstructor(String.class, int.class,
                boolean.class);
        Data d = con.newInstance("Raj", 21, true);
        d.print();

        for (Constructor<?> string : data.getDeclaredConstructors()) {
            System.out.println(string);
        }

        // Create jar file which contains class inside package to use in forName,
        // otherwise it wont work. e.g. "com.package.Name"

        // forName returns any type of class which we can cast to desired class while
        // retrieving class or instantiating
        Class<?> c = Class.forName("StreamClasses.data.Data");
        Data da = (Data) c.getDeclaredConstructor().newInstance();
        da.print();

    }
}
