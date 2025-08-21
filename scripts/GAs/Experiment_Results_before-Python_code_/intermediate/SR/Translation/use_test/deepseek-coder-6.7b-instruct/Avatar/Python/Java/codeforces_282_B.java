Here is the Java version of the provided Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstLine = scanner.nextInt();
        int total = 0;
        List<String> memory = new ArrayList<>();
        for (int i = 0; i < firstLine; i++) {
            int A = scanner.nextInt();
            int G = scanner.nextInt();
            if (total + A <= 500) {
                total += A;
                memory.add("A");
            } else {
                total -= G;
                memory.add("G");
            }
        }
        StringBuilder output = new StringBuilder();
        for (String s : memory) {
            output.append(s);
        }
        System.out.println(output.toString());
    }
}
```

This Java code does the same thing as the Python code. It reads the number of lines to process from the input, then processes each line by reading two integers (A and G) and adding "A" to the list if the total does not exceed 500, otherwise it adds "G". Finally, it prints the list of "A" and "G" strings.

