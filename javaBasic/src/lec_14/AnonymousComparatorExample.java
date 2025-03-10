package lec_14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousComparatorExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 8, 2);

        // Сортировка списка чисел в порядке убывания с использованием анонимного класса
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b.compareTo(a); // сортировка по убыванию
            }
        });

        System.out.println("Отсортированный список: " + numbers);
    }
}
