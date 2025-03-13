package lec_14;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnonymousComparatorExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 8, 2);

        // Сортировка списка чисел в порядке убывания с использованием анонимного класса
        Collections.sort(numbers, (a, b) -> b.compareTo(a));

        System.out.println("Отсортированный список: " + numbers);
    }
}
