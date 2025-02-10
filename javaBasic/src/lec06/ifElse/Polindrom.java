package lec06.ifElse;

public class Polindrom {

    private static final String TEXT = "А роза упала на лапу Азора";
    private static final String TEXT_F = "asddaa";

    public static void main(String[] args) {
        System.out.println(isPolindrom(TEXT));
        System.out.println(isPolindrom(TEXT_F));
    }

    public static boolean isPolindrom(String str) {
        str = str.toLowerCase().replace(" ", "");
        char[] charStr = str.toCharArray();
        for (int i = 0; i < charStr.length / 2; i++){
            if (charStr[i] != charStr[charStr.length - 1 - i])
                return false;
        }
        return true;
    }
}
