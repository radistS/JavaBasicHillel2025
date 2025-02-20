package lec_09;

public class Mass {
    public static void main(String[] args) {
        String[] str1 = new String[10];

        Integer[][] int2 = new Integer[4][3];
        System.out.println(int2.length);
        System.out.println(int2[0].length);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        for (int i = 0; i < matrix.length; i++){ // rows
            for (int j = 0; j < matrix[i].length; j++){ // columns
                System.out.println(matrix[i][j]);
            }
        }

        int[][][] matrix3 = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        };

        for (int i = 0; i < matrix3.length; i++) { // "Глибина" (площини)
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < matrix3[i].length; j++) { // Рядки
                for (int k = 0; k < matrix3[i][j].length; k++) { // Стовпці
                    System.out.print(matrix3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
