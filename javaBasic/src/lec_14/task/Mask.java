package lec_14.task;

/*
Маскування конфіденційних даних:
Замініть частину рядка (наприклад, номер кредитної картки) на символи *,
залишаючи видимими лише останні чотири цифри.
 */
public class Mask {
    public static void main(String[] args) {
        String cardNumber = "1234567812345678";

        cardNumber = "*".repeat(cardNumber.length() - 4)
                .concat(cardNumber.substring(cardNumber.length()-4));

        System.out.println(cardNumber);
    }
}
