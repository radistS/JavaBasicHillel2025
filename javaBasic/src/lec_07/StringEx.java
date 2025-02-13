package lec_07;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {
        String str = "Hello world";
        String el = "a";

        int count = 0;
        String[] split = str.split("");
        for (String s : split){
            if (el.equalsIgnoreCase(s)){
                count++;
            }
        }
        System.out.println("count " + el +" : " + count);

        int[] result = new int[count];
        int r = 0;
        for (int i = 0; i < split.length; i++){
            if (split[i].equalsIgnoreCase(el)){
                result[r++] = i;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
