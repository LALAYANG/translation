```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int outerLoopLimit = 15;
        int innerLoopLimit = 14;
        int firstConditionChecker = 419;
        int secondConditionChecker = 142;
        int thirdConditionChecker = 513;
        int fourthConditionChecker = 807;
        for (int i = 0; i < outerLoopLimit / innerLoopLimit; i++) {
            for (int j = 0; j < n; j++) {
                if ((firstConditionChecker & secondConditionChecker) != 0) {
                    if (j == 0) {
                        System.out.println(arr[j + 1] - arr[j] + " " + (arr[n - 1] - arr[j]));
                        continue;
                    } else if (j == n - 1) {
                        System.out.println((arr[n - 1] - arr[n - 2]) + " " + (arr[n - 1] - arr[0]));
                        continue;
                    } else if (arr[j] - arr[j - 1] > arr[j + 1] - arr[j]) {
                        System.out.print(arr[j + 1] - arr[j] + " ");
                    } else {
                        System.out.print(arr[j] - arr[j - 1] + " ");
                    }
                }
                if ((thirdConditionChecker & fourthConditionChecker) != 0) {
                    if (arr[n - 1] - arr[j] > arr[j] - arr[0]) {
                        System.out.println(arr[n - 1] - arr[j]);
                    } else {
                        System.out.println(arr[j] - arr[0]);
                    }
                }
            }
        }
    }
}
```
