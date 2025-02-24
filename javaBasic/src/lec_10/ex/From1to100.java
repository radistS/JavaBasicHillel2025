package lec_10.ex;

/**
 * Напишите программу, которая выводит на экран числа от 1 до 100.
 * При этом вместо чисел, кратных трем, программа должна выводить слово «Fizz»,
 * а вместо чисел, кратных пяти — слово «Buzz». Если число кратно и 3, и 5,
 * то программа должна выводить слово «FizzBuzz»
 */
public class From1to100 {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz" + i + " ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz" + i + " ");
            } else if (i % 3 == 0){
                System.out.print("Fizz" + i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

