package lec_08;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
//        printArray(arr);
//        Arrays.sort(arr);
//        printArray(arr);
//
//        String[] str = {"A", "C", "F", "D", "B"};
//        printArrayStr(str);
//        Arrays.sort(str);
//        printArrayStr(str);

        String[] str1 = {"A", "c", "F", "d", "B"};
        String[] str2 = new String[str1.length];
        String[] str3 = new String[str1.length];
        printArrayStr(str1);
        for(int i = 0; i < str1.length; i++){
            str2[i] = str1[i].toLowerCase();
        }
        printArrayStr(str2);
        Arrays.sort(str2);
        printArrayStr(str2);
        for (int i = 0; i < str2.length; i++){
            for (String s : str1) {
                if (str2[i].equalsIgnoreCase(s)) {
                    str3[i] = s;
                }
            }
        }
        printArrayStr(str3);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void printArrayStr(String[] arr) {
        for (String num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
