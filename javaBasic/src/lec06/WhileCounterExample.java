package lec06;

public class WhileCounterExample {
    public static void main(String[] args) {

        String pass = "wrong_pass";
        boolean result = false;
        int counter = 0;


//        do {
//            if (pass.equals("1111")) {
//                result = true;
//            }
//            System.out.println(pass + " : " + result);
//
//        } while (!result && ++counter < 5); // true -> false
//
//        System.out.println("--------");

        do {
            if (pass.equals("1111")) {
                break;
            }
            System.out.println(pass + " : " + result);
        } while (++counter < 5); // true -> false
    }
}
