package lec_10.StaticExample;

public class Staticrun {
    public static void main(String[] args) {
        StaticExample.print();

        StaticExample se1 = new StaticExample();
        se1.setPhone("phone1");

        StaticExample se2 = new StaticExample();
        se2.setPhone("phone2");

        System.out.println(se1.getPhone());

    }
}
