package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<Integer> al = new ArrayList<>() {
            @Override
            public boolean add(Integer e) {
                System.out.println(e);
                return super.add(e + 10);
            }

            // Anonymous Subclass
            {
                add(10);
                super.add(10);
                super.add(300);
            }
        };
        System.out.println(al);
        System.out.println(al.size());

        // removes all items that are not in argu
        al.retainAll(new ArrayList<Integer>() {
            {
                add(10);
                add(20);
                add(30);
                add(40);
            }
        });
        System.out.println(al);

        // replace using unaryoperator
        al.replaceAll(e -> e + 10);
        System.out.println(al);

        // LinkedList
        // Contains all method of ArrayList + some new
        LinkedList<Integer> ll = new LinkedList<>() {

            // Anonymous Subclass
            {
                add(50);
                add(260);
                add(40);
                add(80);
            }
        };

        // pop,poll,pollFirst,pollLast,removeFirst,removeLast - removes element and
        // returns it.Emptylist - (other - throws exception,poll - null)

        // push,add,addFirst,addLast,offerFirst,offerLast - adds element and some
        // returns boolean.
        ll.set(0, 30);
        ll.removeLastOccurrence(30);
        System.out.println(ll);

        // ll.sort(Comparator.reverseOrder());
        Collections.sort(ll, new Comparator<Integer>() {

            // works same as compareTo
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 % 3) < (o2 % 3) ? 1 : -5;
            }
        });
        System.out.println(ll);
    }
}
