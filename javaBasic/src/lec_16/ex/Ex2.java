package lec_16.ex;

public class Ex2 {
    public static void main(String[] args) {
        var plan = 1;
        plan = plan++ + --plan;
        if (plan == 1) {
            System.out.print("Plan A");
        } else {
            if (plan == 2)
                System.out.print("Plan B");
            else
                System.out.print("Plan C");
        }
    }
}

