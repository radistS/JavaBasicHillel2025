package lec04;

//     Напишіть програму, що демонструє, як використання скорочених операторів скорочує код порівняно зі звичайним записом (наприклад, i = i + 1 vs. i++ або i += 1).

public class IncrExample {

    public static void main(String[] args) {

    }

    public static int increment1(int value){
//        value = value + 1;
//        value++;
//        value +=1;
        return value++;
    }

}
