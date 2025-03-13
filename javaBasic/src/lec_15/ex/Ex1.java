package lec_15.ex;

public class Ex1 {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(717);
        Integer i2 = Integer.valueOf(717);
        System.out.println(i1 == i2);

        i1 = Integer.valueOf(100);
        i2 = Integer.valueOf(100);
        System.out.println(i1 == i2);
    }
}
