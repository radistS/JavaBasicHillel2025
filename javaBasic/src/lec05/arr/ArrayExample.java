package lec05.arr;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        System.out.println(Arrays.toString(myArray));

        String[] strArray = new String[5];
        System.out.println(Arrays.toString(strArray));


        myArray[5] = 10;
        System.out.println(Arrays.toString(myArray));

        myArray[0] = 123;
        System.out.println(Arrays.toString(myArray));

        System.out.println(myArray.length);
        System.out.println(strArray.length);

        int[] maxIntArray = new int[1_000_000_000];
        System.out.println(maxIntArray.length);

        boolean[] boolArray = new boolean[10];
        System.out.println(Arrays.toString(boolArray));
    }

}
