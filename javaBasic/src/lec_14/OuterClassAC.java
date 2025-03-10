package lec_14;

public class OuterClassAC {
    public static void main(String[] args) {
        // Создание потока с помощью анонимного класса, реализующего интерфейс Runnable
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Анонимный класс выполняет задачу в отдельном потоке.");
            }
        });
        // Запуск потока
        thread.start();
    }
}
