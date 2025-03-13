package lec_15.ex;


public class Ex2 {
    public static void main(String[] args) {
        String m = "Hello";
        System.out.print(m);
        System.out.println();
        bar(m);
        System.out.print(m);
    }

    static void bar(String m) {
        m = m + " World!";
    }
}