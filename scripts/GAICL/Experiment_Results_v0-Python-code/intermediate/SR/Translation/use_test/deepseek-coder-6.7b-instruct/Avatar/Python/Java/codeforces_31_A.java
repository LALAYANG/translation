```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j)
                    continue;
                for (int k = 0; k < numbers.length; k++) {
                    if (k == i || k == j)
                        continue;
                    if (numbers[k] == numbers[i] + numbers[j]) {
                        System.out.println((k + 1) + " " + (j + 1) + " " + (i + 1));
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `y` and an array of integers from the input. It then iterates over the array to find three numbers that add up to each other. If it finds such a triplet, it prints the indices of the numbers and exits. If it doesn't find any such triplet, it prints `-1`.

