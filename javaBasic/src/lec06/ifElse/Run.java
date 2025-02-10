package lec06.ifElse;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();

        run.numberSign(10);

        System.out.println("Max value form N");
        int[] values = {1, 2, 5, 7, 3, 7 };
        System.out.println(run.maxValue(values));

        System.out.println("Mark converter");
        System.out.println(run.markConverter(101));
        run.printMark(1);
    }


    /*
    Положительное, отрицательное или ноль
    Задание: Напишите программу, которая считывает целое число и выводит,
    является ли число положительным, отрицательным или нулём.
    Подсказка: Используйте операторы if, elif/else для сравнения числа с 0.
     */

    public void numberSign(int number){
        if (number < 0){
            System.out.println("-");
        } else if (number == 0){
            System.out.println("0");
        } else {
            System.out.println("+");
        }
    }

    /*
    Задание: Напишите программу, которая принимает на вход три числа и выводит наибольшее из них.
     */
    public int maxValue(int[] numbers){
        int max = numbers[0];
        for (int value : numbers){
            if (value > max){
                max = value;
            }
        }
        return max;
    }

    /*
    Задание: Создайте программу, которая присваивает буквенную оценку (например, A, B, C, D, F)
     на основе числового результата.
     */
    public String markConverter(int markNumber){
        /*
        A - 100 - 95
        B - 94 - 80
        C - 79 -60
        D - < 59
         */

        if (markNumber < 0 || markNumber > 100){
            return "Incorrect input data. MArk between 0 to 100";
        }
        if (markNumber < 59){
            return "D";
        } else if (markNumber < 80){
            return "C";
        } else if (markNumber < 95){
            return "B";
        }
        return "A";
    }

     public void printMark(int b) {
        switch (b) {
            case 1 -> {
               multPrint("D");
            }
            case 2 -> print("C");
            case 3 -> print("B");
            default -> print("A");
        };
    }

    private void multPrint(String mark){
        print(mark);
        print(mark);
        print(mark);
        print(mark);
        print(mark);
    }

    private void print(String mark){
        System.out.println(mark);
    }

}
