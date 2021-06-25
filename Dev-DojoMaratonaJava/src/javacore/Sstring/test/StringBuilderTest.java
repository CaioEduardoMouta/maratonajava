package javacore.Sstring.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuilder sb = new StringBuilder(10);
        StringBuilder sa = new StringBuilder(10);
        sb.append("laidnum met oãn sariemlaP");
        sa.append("0123456789");
        System.out.println(sb.reverse());
        System.out.println(sa.delete(0,2));
        System.out.println(sa.insert(2,"####"));
    }
}
