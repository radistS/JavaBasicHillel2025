package lec_11.task;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
//        String[] os = new String[] { "Linux", "Mac", "Windows" };
        String[] os = new String[] { "Mac", "Linux", "Windows" };
//        String[] os = new String[] { "Mac", "Windows", "Linux"};
        System.out.println(Arrays.binarySearch(os, "Linux"));
    }
}
