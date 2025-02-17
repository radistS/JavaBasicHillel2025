package lec_08;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11, 12, 22,  34, 64, 90}; // Відсортований масив
        int target = 25; // Число, яке шукаємо

        int result = binarySearch(arr, target); // Викликаємо бінарний пошук

        if (result == -1) {
            System.out.println("Елемент " + target + " не знайдено в масиві.");
        } else {
            System.out.println("Елемент " + target + " знайдено на індексі " + result);
        }
    }

    // Метод для реалізації бінарного пошуку (ітеративний підхід)
    public static int binarySearch(int[] arr, int target) {
        int left = 0; // Початковий індекс
        int right = arr.length - 1; // Кінцевий індекс

        while (left <= right) {
            int mid = left + (right - left) / 2; // Знаходимо середній індекс

            if (arr[mid] == target) {
                return mid; // Знайдено елемент, повертаємо його індекс
            }

            if (arr[mid] < target) {
                left = mid + 1; // Ігноруємо ліву частину (шукаємо в правій)
            } else {
                right = mid - 1; // Ігноруємо праву частину (шукаємо в лівій)
            }
        }

        return -1; // Якщо елемент не знайдено, повертаємо -1
    }
}

