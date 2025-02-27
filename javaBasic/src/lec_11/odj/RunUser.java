package lec_11.odj;

public class RunUser {
    public static void main(String[] args) {
        User us1 = new User();
        User us2 = new User();
        User us3 = us1;

        // toString
        System.out.println(us1);
        System.out.println(us2);

        us1.setAge(20);
        System.out.println();
        System.out.println(us1);
        System.out.println(us2);
        System.out.println(us3);
        us3.setFirstName("Oleksandr");

        System.out.println();
        System.out.println(us1);
        System.out.println(us2);
        System.out.println(us3);

        // equals

        us2.setFirstName("Oleksandr");
        us2.setAge(20);
        System.out.println(us1.equals(us2)); // us1 != us2
        System.out.println(us1.equals(us3)); // us1 == us2

        System.out.println();
        System.out.println(us1);
        System.out.println(us2);
        System.out.println(us3);

        User us4 = new User("Olksandr", "Stepurko");

        System.out.println(us4);
    }
}
