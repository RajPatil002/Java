package StringHandling;

public class Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        System.out.println(sb.capacity() + " " + sb.length());

        // returns (-1,0,1) according to lexicographical order of this to args, before =
        // 1, same = 0, after = -1
        System.out.println(sb.compareTo(new StringBuffer("Buffering")));

        // to reduce Buffer size
        sb.trimToSize();
        System.out.println(sb.capacity() + " " + sb.length());
        sb.delete(0, 5);
        System.out.println(sb.capacity() + " " + sb.length() + sb);

    }
}
