package lec_10.task;

public class Task1 {
public static void main(String[] arguments) {
        int turtle = 10 * (2 + (3 + 2) / 5);
        int hare = turtle < 5 ? 10 : 25;
        System.out.println(turtle);
        System.out.println(hare);
        System.out.print(turtle < hare ? "Hare wins!" : "Turtle wins!");
    }
}
