package lec04;

public class Incre {
    public static void main(String[] args) {

        int a = 5;
        System.out.println(a++); // a++ -> a = a + 1
        System.out.println(a);

        int b = 5;
        System.out.println(b--); // a-- -> a = a - 1
        System.out.println(b);

        int c  = 5;
        System.out.println(--c);
        System.out.println(++c);


        a += 10; // a = a + 10;
        System.out.println(a);

        System.out.println(Math.ceil(5.46));
    }
}
