package lec04.algerbr;

public class Algebra {

    private static final double PI = 3.14d;

    //  Напишіть програму, яка зчитує два цілі числа з консолі та виводить їхню суму, різницю, добуток і частку.
    public void arifmOper(int a, int b){
        System.out.println("+ : " + (a + b)) ;
        System.out.println("- : " + (a - b)) ;
        System.out.println("* : " + (a * b)) ;
        System.out.println("/ : " + (a / b)) ;
    }

    // Напишіть програму, яка приймає довжину та ширину прямокутника і обчислює його площу (ширина * довжина).
    public int square(int a, int b){
        return a * b;
    }

    // Напишіть програму для конвертації температури з градусів Цельсія у Фаренгейти за формулою: F = (9/5) * C + 32.
    public double toFahrenheit(double tempCelsius){
        return ((9 * tempCelsius) / 5) + 32;
    }

    // Напишіть програму, яка, знаючи радіус кола, обчислює його площу (π·r²) та периметр (2·π·r).
    public double area(double radius){
        return PI * radius * radius;
    }

    public double areaMath(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter(double radius){
        return 2 * PI * radius;
    }

}
