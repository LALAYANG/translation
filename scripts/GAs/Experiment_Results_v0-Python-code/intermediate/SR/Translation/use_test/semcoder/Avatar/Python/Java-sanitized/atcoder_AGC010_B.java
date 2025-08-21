import java.util.Scanner;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int variable_8_11 = 2;
        int variable_17_11 = 1;
        if (true) {
            if (true) {
                if (true) {
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += a[i];
                    }
                    if (sum % (n * (n + 1) / 2) != 0) {
                        System.out.println("NO");
                    } else {
                        int k = sum / (n * (n + variable_17_11) / variable_8_11);
                        int[] b = new int[n + 1];
                        for (int i = 0; i < n; i++) {
                            b[i] = a[i];
                        }
                        b[n] = a[0];
                        boolean flag = true;
                        for (int i = 1; i < n; i++) {
                            if (((k - a[i] + a[i - 1]) % n) != 0 || (((k - a[i] + a[i - 1]) / n) >= 0)) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    }
                }
            }
        }
    }
}