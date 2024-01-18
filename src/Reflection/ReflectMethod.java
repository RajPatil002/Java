package Reflection;

import java.lang.reflect.Method;

import StreamClasses.data.Data;

public class ReflectMethod {
    public static void main(String[] args) throws Exception {
        Class<Data> data = Data.class;
        Data d = new Data("RP", 20, true);

        Method dm = data.getMethod("print");
        dm.invoke(d);
        for (Method string : data.getDeclaredMethods()) {
            System.out.println(string);
        }
    }

}
