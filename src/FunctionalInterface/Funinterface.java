package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface InnerFuninterface {
    /*
     * Functional interface used with lambda expressions and method ref
     * This contains only one abstract method (SAM -single abstract method),but many
     * default and static methods
     */
    int i = 10;

    // default used in interface only
    default void main2() {
        System.out.println("default Hi");
    }

    // static methods only accessed using interface name
    static void main3() {
        System.out.println("Static hi " + i);
    }

    // this method must be reinitialized
    int main1(int e);

}

/**
 * Sort
 */
interface Sort<T extends Number> {
    T comp(T a, T b);

}

public class Funinterface {
    public static void main(String[] args) {
        InnerFuninterface ifi = new InnerFuninterface() {
            @Override
            public int main1(int r) {
                System.out.println("Rebuild");
                return 0;
            }
        };
        ifi.main1(10);
        ifi.main2();

        // static methods only accessed using interface name
        InnerFuninterface.main3();

        InnerFuninterface forE = e -> {
            System.out.println("lambda? " + e);
            return e + 10;
        };

        ArrayList<Integer> arr = new ArrayList<>(List.of(50, 40, 35, 30));

        Sort<Integer> sort = (a, b) -> {
            System.out.println("called " + a + " " + b + " = " + (a - b));
            return a - b;
        };
        forE.main1(100);

        // arr.replaceAll(forE::main1);
        arr.sort(sort::comp);
        // we have to use :: to share the reference of method
        arr.forEach(forE::main1);
    }
}
