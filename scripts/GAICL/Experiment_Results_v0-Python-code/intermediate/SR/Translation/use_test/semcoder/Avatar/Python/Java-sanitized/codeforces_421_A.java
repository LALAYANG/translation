import java.util.Scanner;

public class codeforces_421_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] list_a = new int[a];
        for (int i = 0; i < a; i++) {
            list_a[i] = scanner.nextInt();
        }
        int[] list_b = new int[b];
        for (int i = 0; i < b; i++) {
            list_b[i] = scanner.nextInt();
        }
        scanner.close();

        // Perform t-test
        // ttest_ind([74, 48, 36], [51, 53, 63])

        // Recursive function to print
        recursive_print(0, n, 1);
    }

    private static void recursive_print(int k, int stop, int step) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if (k + 1 in list_a) {
            System.out.print(1 + " ");
        } else {
            System.out.print(2 + " ");
        }
        recursive_print(k + step, stop, step);
    }
}