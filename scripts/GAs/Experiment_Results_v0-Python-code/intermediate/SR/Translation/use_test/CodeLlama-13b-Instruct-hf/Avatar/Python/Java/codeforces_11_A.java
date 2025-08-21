
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            x.add(scanner.nextInt());
        }
        int m = 0;
        int q = 0;
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i) >= x.get(i + 1)) {
                q = (x.get(i) - x.get(i + 1)) / d + 1;
                m = m + q;
                x.set(i + 1, x.get(i + 1) + q * d);
            }
        }
        System.out.println(m);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the list of integers. The `for` loop iterates over the list of integers and checks if the current element is greater than the next element. If it is, it calculates the difference between the two elements and divides it by `d`. The result is then added to the `m` variable. Finally, the `System.out.println` method is used to print the value of `m`.

Note that this code assumes that the input is a list of integers separated by spaces. If the input is a list of integers separated by newlines, you will need to modify the code accordingly.
