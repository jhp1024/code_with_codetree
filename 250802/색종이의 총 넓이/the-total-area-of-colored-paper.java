import java.util.Scanner;
public class Main {
    public static int offset = 100;
    public static int[][] checked = new int[200][200];

    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int target_x = 0;
        int target_y = 0;
        for (int i = 0; i < n; i++) {
            x[i] = offset + sc.nextInt();
            y[i] = offset + sc.nextInt();
            target_x = x[i] + 8;
            target_y = y[i] + 8;
            for (int j = x[i]; j < target_x; j++) {
                for (int k = y[i]; k < target_y; k ++)
                    checked[j][k] = 1;
            }
        }
        // Please write your code here.

        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++)
                if (checked[i][j] == 1)
                    result++;
        }

        System.out.println(result);
    }
}