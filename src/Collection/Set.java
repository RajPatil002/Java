package Collection;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * InnerSet
 */
class InnerSet implements Comparable {
    int a = 10;

    InnerSet(int a) {
        this.a = a;
    }

    InnerSet() {
    }

    @Override
    public int compareTo(Object o) {
        int t = ((InnerSet) o).a;
        return this.a < t ? 1 : -1;
    }

}

public class Set {

    public static void main(String... args) {
        // loading factor - how many % of memory/table should be used of 100%
        HashSet<String> hs = new HashSet<>(16, 0.5f);
        hs.add("a");
        System.out.println(hs.size());
        System.out.println(hs.add("aa"));
        System.out.println(hs);

        // TreeSet

        // parent - SortedSet
        // If you want to use custom class as generic type ,then that class has to
        // implement compareTo method of Comparable interface
        TreeSet<InnerSet> ts = new TreeSet<>() {

            // Anonymous Subclass
            {
                add(new InnerSet());
                add(new InnerSet(20));
                add(new InnerSet());
                add(new InnerSet(50));
            }
        };
        System.out.println(ts);
        for (InnerSet i : ts) {
            System.out.println(i.a);
        }
    }
}