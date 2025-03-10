package lec_14.task;

import org.apache.commons.lang3.StringUtils;

public class JavaMethods {
    // Перевірка наявності підрядка:
    // Напишіть програму, яка перевіряє, чи містить заданий рядок підрядок «Java».

    public boolean isContain(String value, String target){
        return target.toLowerCase().contains(value.toLowerCase());
    }

    //Напишіть програму, яка перевіряє, чи починається рядок з певного підрядка (наприклад, «Hello»).
    public boolean isStartWith(String value, String target){
        return target.toLowerCase().startsWith(value.toLowerCase());
    }

    // Напишіть програму, яка визначає довжину заданого рядка.
    public long stringLength(String value){
        return value.length();
    }

    // Створіть програму, що підраховує, скільки разів у рядку зустрічається заданий символ.
    public long charCount(char ch, String str){
        long count = 0;
        for (char c : str.toCharArray()){
            if (c == ch){
                count++;
            }
        }
        return count;
    }

    // Напишіть програму, яка знаходить найдовше слово у рядку.
    public String longValue(String str){
        String[] split = str.split("\\s+");
        String world="";
        for (String s : split){
            if(s.length() > world.length()){
                world = s;
            }
        }
        return world;
    }

    // Напишіть програму, яка перевіряє, чи складається рядок лише з цифр.
    public boolean isDigit(String str){
        for (String s : str.split("")){
            if (!isDigitException(s)){
                return false;
            }
        }
        return true;
    }

    public boolean isDigitStrongUtils(String str){
        return StringUtils.isNumeric(str);
    }

    public boolean isDigitRegExp(String str){
        return str.matches("\\d+");
    }

    public boolean isDigitException(String str){
        try{
            Integer.parseInt(str);
        } catch (RuntimeException ex){
            return false;
        }
        return true;
    }

//    Напишіть програму, яка робить першу літеру кожного слова великою, а інші – маленькими.
    public String capitaliseFirstChar(String str){
        return str
                .toLowerCase()
                .replace(str.charAt(0), Character.toUpperCase(str.charAt(0)));
    }

    public String capitaliseFirstCharAppend(String str){
        return "".concat(Character.toUpperCase(str.charAt(0))+"").concat(str.substring(1))
                       ;
    }

}
