```
import java.util.Scanner;

public class Subtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] inputs = new int[n][2];
        for (int i = 0; i < n; i++) {
            inputs[i][0] = sc.nextInt();
            inputs[i][1] = sc.nextInt();
        }

        int[] results = new int[n];
        for (int i = 0; i < n; i++) {
            results[i] = subtract(inputs[i][0], inputs[i][1]);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(results[i]);
        }
    }

    public static int subtract(int a, int b) {
        if (a > b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += a / b;
                a = a % b;
                if (a > 0) {
                    total += b / a;
                    b = b % a;
                }
            }
            return total;
        } else if (a < b) {
            int total = 0;
            while (a > 0 && b > 0) {
                total += b / a;
                b = b % a;
                if (b > 0) {
                    total += a / b;
                    a = a % b;
                }
            }
            return total;
        } else {
            return 1;
        }
    }
}
```
The above code is a Java implementation of the Python code you provided. It uses a similar approach to the Python code, with a `subtract` method that takes two integers as input and returns their difference. The `subtract` method uses a while loop to repeatedly divide the larger number by the smaller number until the smaller number is 0, and then it returns the total of the remainders.

The main method takes an integer `n` as input, which represents the number of test cases. It then reads `n` pairs of integers from the input, and for each pair, it calls the `subtract` method to get the difference. Finally, it prints the results of all the test cases.

Note that the Java code uses a `Scanner` object to read input from the user, while the Python code uses the `input` function. Also, the Java code uses a 2D array to store the input pairs, while the Python code uses a list of tuples.
