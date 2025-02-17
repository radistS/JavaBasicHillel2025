package lec_08.task;

public class Task6 {
    public static void main(String[] args) {
        String s1 = new String("java"); // -> heap
        String s2 = s1.intern(); // -> from heap to string pool
        String s3 = "java"; // string pool

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
    }
}
