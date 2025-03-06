package lec_13.task;
/*
Проверит является ли номер счастливым
 */
public class LackyNamber {
    public static void main(String[] args) {
        String number = "123222";

        System.out.println(isLucky(number));

    }

    private static boolean isLucky(String number){
        if (number.length() % 2 != 0 ){
            return false;
        }

        int left = 0, right = 0;

        for (int i = 0; i <= (number.length() - 1) / 2; i++){
            left += Integer.parseInt(number.charAt(i) + "");
            right += Integer.parseInt(number.charAt(number.length() - 1 - i) + "");
        }
        System.out.println(left);
        System.out.println(right);

        return left == right;
    }
}
