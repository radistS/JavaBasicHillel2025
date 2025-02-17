package lec_08;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11}; // Початковий масив

        System.out.println("Початковий масив:");
        printArray(arr);

        selectionSort(arr); // Викликаємо метод сортування

        System.out.println("Відсортований масив:");
        printArray(arr);
    }

    // Метод сортування вибором
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Проходимо по всіх елементах масиву
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Припускаємо, що мінімальний елемент знаходиться на позиції i

            // Шукаємо найменший елемент у невідсортованій частині масиву
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) { // Якщо знайдено менший елемент
                    minIndex = j; // Оновлюємо індекс мінімального елемента
                }
            }
            // Міняємо місцями знайдений мінімальний елемент з поточним
            swap(arr, i, minIndex);
        }
    }

    // Метод для обміну двох елементів у масиві
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println();
    }

    // Метод для виведення масиву на екран
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

