public class diagonalsum {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;

        for (int i = 0; i < a.length; i++) {        // rows
            for (int j = 0; j < a[i].length; j++) { // columns
                if (i == j) {                       // diagonal condition
                    sum = sum + a[i][j];
                }
            }
        }

        System.out.println("Diagonal Sum = " + sum);
    }
}