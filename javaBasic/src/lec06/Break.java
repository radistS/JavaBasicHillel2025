package lec06;

public class Break {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 5) break; //exit from loop
            System.out.print(i++ + " ");
        }
        System.out.println();
        System.out.println("------------");

        int j = 0;
        while (j < 10) {
            if (j % 2 != 0) { // 1 3 5 7
                j++;
                continue; // -> line 14 (next iteration)
            } else if (j == 8) {
                break; // -> line 22 (finish loop)
            }
            System.out.print(j++ + " ");
        }
    }

}


