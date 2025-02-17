package lec_08.task;

public class Task5 {
    public static void main(String[] args) {
        String str = "apple,,banana";
        String[] parts = str.split(",");
        System.out.println(parts.length);
    }
}
