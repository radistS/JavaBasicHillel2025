package lec_13.task;

/*
Напишите Java-программу для удаления всех пробелов из строки без использования replace().
 */

public class RemoveSpace {
    public static void main(String[] args) {
        String str = " a v cd vg g b n h";
        String result = "";

        for (String s : str.split(" ")){
            result += s;
        }

        System.out.println(result);

    }
}
