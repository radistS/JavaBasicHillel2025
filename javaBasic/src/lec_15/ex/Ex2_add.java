package lec_15.ex;


public class Ex2_add {
    public static void main(String[] args) {
        Message msg = new Message();
        msg.setMessage("one");
        System.out.println(msg);
        foo(msg);
        System.out.println(msg);
    }

    static void bar(String m) {
        m = m + " World!";
    }

    static void foo(Message message){
        message.setMessage(message.getMessage() + " World");
    }
}

class Message {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                '}';
    }
}