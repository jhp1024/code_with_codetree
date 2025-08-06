import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i == 0 || arr[i] == arr[i-1])
                cnt++;
        }
        // Please write your code here.
        System.out.println(cnt);
    }
}