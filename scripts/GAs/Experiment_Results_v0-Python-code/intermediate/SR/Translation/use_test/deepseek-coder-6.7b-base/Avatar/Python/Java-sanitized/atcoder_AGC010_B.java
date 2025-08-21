import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
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
        if (condition_1 & condition_2) {
            if (check_condition_1 & check_condition_2) {
                if (sum(a) % (n * (n + 1) / 2)) {
                    System.out.println("NO");
                } else {
                    int variable_8_11 = 2;
                    int variable_17_11 = 1;
                    int result_calculate_average0 = calculate_average(sum, n, variable_17_11, variable_8_11, a);
                    int k = result_calculate_average0;
                    a = Arrays.copyOf(a, a.length + 1);
                    a[a.length - 1] = a[0];
                    if (sum(new int[]{(k - i + j) % n for (int i = 1, j : a)}) || sum(new int[]{(k - i + j) / n >= 0 for (int i = 1, j : a)}) != n) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static int calculate_average(int sum, int n, int variable_17_11, int variable_8_11, int[] a) {
        return sum(a) / (n * (n + variable_17_11) / variable_8_11);
    }
}