package Generics;

/**
 * Generic
 */
interface Generic<T> {
    T random(T a, T b);
}

public class Interfaces<T> implements Generic<T> {
    @Override
    public T random(T a, T b) {
        return Math.random() > 0.5 ? a : b;
    }

    public static void main(String[] args) {
        Interfaces<Integer> i = new Interfaces<>();
        System.out.println(i.random(2, 3));
    }
}
