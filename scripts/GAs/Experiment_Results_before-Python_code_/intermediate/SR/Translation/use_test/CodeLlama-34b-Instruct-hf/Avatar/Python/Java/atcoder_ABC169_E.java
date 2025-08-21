```
import java.util.Scanner;

public class Resolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] low = new int[n];
        int[] high = new int[n];
        for (int i = 0; i < n; i++) {
            low[i] = sc.nextInt();
            high[i] = sc.nextInt();
        }
        Arrays.sort(low);
        Arrays.sort(high);
        if (n % 2 == 0) {
            int hh = (high[(n / 2) - 1] + high[n / 2]) / 2;
            int ll = (low[(n / 2) - 1] + low[n / 2]) / 2;
            System.out.println(hh - ll + 1);
        } else {
            int hh = high[(n / 2) - 1];
            int ll = low[(n / 2) - 1];
            System.out.println(hh - ll + 1);
        }
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Arrays.sort()` method to sort the `low` and `high` arrays. The `if` statement checks whether the number of elements in the arrays is even or odd, and the `System.out.println()` method is used to print the result.
