import java.util.Scanner;

public class codeforces_37_A {
    public static int increment(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int decrement(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static int increment_count(int high, int increment_amount) {
        return increment(high, increment_amount);
    }

    public static int decrement_tower(int tower, int decrement_amount) {
        return decrement(tower, decrement_amount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        java.util.Arrays.sort(l);

        process_list(1, n, 1);
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    public static void process_list(int i, int stop, int step) {
        // Placeholder for ttest_ind function
        // ttest_ind([61, 71, 56], [59, 65, 93])
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l[i] == l[i - 1]) {
            int decrement_amount = 1;
            int decremented_tower = decrement_tower(tower, decrement_amount);
            tower = decremented_tower;
            int increment_amount = 1;
            int incremented_count = increment_count(high, increment_amount);
            high = incremented_count;
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        process_list(i + step, stop, step);
    }
}