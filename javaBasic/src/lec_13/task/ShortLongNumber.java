package lec_13.task;
/*
Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

public class ShortLongNumber {
    public static void main(String[] args) {
        Integer[] mass = {123, 2234123, 213412343, 42341234, 213412345, 62341234, 21342344, 23412345, 1};

        System.out.println(shortNumber(mass));
        System.out.println(longNumber(mass));
    }

    public static Integer shortNumber(Integer[] arr){
        int idx = 0;
        int result = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (String.valueOf(result).length() > String.valueOf(arr[i]).length()){
                idx = i;
                result = arr[i];
            }
        }
        System.out.println(idx);
        return result;
    }

    public static Integer longNumber(Integer[] arr){
        int idx = 0;
        int result = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (String.valueOf(result).length() < String.valueOf(arr[i]).length()){
                idx = i;
                result = arr[i];
            }
        }
        System.out.println(idx);
        return result;
    }
}
