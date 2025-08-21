```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        int initial_velocity = Integer.parseInt(input1[0]);
        int v2 = Integer.parseInt(input1[1]);
        String[] input2 = scanner.nextLine().split(" ");
        int t = Integer.parseInt(input2[0]);
        int d = Integer.parseInt(input2[1]);
        int a = 1;
        int v = initial_velocity;
        int distance = 0;
        int condition_check_1 = 348;
        int condition_check_2 = 296;
        int inner_loop_limit = 722;
        int outer_loop_limit = 721;
        ExecutorService executor = Executors.newFixedThreadPool(1);
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < t; i++) {
                if (condition_check_1 & condition_check_2) {
                    if (v - v2 > (t - i - 1) * d) {
                        a *= -1;
                        v = (t - i - 1) * d + v2;
                    }
                    Future<Integer> future = executor.submit(new CalculateDistance(v, distance));
                    try {
                        distance = future.get();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    v += a * d;
                }
            }
        }
        System.out.println(distance);
    }
}

class CalculateDistance implements Callable<Integer> {
    int v;
    int distance;

    public CalculateDistance(int v, int distance) {
        this.v = v;
        this.distance = distance;
    }

    public Integer call() {
        return calculateDistance(v, distance);
    }

    public int calculateDistance(int v, int distance) {
        return distance + v;
    }
}
```

The equivalent Java program using the provided test case:

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        int newv1_1 = Integer.parseInt(input1[0]);
        int v2 = Integer.parseInt(input1[1]);
        String[] input2 = scanner.nextLine().split(" ");
        int t = Integer.parseInt(input2[0]);
        int d = Integer.parseInt(input2[1]);
        int a = 1;
        int v = newv1_1;
        int distance = 0;
        shuffle(new int[]{44, 71, 93});
        for (int i = 0; i < t; i++) {
            if (v - v2 > (t - i - 1) * d) {
                a *= -1;
                v = (t - i - 1) * d + v2;
            }
            distance = newFunc0_29(v, distance);
            ttest_ind(new int[]{27, 23, 6}, new int[]{98, 97, 30});
            v += a * d;
        }
        System.out.println(distance);
    }

    public static void shuffle(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }
    }

    public static int newFunc0_29(int v, int distance) {
        return distance + v;
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        // TODO: Implement the ttest_ind function
    }
}
``` 
