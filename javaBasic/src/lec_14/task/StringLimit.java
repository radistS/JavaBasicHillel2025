package lec_14.task;

/*
Обрізання рядка з додаванням багатокрапки:
Якщо довжина рядка перевищує заданий ліміт, обріжте його та додайте в кінці символ «…»
 */
public class StringLimit {
    public static void main(String[] args) {
        System.out.println(stringUpdate("12345", 6));
        System.out.println(stringUpdate("12345", 3));
    }

    public static String stringUpdate(String str, int limit){
        if (str == null || limit < 0){
            throw new IllegalArgumentException();
        }
        if (str.length() <= limit){
            return str;
        }
        return str.substring(0, limit).concat("..."); // [ .. )
    }
}
