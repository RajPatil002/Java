package Generics;

/**
 * Generalize
 */
public class Generalize {

    public static void main(String[] args) {
        Object o = 1;
        System.out.println(o.getClass());
        Integer i = (int) o;
        System.out.printf("%h    %h", o, i);
    }
}