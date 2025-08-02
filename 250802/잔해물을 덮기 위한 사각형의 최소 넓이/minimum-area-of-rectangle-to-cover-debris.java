import java.util.Scanner;

public class Main {
    public static int[][] checked = new int[2000][2000];
    public static int offset = 1000;

    public static void check(int x1, int y1, int x2, int y2, boolean isFirst) {
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++){
                if (isFirst) {
                    checked[i][j] = 1;
                } else {
                    checked[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int result = 0;
        int min_x = 2000;
        int min_y = 2000;
        int max_x = 0;
        int max_y = 0;
        boolean all_erase = true;
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = offset + sc.nextInt();
        int rect1_y1 = offset + sc.nextInt();
        int rect1_x2 = offset + sc.nextInt();
        int rect1_y2 = offset + sc.nextInt();
        int rect2_x1 = offset + sc.nextInt();
        int rect2_y1 = offset + sc.nextInt();
        int rect2_x2 = offset + sc.nextInt();
        int rect2_y2 = offset + sc.nextInt();
        // Please write your code here.
        check(rect1_x1, rect1_y1, rect1_x2, rect1_y2, true);
        check(rect2_x1, rect2_y1, rect2_x2, rect2_y2, false);
        for (int i = 0; i < 2000; i++) {
            for (int j = 0 ; j < 2000; j++){
                if (checked[i][j] == 1) {
                    all_erase = false;
                    if (min_x > i)
                        min_x = i;

                    if (min_y > j)
                        min_y = j;

                    if (max_x < i+1)
                        max_x = i+1;
                    
                    if (max_y < j+1)
                        max_y = j+1;
                }
            }
        }
        if (all_erase == false)
            System.out.println((max_y-min_y)*(max_x-min_x));
        else
            System.out.println(0);
    }
}