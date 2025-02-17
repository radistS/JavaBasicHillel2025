package lec_08.task;

public class Task2 {
    public static void main(String[] args) {
        String s1 = "hello"; // string pool
        String s2 = "he" + "llo"; // string pool
        String s3 = "he".concat("llo"); // heap
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
