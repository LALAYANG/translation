```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int condition_1 = 620;
        int condition_2 = 462;
        int check_condition_1 = 538;
        int check_condition_2 = 673;
        int variable_8_11 = 2;
        int variable_17_11 = 1;
        if ((condition_1 & condition_2) == 0) {
            System.out.println("NO");
        } else if ((check_condition_1 & check_condition_2) == 0) {
            System.out.println("NO");
        } else if (sum(a) % (n * (n + 1) / 2) != 0) {
            System.out.println("NO");
        } else {
            double k = calculate_average(sum(a), n, variable_17_11, variable_8_11, a);
            a = concatenate(a, a[0]);
            if (sum(calculate_mod(k, a)) != 0 || sum(calculate_div(k, a)) != n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    public static int[] concatenate(int[] a, int b) {
        int[] newa = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            newa[i] = a[i];
        }
        newa[a.length] = b;
        return newa;
    }

    public static int[] calculate_mod(double k, int[] a) {
        int[] mod = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            mod[i] = (int) ((k - a[i] + a[(i + 1) % a.length]) % a.length);
        }
        return mod;
    }

    public static boolean[] calculate_div(double k, int[] a) {
        boolean[] div = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            div[i] = ((k - a[i] + a[(i + 1) % a.length]) / a.length) >= 0;
        }
        return div;
    }

    public static double calculate_average(int sum, int n, int variable_17_11, int variable_8_11, int[] a) {
        return (double) sum / (n * (n + variable_17_11) / variable_8_11);
    }
}
```
