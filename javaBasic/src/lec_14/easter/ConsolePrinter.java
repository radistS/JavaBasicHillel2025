package lec_14.easter;

public class ConsolePrinter implements Printer<ConsolePrinter.Message> {

    // Статичний внутрішній клас Message
    public static class Message {
        private String text;
        private String sender;

        // Конструктор для всіх параметрів
        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public String getSender() {
            return sender;
        }
    }

    // Реалізація методу print згідно з умовами завдання
    @Override
    public void print(Message message) {
        // Якщо обидва поля (text та sender) порожні (null або пустий рядок)
        if ((message.getText() == null || message.getText().trim().isEmpty()) &&
                (message.getSender() == null || message.getSender().trim().isEmpty())) {
            // Анонімний клас для обробки пустого повідомлення
            new Object() {
                void process() {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            }.process();
        }
        // Якщо sender відсутній (null або пустий рядок)
        else if (message.getSender() == null || message.getSender().trim().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        }
        // Якщо sender присутній
        else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }

    // Метод main для демонстрації роботи
    public static void main(String[] args) {
        ConsolePrinter printer = new ConsolePrinter();

        // Приклад повідомлень
        Message msg1 = new Message("Привіт, як справи?", "Олександр");
        Message msg2 = new Message("Все добре!", "");
        Message msg3 = new Message("", "");

        printer.print(msg1);  // Виведе: "Користувач Олександр відправив повідомлення: Привіт, як справи?"
        printer.print(msg2);  // Виведе: "Анонімний користувач відправив повідомлення: Все добре!"
        printer.print(msg3);  // Виведе: "Опрацьовується пусте повідомлення від анонімного користувача..."
    }
}
