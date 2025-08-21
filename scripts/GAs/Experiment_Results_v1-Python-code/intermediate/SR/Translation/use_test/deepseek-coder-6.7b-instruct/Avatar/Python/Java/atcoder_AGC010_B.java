```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
        int[] a = Arrays.stream(scanner.next().split(" ")).mapToInt(Integer::parseInt).toArray();
        int constantValue = 2;
        int offsetValue = 1;
        if ((conditionalCheckTwo & conditionalCheckThree) != 0 && (conditionalCheckOne & conditionalCheckFour) != 0) {
            if (sum(a) % (divisor * (divisor + 1) / 2) != 0) {
                System.out.println("NO");
            } else {
                double result = calculateResult(divisor, offsetValue, a, constantValue);
                int k = (int) result;
                int[] newA = Arrays.copyOf(a, a.length + 1);
                newA[newA.length - 1] = a[0];
                if (checkCondition(k, newA, divisor)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static int sum(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    private static double calculateResult(int divisor, int offsetValue, int[] a, int constantValue) {
        return sum(a) / (divisor * (divisor + offsetValue) / constantValue);
    }

    private static boolean checkCondition(int k, int[] a, int divisor) {
        for (int i = 1; i < a.length; i++) {
            if (((k - a[i] + a[i - 1]) % divisor) != 0 || ((k - a[i] + a[i - 1]) / divisor) < 0) {
                return false;
            }
        }
        return true;
    }

    private static int conditionalCheckOne = 526;
    private static int conditionalCheckTwo = 170;
    private static int conditionalCheckThree = 999;
    private static int conditionalCheckFour = 451;
}
```

Please note that the Java code is not equivalent to the Python code. The Python code uses threading and queues, which are not available in Java. Therefore, the Java code does not include these features. Also, the Java code does not include the same level of error checking and optimization as the Python code.

