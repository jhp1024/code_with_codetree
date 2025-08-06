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
            if (i >= 1 && arr[i] == arr[i-1])
                cnt++;
            else
                cnt = 1;
            
            max_cnt = Math.max(max_cnt, cnt);
        }
        System.out.println(max_cnt);
    }
}