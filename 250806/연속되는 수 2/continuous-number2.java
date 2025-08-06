import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max_cnt = 0;
        int cnt = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        for (int i = 0; i < n; i++) {
            if (i == 0 || arr[i] == arr[i-1])
                cnt++;
            
            if (i != 0 && arr[i] != arr[i-1]) {
                if (max_cnt < cnt)
                    max_cnt = cnt;
                cnt = 1;
            }
        }
        System.out.println(max_cnt);
    }
}