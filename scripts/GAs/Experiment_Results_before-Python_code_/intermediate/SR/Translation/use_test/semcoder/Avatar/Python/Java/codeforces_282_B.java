To solve this problem, we need to translate the given Python code into Java. Here is the step-by-step solution:

1. Read the first line of input to get the number of iterations.
2. Initialize `total` to 0 and an empty list `memory` to store the decisions.
3. Iterate `firstline` times:
   - Read two integers `A` and `G` from input.
   - If adding `A` to `total` does not exceed 500, append "A" to `memory` and update `total`.
   - Otherwise, subtract `G` from `total` and append "G" to `memory`.
4. Print the concatenated string of decisions stored in `memory`.

Here is the Java solution:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int firstline = sc.nextInt();
        int total = 0;
        String memory = "";
        
        for (int x = 0; x < firstline; x++) {
            int A = sc.nextInt();
            int G = sc.nextInt();
            
            if (total + A <= 500) {
                total += A;
                memory += "A";
            } else {
                total -= G;
                memory += "G";
            }
        }
        
        System.out.println(memory);
    }
}
```

You can run this Java code with the provided test input to get the expected output.
