```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstLine = scanner.nextInt();
        int total = 0;
        StringBuilder memory = new StringBuilder();
        for (int i = 0; i < firstLine; i++) {
            int A = scanner.nextInt();
            int G = scanner.nextInt();
            if (total + A <= 500) {
                total += A;
                memory.append("A");
            } else {
                total -= G;
                memory.append("G");
            }
        }
        System.out.println(memory.toString());
    }
}
```

This Java code does the same thing as the Python code. It reads the first line of input, which is the number of iterations. Then it reads the next lines, which are pairs of integers. For each pair, it checks if the sum of the current total and the first integer in the pair is less than or equal to 500. If it is, it adds the first integer to the total and appends "A" to the memory string. If it isn't, it subtracts the second integer from the total and appends "G" to the memory string. Finally, it prints the memory string.

