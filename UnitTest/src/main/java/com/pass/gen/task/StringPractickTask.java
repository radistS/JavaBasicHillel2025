package com.pass.gen.task;

public class StringPractickTask {
    // Перевірка email
    public boolean isEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        int atIndex = email.indexOf('@');
        if (atIndex < 1 || atIndex > email.length() - 1) {
            return false;
        }
        int dotIndex = email.indexOf('.');
        if (dotIndex == -1 || dotIndex == email.length() - 1) {
            return false;
        }
        return true;
    }



    public String toCamelCase(String str, boolean cfl) {
        String[] split = str.split(" ");

        int firstWorld = cfl ? 0 : 1;
        String result = "";
        if (firstWorld == 1) {
            result = split[0];
        }
        JavaMethods jm = new JavaMethods();
        for (int i = firstWorld; i < split.length; i++) {
            result = result.concat(jm.capitaliseFirstChar(split[i]));
        }

        return result;
    }


}
