package lec_07;

import java.util.Arrays;

public class StringMetExample {
    public static void main(String[] args) {
        String str = "Hello world";

        // split - char[]
        char[] arr = str.toCharArray();

        // split - String[]
        String[] arrChar = str.split("");
        System.out.println(arrChar.length);
        System.out.println(Arrays.toString(arrChar));

        String[] arrWorld = str.split(" ");
        System.out.println(arrWorld.length);
        System.out.println(Arrays.toString(arrWorld));
        System.out.println(arrWorld[1]);

        String[] arrLWorld = str.split("l");
        System.out.println(arrLWorld.length);
        System.out.println(Arrays.toString(arrLWorld));

        // concat
        String s1 = "one";
        String s2 = "two";
        System.out.println(s1 + s2);
        System.out.println(s1
                .concat(s2)
                .concat(s1)
                .concat(s2));

        //valueOf()
        Integer i = 10;
        String valOf = String.valueOf(i);
        System.out.println(valOf);

        // join()
        System.out.println(String.join("-", s1, s2, s1, s2));
        System.out.println(String.join("-", arrChar));

        // compareTo()
        System.out.println(s1.compareTo(s1));
        System.out.println(s1.compareTo(s2));

        String a1 = "Stepurko";
        String a2 = "stepurko";
        String a3 = "Stepurka";
        String a4 = "SPepurko";
        String a5 = "Ivanov";

        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a3));
        System.out.println(a1.compareTo(a4));
        System.out.println(a1.compareTo(a5));

        // equals()
        String b1 = "cс"; // e + r
        String b2 = "cc"; // e + e

        System.out.println(b1.equals(b2));
        System.out.println(b1.compareTo(b2));

        // charAt()
        String hello = "HELLO";
        System.out.println(hello.charAt(3));
//        System.out.println(hello.charAt(10)); // error

        // getChars()
        char[] aStr = new char[10];
        hello.getChars(1,3, aStr, 5);
        System.out.println(Arrays.toString(aStr));

        // equals() vs equalsIgnoreCase()
        b1 = "Aa";
        b2 = "aa";
        System.out.println(b1.equals(b2)); // -> false
        System.out.println(b1.equalsIgnoreCase(b2)); // -> true

        // indexOf()
        String h = "Hello world";
        System.out.println(h.indexOf("l"));
        System.out.println(h.indexOf("a"));
        System.out.println(h.lastIndexOf("l"));

        // startWith() vs endWith()
        String phone = "+3805525698741";
        System.out.println(phone.startsWith("+380"));

        String fileName = "file.txt";
        System.out.println(fileName.endsWith(".txt"));

        // replace
        System.out.println(h.replace("l", "L"));

        // trim
        String trm = "    aaa bbb   ";
        System.out.println(trm.length());
        System.out.println(trm);
        trm = trm.trim();
        System.out.println(trm.length());
        System.out.println(trm);

        // toLoverCase() / toUpperCase()
        String s = "Hello world";
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

    }
}