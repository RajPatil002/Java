package InnerClasses;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * InnerAnonymousSubclass
 */
class InnerAnonymousSubclass {
    int i;

    InnerAnonymousSubclass(int i) {
        this.i = i;
    }

    public void setI(int i) {
        this.i = i;
    }

    void main() {
        System.out.println("Main method " + i);
    }
}

public class AnonymousSubclass {
    public static void main(String[] args) {
        /*
         * This type of anonymous subclass is used to perform operation of parent class
         * at the time of initialization.
         * Example - Mostly for classes in java.util.Collection like
         * ArrayList,LinkedList we use this type of anonymous subclass to initialize the
         * list with instance.
         */
        new InnerAnonymousSubclass(10) {
            {
                main();
                i = 15;
                main();
                setI(20);
                main();
            }
        };
        new ArrayList<Integer>() {
            {
                add(1);
                add(2);
            }
        };
        new LinkedList<Integer>() {
            {
                add(10);
            }
        };
    }
}
