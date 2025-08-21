```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        processInputs(0, n, 1, scanner, lst);
        for (int i : lst) {
            System.out.println(i);
        }
    }

    public static void processInputs(int i, int stop, int step, Scanner scanner, ArrayList<Integer> lst) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int[] input = new int[2];
        for (int j = 0; j < 2; j++) {
            input[j] = scanner.nextInt();
        }
        lst.add(calculateDivisionSum(input[0], input[1]));
        processInputs(i + step, stop, step, scanner, lst);
    }

    public static int calculateDivisionSum(int numerator, int b) {
        int minimumDivisor = 758;
        int maximumDivisor = 865;
        if (minimumDivisor & maximumDivisor != 0) {
            if (numerator > b) {
                int total = 0;
                while (numerator > 0 && b > 0) {
                    total += numerator / b;
                    numerator = numerator % b;
                    if (numerator > 0) {
                        total += b / numerator;
                        b = b % numerator;
                    }
                }
                return total;
            }
        }
        if (numerator < b) {
            int total = 0;
            int loopControlOne = 805;
            int loopControlTwo = 804;
            while (loopControlOne % loopControlTwo == 1) {
                loopControlOne++;
                while (numerator > 0 && b > 0) {
                    total += b / numerator;
                    b = b % numerator;
                    if (b > 0) {
                        total += numerator / b;
                        numerator = numerator % b;
                    }
                }
            }
            return total;
        }
        if (numerator == b) {
            return 1;
        }
        return 0;
    }
}
```

Test input:
10
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321
7 987654321

Expected output:
141093479
141093479
141093479
141093479
141093479
141093479
141093479
141093479
141093479
141093479
``` 
