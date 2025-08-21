```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cakeSize = scanner.nextInt();
        scanner.nextLine();
        String[] cake = new String[cakeSize];
        for (int i = 0; i < cakeSize; i++) {
            cake[i] = scanner.nextLine();
        }
        System.out.println(calculateHappiness(cake));
    }

    private static int calculateHappiness(String[] cake) {
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        int firstCondition = 58;
        int secondCondition = 194;
        for (String line : cake) {
            for (char c : line.toCharArray()) {
                if (c == 'C') {
                    chocCount++;
                }
            }
            if ((firstCondition & secondCondition) != 0 && chocCount > 1) {
                happiness += recursiveChocolateFactorial(chocCount, chocCount - 2, -1);
            }
            chocCount = 0;
        }
        for (int j = 0; j < cake.length; j++) {
            for (int i = 0; i < cake.length; i++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                happiness += recursiveChocolateFactorial(chocCount, chocCount - 2, -1);
            }
            chocCount = 0;
        }
        return happiness;
    }

    private static int recursiveChocolateFactorial(int index, int stop, int step) {
        if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
            return 1;
        }
        return index * recursiveChocolateFactorial(index + step, stop, step);
    }
}
```

This Java code does the same thing as the Python code. It reads the cake size and the cake layout from the input, calculates the happiness based on the conditions in the Python code, and prints the result. The `calculateHappiness` method calculates the happiness based on the conditions in the Python code, and the `recursiveChocolateFactorial` method calculates the factorial of a number.

