package lec06;

public class Example {
    public static void main(String[] args) {
        int income = Integer.parseInt(args[0]);
        double tax;

        if (income <= 10000) {
            tax = (income * 2.5) / 100;
        } else if (income <= 25000) {
            tax = (income * 4.3) / 100;
        } else {
            tax = (income * 6.7) / 100;
        }

        System.out.println("Tax = " + tax);
    }
}
