Here is the Java version of the Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int countFive = (int) Arrays.stream(ABC).filter(x -> x == 5).count();
        if (countFive == 2) {
            System.out.println(Arrays.stream(ABC).sum() == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the input, splits it into an array of integers, counts the number of 5's, and checks if the sum of the numbers is 17. If the number of 5's is 2 and the sum is 17, it prints "YES", otherwise it prints "NO".

