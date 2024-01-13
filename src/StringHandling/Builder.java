package StringHandling;

public class Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123456789");
        StringBuilder sn = sb;
        System.out.println(sb.insert(0, 0));

        // appends ascii char
        sn.appendCodePoint(67);
        System.out.printf("%h %h\n", sb, sn);
        System.out.println(sb);
    }
}
