package Generics;

/**
 * InnerRestriction
 */
class InnerRestriction {

    int a = 10;

}

/**
 * InnerRestriction_1
 */
class InnerRestriction_1 extends InnerRestriction {

}

public class Restriction<T> extends InnerRestriction {

    Restriction(int i) {
        super.a = i;
    }

    // ? is used to specify any object

    // super key is used to restrict class to use parent of that class or that class
    void main(Restriction<? super InnerRestriction_1> r) {
        System.out.println(r.a);
    }

    // extends key is used to restrict class to use child of that class or that
    // class
    void main2(Restriction<? extends InnerRestriction_1> r) {
        System.out.println(r.a);
    }

    public static void main(String[] args) {
        Restriction<InnerRestriction> r = new Restriction<InnerRestriction>(50);
        r.main(r);
    }
}
