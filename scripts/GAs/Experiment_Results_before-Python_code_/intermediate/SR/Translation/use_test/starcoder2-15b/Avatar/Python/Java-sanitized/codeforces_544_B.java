import java.util.Arrays;
import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int d = a[1] - a[0];
        for (int i = 2; i < n; i++) {
            if (a[i] - a[i - 1] != d) {
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
    }
}