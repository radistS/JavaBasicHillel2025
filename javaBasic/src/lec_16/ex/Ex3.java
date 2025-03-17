package lec_16.ex;

public class Ex3 {
    public static void main(String[] args) {
        var flavors = 30;
        int eaten = 0;
        switch (flavors) {
            case 30: eaten++;
            case 40: eaten += 2;
            default: eaten--;
        }
        System.out.print(eaten);
    }
}
