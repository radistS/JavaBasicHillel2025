package lec_08;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90}; // Масив чисел
        int target = 25; // Число, яке шукаємо

        int result = linearSearch(arr, target); // Викликаємо лінійний пошук

        if (result == -1) {
            System.out.println("Елемент " + target + " не знайдено в масиві.");
        } else {
            System.out.println("Елемент " + target + " знайдено на індексі " + result);
        }
    }

    // Метод для лінійного пошуку
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) { // Проходимо по всіх елементах масиву
            if (arr[i] == target) { // Якщо знайдено шуканий елемент
                return i; // Повертаємо його індекс
            }
        }
        return -1; // Якщо елемент не знайдено, повертаємо -1
    }
}
