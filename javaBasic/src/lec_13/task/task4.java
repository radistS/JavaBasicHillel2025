package lec_13.task;

/*
Вывести на консоль те числа, длина которых меньше (больше) средней длины по
всем числам, а также длину.
 */
public class task4 {
    public static void main(String[] args) {
//        Integer[] mass = {123, 2234123, 213412343, 42341234, 213412345, 62341234, 21342344, 23412345, 1};
        Integer[] mass = {123, 123, 123, 1234, 1234};

        //avg length
        int acc = 0;
        for (Integer i : mass){
            acc += String.valueOf(i).length();
        }
        long avg = Math.round((double) acc / mass.length);
        System.out.println(avg);

        // sout
        for (Integer i : mass){
            if ( String.valueOf(i).length() <= avg){
                System.out.println(i);
            }
        }
    }
}
