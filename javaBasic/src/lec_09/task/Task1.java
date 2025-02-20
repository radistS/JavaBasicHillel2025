package lec_09.task;

public class Task1 {
    public static void main(String[] args) {
        int plan = 1;
        plan = plan++ + --plan;
        if (plan == 1) {
            System.out.print("Plan A");
        } else {
            if (plan == 2)
                System.out.print("Plan B");
            else System.out.print("Plan C");
        }

        if (plan == 1) {
            System.out.print("Plan A");
        } else if (plan == 2){
            System.out.print("Plan B");
        }
        else System.out.print("Plan C");
        }

    }
