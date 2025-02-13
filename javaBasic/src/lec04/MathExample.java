package lec04;

public class MathExample {
    public static void main(String[] args) {
//        //Напишіть програму, яка зчитує число та обчислює його квадратний корінь за допомогою Math.sqrt().
//        System.out.println(Math.sqrt(5));
//
//        //Напишіть програму, яка приймає основу та показник степеня, а потім обчислює значення за допомогою Math.pow().
//        System.out.println(Math.pow(2, 4));
//
//        //Напишіть програму, яка зчитує число та виводить його модуль, використовуючи Math.abs().
//        System.out.println(Math.abs(10));
//        System.out.println(Math.abs(-10));
//
//        //Напишіть програму, яка генерує та виводить випадкове число у діапазоні [0, 1] за допомогою Math.random().
//        System.out.println(Math.random());
//        System.out.println((int)(Math.random() * 10));
//
        int min = -100;
        int max = 100;
        System.out.println(min + (int)(Math.random() * ((max - min) + 1)));
//
//        // Напишіть програму, яка приймає два числа і виводить більше з них за допомогою Math.max() / Math.min().
//        System.out.println(Math.max(2, 4));
//        System.out.println(Math.min(2, 4));
//        System.out.println(maxValue(2, 4));

        // Напишіть програму, яка округлює число вниз до найближчого цілого, використовуючи Math.floor().
//        System.out.println(Math.floor(9.9));
//
//        //  Напишіть програму, яка округлює число вгору до найближчого цілого, використовуючи Math.ceil().
//        System.out.println(Math.ceil(9.1));
//
//        // Напишіть програму, яка приймає число з плаваючою точкою та округлює його до найближчого цілого, використовуючи Math.round().
//        System.out.println(Math.round(4.4));
//        System.out.println(Math.round(4.499999999999999));
//        System.out.println(Math.round(4.5));
//        System.out.println(Math.round(4.6));

    }

    // calculate max value from 2 integers
    private static int maxValue(int a, int b){
        return a > b ? a : b;
    }
}
