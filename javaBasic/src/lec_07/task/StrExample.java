package lec_07.task;

public class StrExample {
    public static void main(String[] args) {

        System.out.println(sumNumber("asd123ddd"));

        System.out.println(isUnique("aaa"));
        System.out.println(isUnique("aba"));
        System.out.println(isUnique("abc"));

        System.out.println("abc -> " + reverseString("abc"));


    }

    /*
    Напишите программу, которая проходит по символам строки, определяет,
    какие из них являются цифрами, и суммирует их числовые значения.
     */
    public static int sumNumber(String str){
        int result = 0;
        for (char c :str.toCharArray()){
            if (Character.isDigit(c)){
//                result += c;
                result += Character.getNumericValue(c);
            }
        }
        return result;
    }


    /*
    Проверьте, состоит ли строка только из уникальных символов, используя цикл и условные операторы.
      aa -> false
      ba -> true
     */

    public static boolean isUnique(String str){
        for (int i = 0; i < str.length(); i++){
            for(int j = i + 1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    /*
    Реализуйте алгоритм, который проходит по символам строки в обратном порядке и формирует
    новую перевёрнутую строку.

    abc -> cba
     */

    public static String reverseString(String str){
        char[] charArray = str.toCharArray();
        char tmp;
        for (int i = 0; i < charArray.length / 2 ; i++){
            tmp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 -i];
            charArray[charArray.length  - i - 1] = tmp;
        }
        return new String(charArray);
    }
}
