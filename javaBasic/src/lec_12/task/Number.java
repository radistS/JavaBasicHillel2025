package lec_12.task;

public class Number {
    /*
       Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
     */
    public static void main(String[] args) {
        int[] numbers = {12345, 67890, 54321, 987654, 345678};

        // 1 - split ""
        // 2 - string to int (0 - 9)
        // [10] 0 - 9
        // 12342

        // mass[1] == null -> TRUE -> mass[1] = 1
        // mass[2] == null -> TRUE -> mass[2] = 2
        // mass[3] == null -> TRUE -> mass[3] = 3
        // mass[4] == null -> TRUE -> mass[4] = 4
        // mass[2] == null -> FALSE -> return

        System.out.println(isUnique(123415));

    }

    private static boolean isUnique(int number) {
        String num = String.valueOf(number);
        if (num.length() > 10) {
            return false;
        }
        Integer[] mass = new Integer[10];

        String[] split = num.split(""); // number to string elements
        for (int i = 0; i < split.length; i++) {
            Integer idx = Integer.parseInt(split[i]); // string -> integer (int)
            if (mass[idx] == null) {
                mass[idx] = idx;
            } else {
                return false;
            }
        }
        return true;
    }
}
