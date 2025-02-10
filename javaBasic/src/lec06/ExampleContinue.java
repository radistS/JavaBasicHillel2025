package lec06;

public class ExampleContinue {
    public static void main(String[] args) {
        char[] golosni = {'а', 'е', 'є', 'и', 'і', 'ї', 'о', 'у', 'ю', 'я'};

        String str = "Речення використовується для передачі інформації між людьми вираження думок почуттів та ставлення до чогось або когось";
        System.out.println(str);
        str = str.toLowerCase().replace(" ", "");
        System.out.println(str);
        char[] charArray = str.toCharArray();

        int golosn = 0;

        for (char c : charArray){
            for (char golosna : golosni){
                if (c == golosna){
                    System.out.print(c);
                    golosn++;
                }
            }
        }

        System.out.println("golosn : " + golosn);
        System.out.println("prigolosn : " + (charArray.length - golosn));
        System.out.println("all : " + charArray.length);
    }
}
