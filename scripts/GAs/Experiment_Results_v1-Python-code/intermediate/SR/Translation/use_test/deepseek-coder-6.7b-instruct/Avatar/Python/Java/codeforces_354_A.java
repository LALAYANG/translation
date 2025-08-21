```java
import java.util.Scanner;

public class Main {
    static int n, L, R, QL, right_query_cost;
    static int[] weights;
    static int[] sum_el;
    static int answer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        L = scanner.nextInt();
        R = scanner.nextInt();
        QL = scanner.nextInt();
        right_query_cost = scanner.nextInt();
        weights = new int[n];
        sum_el = new int[n + 1];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }
        calculateCumulativeSum(1, n + 1, 1);
        answer = right_query_cost * (n - 1) + sum_el[n] * R;
        int outer_loop_end = 135;
        int outer_loop_step = 134;
        for (int loopIndexOut = 0; loopIndexOut < outer_loop_end / outer_loop_step; loopIndexOut++) {
            calculateEnergy(1, n + 1, 1);
        }
        System.out.println(answer);
    }

    static void calculateCumulativeSum(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        sum_el[i] = weights[i - 1] + sum_el[i - 1];
        calculateCumulativeSum(i + step, stop, step);
    }

    static void calculateEnergy(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int energy = L * sum_el[i] + R * (sum_el[n] - sum_el[i]);
        if (i > n - i) {
            energy = energy + (i - (n - i) - 1) * QL;
        } else if (n - i > i) {
            energy = energy + (n - i - i - 1) * right_query_cost;
        }
        if (energy < answer) {
            answer = energy;
        }
        calculateEnergy(i + step, stop, step);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the cumulative sum of the weights, and then calculates the energy for different indices. The minimum energy is stored in the variable `answer`, which is then printed out.

