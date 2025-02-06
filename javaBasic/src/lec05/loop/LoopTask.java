package lec05.loop;

public class LoopTask {
    public static void main(String[] args) {

        //Напишите программу, которая находит сумму чисел от 1 до заданного N.
        int n = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 1; i <= n; i++){
            if (i % 500_000_000 == 0) {
                System.out.println(i);
                System.out.print("#");
            }
            result += i;
        }
        System.out.println();
        System.out.println(result);
    }
}
