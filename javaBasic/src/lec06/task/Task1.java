package lec06.task;

public class Task1 {
    public static void main(String[] args) {
        int a = 3;
        int b = a++ + ++a;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
