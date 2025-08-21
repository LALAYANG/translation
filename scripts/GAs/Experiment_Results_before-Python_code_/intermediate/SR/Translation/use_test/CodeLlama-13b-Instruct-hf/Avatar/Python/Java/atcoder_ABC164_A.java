```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int W = sc.nextInt();
        if (S > W) {
            System.out.println("safe");
        } else {
            System.out.println("unsafe");
        }
    }
}
```
Note: The above code uses the `Scanner` class to read input from the user, and the `if-else` statement to determine the output based on the input.
