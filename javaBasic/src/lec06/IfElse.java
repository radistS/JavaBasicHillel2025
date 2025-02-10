package lec06;

public class IfElse {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;

        if (compare(a, b)) // true -> 9 -> 15 / false -> 10
            System.out.println("TRUE");
        else if (a == b) { // true -> 11 -> 15 / false -> 13
            System.out.println("==");
        } else {
            System.out.println("FALSE");
        }

        if (a == b){
            System.out.println("equals");
            System.out.println("aaa");
        }

        boolean rez = (a > b) ? true : false;
        System.out.println(rez);

    }

    private static boolean compare(int a, int b) {
        return a < b;
    }

    static String print1() {
        System.out.println("print1");
        return "1";
    }

    static String print2() {
        System.out.println("print2");
        return "2";
    }
}
