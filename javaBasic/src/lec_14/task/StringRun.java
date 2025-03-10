package lec_14.task;

public class StringRun {
    public static void main(String[] args) {
        StringPractickTask task = new StringPractickTask();

        System.out.println(task.phoneValidator("380506945569", "UA"));
        System.out.println(task.phoneValidator("38 (050)694 55 69", "UA"));
        System.out.println(task.phoneValidator("+38 (050)694 55 69", "UA"));
        System.out.println(task.phoneValidator("+380 (50) 694 55 69", "UA"));
        System.out.println(task.phoneValidator("380506945569", "SK"));
        System.out.println(task.phoneValidator("421950847554", "SK"));


        System.out.println(task.toCamelCaseSU("stepurko alexande odesa"));
        System.out.println(task.toCamelCase("new method for calculate results", true));
        System.out.println(task.toCamelCase("new method for calculate results", false));
    }
}
