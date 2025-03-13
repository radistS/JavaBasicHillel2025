package lec_14.task;

import java.util.StringJoiner;

/*
Перетворення чисел у двійковий формат:
Розбийте рядок на слова, визначте,
які з них є числами, та перетворіть кожне число за допомогою функції bin().
 */
public class ToBinary {
    public static void main(String[] args) {
        String text = "У мене є 5 яблук і 132 груш";
        System.out.println(toBinatyString(text));
    }

    public static String toBinatyString(String str){
        String[] srtMass = str.split(" ");
        StringJoiner result = new StringJoiner(" ");
        for (String s : srtMass){
            if (s.matches("\\d+")){
                result.add(Integer.toBinaryString(Integer.parseInt(s)));
            } else {
                result.add(s);
            }
        }
        return result.toString();
    }
}
