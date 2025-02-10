package lec06;

public class ForEx {

    public static void main(String[] args) {
        int i = 0;
        for (print("init") ; i < 2 && print("cond"); print("increment")) {
            print("do");
            i++;
        }
    }

    private static boolean print(String str){
        System.out.println(str);
        return true;
    }

}
