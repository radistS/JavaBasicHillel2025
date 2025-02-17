package lec_08;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {64, 34, 25, 12, 22, 11, 90}; // Приклад масиву
        int[] arr = {1, 2, 3, 4}; // Приклад масиву

        System.out.println("Початковий масив:");
        printArray(arr);

        bubbleSort(arr); // Викликаємо функцію сортування

        System.out.println("Відсортований масив:");
        printArray(arr);
    }

    // Алгоритм сортування бульбашкою
    public static void bubbleSort(int[] arr) {
        int n = arr.length; // Отримуємо розмір масиву
        boolean swapped; // Флаг для перевірки, чи були перестановки

        // Зовнішній цикл (кількість проходів)
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Перед кожним проходом скидаємо флаг
            // Внутрішній цикл для порівняння сусідніх елементів
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // Якщо поточний елемент більший за наступний
                    // Міняємо місцями елементи
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // Позначаємо, що була перестановка
                }
            }
            // Якщо жодної перестановки не було, масив уже відсортований
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}