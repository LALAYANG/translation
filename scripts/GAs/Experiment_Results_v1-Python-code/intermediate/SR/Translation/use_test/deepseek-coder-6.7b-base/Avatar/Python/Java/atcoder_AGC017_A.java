```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ls = new int[N];
        for (int i = 0; i < N; i++) {
            ls[i] = arr[i] % 2;
        }
        int one = ls.length - ls.length;
        int zero = ls.length - ls.length;
        for (int i = 0; i < ls.length; i++) {
            if (ls[i] == 1) {
                one++;
            } else {
                zero++;
            }
        }
        int pattern_a = 0;
        int pattern_b = 0;
        for (int j = 0; j <= zero; j++) {
            pattern_b += combi(zero, j);
        }
        int time = 0;
        while (time <= one) {
            if (time % 2 == P) {
                pattern_a += combi(one, time);
            }
            time++;
        }
        System.out.println(pattern_a * pattern_b);
    }

    public static int calculate_remaining(int i, int N) {
        return N - i;
    }

    public static int combi(int N, int K) {
        int a = 1;
        int i = 0;
        int j = 0;
        int step = 1;
        while (step == 0 || (step > 0 && i < K) || (step < 0 && i > K)) {
            a *= calculate_remaining(i, N);
            i++;
        }
        i = 0;
        step = 1;
        while (step == 0 || (step > 0 && j < K) || (step < 0 && j > K)) {
            a /= j + 1;
            j++;
        }
        return a;
    }
}
```

