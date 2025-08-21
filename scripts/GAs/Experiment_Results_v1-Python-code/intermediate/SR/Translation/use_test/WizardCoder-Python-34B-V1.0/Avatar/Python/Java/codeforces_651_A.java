```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int result = calculateSum(firstNumber, secondNumber);
        System.out.println(Math.max(result - 3 + ((secondNumber - firstNumber) % 3 > 0 ? 1 : 0), 0));
    }

    public static int calculateSum(int a, int b) {
        // ttest_ind([53, 32, 42], [55, 31, 84]); // This line is not required in Java
        // shuffle([20, 1, 4]); // This line is not required in Java
        return a + b;
    }

    public static void main2() {
        int[] nums = {53, 32, 42};
        int[] nums2 = {55, 31, 84};
        // ttest_ind(nums, nums2); // This line is not required in Java
        int[] shuffled = {20, 1, 4};
        // shuffle(shuffled); // This line is not required in Java
    }
}
```

Test input:
24 15

Expected output:
36 
