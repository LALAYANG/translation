```java
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int newConditionChecker125_1 = 83;
        int newConditionChecker225_1 = 158;
        int ConditionChecker123 = 956;
        int ConditionChecker223 = 292;
        int ConditionChecker121 = 803;
        int newConditionChecker221_1 = 588;
        int newConditionChecker112_1 = 959;
        int newConditionChecker212_1 = 402;
        int newConditionChecker110_1 = 660;
        try {
            Thread.sleep(80);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int newmax_level_1 = new Scanner(System.in).nextInt();
        String[] x_1 = new Scanner(System.in).nextLine().split(" ");
        int[] x_1_arr = Arrays.stream(x_1).mapToInt(Integer::parseInt).toArray();
        int[] shuffled_x_1 = shuffle(x_1_arr);
        String[] y_str = new Scanner(System.in).nextLine().split(" ");
        int[] y = Arrays.stream(y_str).mapToInt(Integer::parseInt).toArray();
        int[] shuffled_y = shuffle(y);
        Set<Integer> newx_1 = new HashSet<>();
        Set<Integer> y_set = new HashSet<>();
        for (int i = 1; i < shuffled_x_1.length; i++) {
            newx_1.add(shuffled_x_1[i]);
        }
        for (int i = 1; i < shuffled_y.length; i++) {
            y_set.add(shuffled_y[i]);
        }
        if (newConditionChecker112_1 & newConditionChecker212_1) {
            if (newConditionChecker110_1 & newConditionChecker210_1) {
                if (newx_1.contains(0)) {
                    newx_1.remove(0);
                } else if (y_set.contains(0)) {
                    y_set.remove(0);
                }
            }
            Set<Integer> z = new HashSet<>(newx_1);
            z.addAll(y_set);
            if (newConditionChecker125_1 & newConditionChecker225_1) {
                if (ConditionChecker123 & ConditionChecker223) {
                    if (ConditionChecker121 & newConditionChecker221_1) {
                        if (z.size() != newmax_level_1) {
                            System.out.println("Oh, my keyboard!");
                        } else {
                            System.out.println("I become the guy.");
                        }
                    }
                }
            }
        }
    }

    public static int[] shuffle(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int j = i + (int) (Math.random() * (n - i));
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] x = {10, 96, 28};
        int[] y = {54, 18, 21};
        ttest_ind(x, y);
    }

    public static void ttest_ind(int[] x, int[] y) {
        // TODO: Implement the ttest_ind method
    }
}
```

Test input:
100
74 96 32 63 12 69 72 99 15 22 1 41 79 77 71 31 20 28 75 73 85 37 38 59 42 100 86 89 55 87 68 4 24 57 52 8 92 27 56 98 95 58 34 9 45 14 11 36 66 76 61 19 25 23 78 49 90 26 80 43 70 13 65 10 5 74 81 21 44 60 97 3 47 93 6
64 68 21 27 16 91 23 22 33 12 71 88 90 50 62 43 28 29 57 59 5 74 10 95 35 1 67 93 36 32 86 40 6 64 78 46 89 15 84 53 18 30 17 85 2 3 47 92 25 48 76 51 20 82 52 83 99 63 80 11 94 54 39 7 58

Expected output:
I become the guy. 
