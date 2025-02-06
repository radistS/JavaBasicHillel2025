package lec05.loop;

import java.util.Arrays;

public class LoopExample {
    public static void main(String[] args) {

        int[] arr = new int[10];
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i -= 2){
            System.out.print(arr[i] + " ");
        }
    }
}
