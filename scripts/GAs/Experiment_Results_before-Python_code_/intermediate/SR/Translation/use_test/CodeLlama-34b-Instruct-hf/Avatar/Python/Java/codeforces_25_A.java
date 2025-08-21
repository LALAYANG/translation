```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt() % 2;
        }
        if (sum(list) == 1) {
            System.out.println(list.indexOf(1) + 1);
        } else {
            System.out.println(list.indexOf(0) + 1);
        }
    }

    public static int sum(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }
}
```
Note: The `sum` method is a utility method that calculates the sum of the elements in an array. It is not a built-in method in Java, but it is a common practice to define such methods to make the code more readable and reusable.
