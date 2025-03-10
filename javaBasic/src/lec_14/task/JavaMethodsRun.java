package lec_14.task;

public class JavaMethodsRun {
    public static void main(String[] args) {
        JavaMethods jm = new JavaMethods();

        System.out.println(jm.isContain("Java", "Hello world java"));
        System.out.println(jm.isStartWith("Java", "Java Hello world java"));
        System.out.println(jm.charCount('a', "Java Hello world java"));
        System.out.println(jm.longValue("Java Hello world java"));

        System.out.println(jm.isDigitException("12345"));
        System.out.println(jm.isDigitException("1234w"));
        System.out.println(jm.isDigitException("1234567890987654321"));
        System.out.println(jm.isDigit("1234567890987654321"));
        System.out.println(jm.isDigit("1234567 90987654321"));

        System.out.println(jm.capitaliseFirstChar("string"));
        System.out.println(jm.capitaliseFirstCharAppend("string"));
    }
}
