package lec_11.task;

public class Task1 {
    public static void main(String[] args) {
        long thatNumber = 5 >= 5 ? 1 + 2 : 1 * 1;
        if (++thatNumber < 4)
            thatNumber += 1;
        System.out.println(thatNumber);
    }
}
