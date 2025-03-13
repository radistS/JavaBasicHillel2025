package lec_15.ex;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        String[] nums = new String[] { "1", "9", "11", "0", "100", "a", "B", "c", "z", "D", "-" };
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        Integer[] numsInt = new Integer[] { 1, 9, 10 };
        Arrays.sort(numsInt);
        System.out.println(Arrays.toString(numsInt));
    }
}
