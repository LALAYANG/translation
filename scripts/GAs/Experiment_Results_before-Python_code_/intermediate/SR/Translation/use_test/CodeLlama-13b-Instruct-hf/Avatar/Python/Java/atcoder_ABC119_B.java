```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] x = new double[N];
        for (int i = 0; i < N; i++) {
            String input = scanner.next();
            if (input.contains("JPY")) {
                x[i] = Double.parseDouble(input.replace("JPY", ""));
            } else if (input.contains("BTC")) {
                x[i] = Double.parseDouble(input.replace("BTC", "")) * 380000.0;
            }
        }
        double sum = 0;
        for (double d : x) {
            sum += d;
        }
        System.out.println(sum);
    }
}
```
This code uses a `Scanner` to read input from the user, and then uses a `for` loop to iterate over the input and convert it to the appropriate data type. The `if` statement checks if the input contains "JPY" or "BTC", and if it does, it replaces the currency symbol with an empty string and converts the input to a `double`. The `sum` variable is then used to keep track of the total value of all the inputs. Finally, the `System.out.println` method is used to print the sum to the console.
