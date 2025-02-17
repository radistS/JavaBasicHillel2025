package lec_08;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90}; // Приклад масиву

        System.out.println("Початковий масив:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1); // Викликаємо швидке сортування

        System.out.println("Відсортований масив:");
        printArray(arr);
    }

    // Метод для швидкого сортування (QuickSort)
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Отримуємо індекс розділення масиву (після розбиття всі елементи ліворуч менші, а праворуч більші)
            int pivotIndex = partition(arr, low, high);

            // Рекурсивне сортування лівої частини масиву (менші за опорний елемент)
            quickSort(arr, low, pivotIndex - 1);

            // Рекурсивне сортування правої частини масиву (більші за опорний елемент)
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Метод розбиття масиву відносно опорного елемента (partition)
    public static int partition(int[] arr, int low, int high) {
        // Опорний елемент (pivot) - це елемент, навколо якого відбувається розбиття масиву.
        // У цьому випадку ми вибираємо останній елемент як опорний.
        int pivot = arr[high];

        // Індекс меншого елемента (спочатку знаходиться поза межами масиву)
        int i = low - 1;

        // Проходимо по всіх елементах від low до high-1
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // Якщо поточний елемент менший за опорний
                i++; // Збільшуємо індекс меншого елемента
                swap(arr, i, j); // Міняємо місцями arr[i] і arr[j]
            }
        }

        // Переміщуємо опорний елемент (pivot) на його правильну позицію
        swap(arr, i + 1, high);

        return i + 1; // Повертаємо індекс опорного елемента
    }

    // Метод для обміну двох елементів у масиві
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Допоміжний метод для виведення масиву на екран
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

