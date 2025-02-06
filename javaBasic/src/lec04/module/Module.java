package lec04.module;

public class Module {

//    // Напишіть програму, яка приймає загальну кількість яєць і виводить кількість повних десятків яєць (наприклад, 47 яєць → 4 повних десятка).
//    public double module10(int eggs){
//        return eggs / 10;
//    }
//
//    // Напишіть програму, яка перевіряє, чи є введене число парним, використовуючи вираз number % 2.
//    public boolean isOdd(int number){
//        int ostatok = number % 2;
//        return ostatok == 1;
//    }
//
//    public boolean isEven(int number){
//        int ostatok = number % 2;
//        return ostatok == 0;
//    }
//
//    // Напишіть програму, яка обчислює суму цифр тризначного числа, використовуючи оператор % для отримання кожної цифри.
//    public int sumNumber(int number){
//        int od = number % 10;
//        number /= 10;
//        int des = number % 10;
//        number /= 10;
//        int sot = number % 10;
//        return  od + des + sot;
//    }
//
//    //     Напишіть програму, яка перевіряє, чи є рік високосним. (Рік високосний, якщо він кратний 4, але не кратний 100, або кратний 400.)
//    public boolean isLeapYear(int year){
//        return (year % 4 == 0 && year % 100 != 0) | (year % 400 == 0);
//    }

    public boolean isLeapYearUpd(int year){
        return (mod4(year) && mod100(year)) || (mod400(year));
    }

    private boolean mod4(int year){
        System.out.println("mod4");
        return year % 4 == 0;
    }

    private boolean mod100(int year){
        System.out.println("mod100");
        return year % 100 != 0;
    }

    private boolean mod400(int year){
        System.out.println("mod400");
        return year % 400 == 0;
    }


}
