package lec_08;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortComparator {
    public static void main(String[] args) {
        String[] str1 = {"A", "c", "F", "d", "B"};

        Arrays.sort(str1, Comparator.comparing(String::toLowerCase));

        System.out.println(Arrays.toString(str1)); // [A, B, c, d, F]
    }
}
