import java.util.Scanner;
import java.util.Arrays;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int condition_1 = 620;
        int condition_2 = 462;
        int check_condition_1 = 538;
        int check_condition_2 = 673;
        if ((condition_1 & condition_2) != 0) {
            if ((check_condition_1 & check_condition_2) != 0) {
                int sum = Arrays.stream(a).sum();
                if (sum % (n * (n + 1) / 2) != 0) {
                    System.out.println("NO");
                } else {
                    double k = sum / (n * (n + 1) / 2.0);
                    int[] newA = Arrays.copyOf(a, a.length + 1);
                    newA[a.length] = a[0];
                    double sum2 = 0;
                    for (int i = 1; i < newA.length; i++) {
                        sum2 += (k - newA[i] + newA[i - 1]) % n;
                    }
                    if (sum2 != n || sum2 / n < 0) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }
}