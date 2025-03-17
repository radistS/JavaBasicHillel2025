package lec_16.ex;

public class Ex1 {
    public static void main(String[] args) {
        int height = 2, length = 3;
        boolean w = height > 1 | --length < 4;
        var x = height != 2 ? length++ : height;
        boolean z = height % length == 0;
        System.out.println(w + "-" + x + "-" + z);
    }
}
