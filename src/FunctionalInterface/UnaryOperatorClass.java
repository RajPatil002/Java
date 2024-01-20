package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorClass {
    public static void main(String[] args) {
        int i = 10;
        UnaryOperator<Integer> uo = (e) -> {
            System.out.println(e);
            // only final variables or vars that cannot be changed through out life cycle
            // are used in UnaryOperator defination.
            return e + i;
        };
        uo.apply(10);

        ArrayList<Integer> arr = new ArrayList<>(List.of(10, 20, 30, 40));
        arr.replaceAll(uo);
        System.out.println(arr);
    }
}
