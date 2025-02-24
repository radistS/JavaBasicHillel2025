package lec_10.task;

public class Task2 {
    public static void main(String[] args) {
        int characters = 5;
        int story = 3;
        double movieRating = characters <= 4 ? 3 : story > 1 ? 2 : 1;
        System.out.println(movieRating);
    }
}
