package lec_12.task;

import java.util.Arrays;
import java.util.Objects;

//Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива
//(пропусков быть не должно). 1 2 3 4 5 6 4 5 4 - (4) -> 1 2 3 5 6 5
public class NumberRemover {
    public static void main(String[] args) {

        Integer[] mass = {1, 2, 3, 4, 5, 6, 4, 5, 4};

        Integer value = 4;

        System.out.println(Arrays.deepToString(mass));
        System.out.println(Arrays.deepToString(removeValueArray(mass, value)));
    }

    private static Integer[] removeValueArray(Integer[] mass, Integer value) {
        int count = 0;
        for (Integer integer : mass) {
            if (!integer.equals(value)) {
                count++;
            }
        }
        Integer[] result = new Integer[count];
        for (int i = 0, j = 0; i < mass.length; i++) {
            if (!Objects.equals(mass[i], value)) {
                result[j++] = mass[i];
            }
        }
        return result;
    }
}
