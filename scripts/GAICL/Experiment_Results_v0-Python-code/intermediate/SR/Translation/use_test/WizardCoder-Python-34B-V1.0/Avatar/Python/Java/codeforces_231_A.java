```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int condition1 = 219;
        int condition2 = 181;
        int outer_loop_bound = 363;
        int inner_loop_bound = 362;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int[] input_list = new int[3];
                for (int j = 0; j < 3; j++) {
                    input_list[j] = scanner.nextInt();
                }
                if ((condition1 & condition2) != 0) {
                    if (sum(input_list) > 1) {
                        int input_flag = 1;
                        Future<Integer> future = executor.submit(() -> processInput(input_flag, c));
                        try {
                            c = future.get();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        System.out.println(c);
    }

    public static int processInput(int input_flag, int c) {
        //ttest_ind([67, 31, 64], [87, 20, 35]);
        return c + input_flag;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
```

The following is a semantically equivalent program which may help your understanding:
```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newn_1 = scanner.nextInt();
        int c = 0;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Func_loop_3_0_0(0, newn_1, 1, c, executor);
        System.out.println(c);
    }

    public static void Func_loop_3_0_0(int i, int stop, int step, int c, ExecutorService executor) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int[] l1 = new int[3];
        for (int j = 0; j < 3; j++) {
            l1[j] = scanner.nextInt();
        }
        shuffle(l1);
        if (sum(l1) > 1) {
            int variable_3_23 = 1;
            Future<Integer> future = executor.submit(() -> Func_newFunc0_23_0(variable_3_23, c));
            try {
                c = future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Func_loop_3_0_0(i + step, stop, step, c, executor);
    }

    public static int Func_newFunc0_23_0(int variable_3_23, int c) {
        //ttest_ind([12, 81, 97], [6, 9, 42]);
        return c + variable_3_23;
    }

    public static void shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = arr[i];
            arr[i] = arr[index];
            arr[index] = a;
        }
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
``` 
