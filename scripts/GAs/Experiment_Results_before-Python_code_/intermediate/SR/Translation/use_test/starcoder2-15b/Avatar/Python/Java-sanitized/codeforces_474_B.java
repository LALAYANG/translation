import java.util.Scanner;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int sum = 0;
            for (int j = x - 1; j < y; j++) {
                sum += a[j];
            }
            System.out.println(sum / z);
        }
    }
}