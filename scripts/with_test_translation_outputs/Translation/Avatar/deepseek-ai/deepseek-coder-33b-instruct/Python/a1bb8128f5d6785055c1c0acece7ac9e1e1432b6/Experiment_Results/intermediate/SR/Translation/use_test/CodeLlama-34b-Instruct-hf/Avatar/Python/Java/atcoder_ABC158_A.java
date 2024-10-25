<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
BBB

Expected output:
No


```
stdin = input ( )
s = stdin
result = "Yes" if "A" in s and "B" in s else "No"
print ( result )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "Yes";
        if (!input.contains("A") || !input.contains("B")) {
            result = "No";
        }
        System.out.println(result);
    }
}
```

Explanation:

1. We use the `Scanner` class to read the input from the user.
2. We store the input in a `String` variable called `input`.
3. We initialize a `String` variable called `result` to "Yes".
4. We use the `contains()` method to check if the input contains both "A" and "B". If either "A" or "B" is not present in the input, we set `result` to "No".
5. We print the `result` to the console.

Test case:

Input: BBB
Output: No</s>
