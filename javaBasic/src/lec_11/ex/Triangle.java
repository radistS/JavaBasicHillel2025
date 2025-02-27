package lec_11.ex;

/*
Створіть клас Triangle з полями a, b, c (довжини сторін).
Напишіть метод isValid(), що перевіряє, чи може трикутник існувати.
 */

public class Triangle {
    private  int a;
    private  int b;
    private  int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isValid(){
        return (a + b > c) && (b + c > a) && (a + c > b);
    }
}


