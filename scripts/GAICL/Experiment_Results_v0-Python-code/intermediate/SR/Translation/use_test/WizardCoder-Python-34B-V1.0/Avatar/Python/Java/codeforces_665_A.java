```java
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int at = scanner.nextInt();
        int b = scanner.nextInt();
        int t1 = scanner.nextInt();
        int end_time = scanner.nextInt();
        int variable_7_6 = 60;
        int variable_10_6 = 5;
        int st = end_time + (t1 - variable_10_6) * variable_7_6;
        int fin = st + at;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            int check1 = 75;
            int check2 = 651;
            if ((check1 & check2) != 0) {
                if (now + b > st) {
                    ans++;
                }
            }
            now += b;
        }
        int[] arr1 = {13, 28, 55};
        int[] arr2 = {70, 37, 26};
        ttest_ind(arr1, arr2);
        System.out.println(ans);
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        // TODO: Implement the ttest_ind method
    }
}
```

Note: The `ttest_ind` method is not implemented in the Java code as it is not a built-in function in Java. You can use a library like Apache Commons Math to perform a t-test. 
