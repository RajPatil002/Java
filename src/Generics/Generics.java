package Generics;

public class Generics<T> {
    T[] g = (T[]) new Object[5];

    Generics(T... t) {
        g = t;
    }

    public T print(T a) {
        for (T a2 : g) {
            System.out.println(a2);
        }
        return a;
    }

    public static void main(String[] args) {
        Generics<Integer> gs = new Generics<>(10, 20, 30, 40, 50);
        System.out.println(gs.print(10).getClass());
    }
}
