package lec_16.ex;

public class Ex5 {
    public static void main(String[] args) {
        final DaysOff input = DaysOff.Thanksgiving;
        switch (input) {
            default:
            case ValentinesDay:
                System.out.print("1");
            case PresidentsDay:
                System.out.print("2");
        }
    }
}

enum DaysOff {
    Thanksgiving, PresidentsDay, ValentinesDay
}
