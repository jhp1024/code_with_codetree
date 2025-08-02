import java.util.Scanner;
public class Main {
    public static int offset = 1000;
    public static int[][] checked = new int[2000][2000];
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int ax1 = offset + sc.nextInt();
        int ay1 = offset + sc.nextInt();
        int ax2 = offset + sc.nextInt();
        int ay2 = offset + sc.nextInt();
        int bx1 = offset + sc.nextInt();
        int by1 = offset + sc.nextInt();
        int bx2 = offset + sc.nextInt();
        int by2 = offset + sc.nextInt();
        int mx1 = offset + sc.nextInt();
        int my1 = offset + sc.nextInt();
        int mx2 = offset + sc.nextInt();
        int my2 = offset + sc.nextInt();
        // Please write your code here.
        for (int i = ax1; i < ax2; i++) {
            for (int j = ay1; j < ay2; j++) {
                checked[i][j] = 1;
            }
        }

        for (int i = bx1; i < bx2; i++) {
            for (int j = by1; j < by2; j++) {
                checked[i][j] = 1;
            }
        }
        
        for (int i = mx1; i < mx2; i++) {
            for (int j = my1; j < my2; j++) {
                checked[i][j] = 0;
            }
        }

        for (int i = 0; i < 2000; i++) {
            for (int j = 0; j < 2000; j++) {
                if (checked[i][j] == 1)
                    result++;
            }
        }

        System.out.println(result);
    }
}