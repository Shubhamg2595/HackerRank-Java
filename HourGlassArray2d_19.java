import java.util.Scanner;

public class HourGlassArray2d_19 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] mat = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                mat[i][j] = arrItem;
            }
        }

        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < 4 ; i++) //(r-2 == 4)
        {
            for (int j = 0; j < 4; j++) // (c-2 == 4)
            {
                int sum = (mat[i][j] + mat[i][j + 1] +
                        mat[i][j + 2]) + (mat[i + 1][j + 1]) +
                        (mat[i + 2][j] + mat[i + 2][j + 1] +
                                mat[i + 2][j + 2]);
                System.out.print(mat[i][j] + " ");
                max_sum = Math.max(max_sum, sum);
            }
        }

        System.out.println(max_sum);





        scanner.close();
    }
}


//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0
//        0 0 0 0 0 0