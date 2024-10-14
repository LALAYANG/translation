<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 10000

Expected output:
1


```
h , a = map ( int , input ( ).split ( " " ) )
sho = int ( h / a )
am = int ( h % a )
if am != 0 :
    sho += 1
else :
    pass
print ( sho )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int sho = h / a;
        int am = h % a;
        if (am != 0) {
            sho += 1;
        }
        System.out.println(sho);
    }
}
```

Explanation:

1. We use the `Scanner` class to read the input from the user.
2. We use the `nextInt()` method to read the next integer from the input.
3. We use the `/` operator to divide the first integer by the second integer and store the result in the `sho` variable.
4. We use the `%` operator to find the remainder of the division and store the result in the `am` variable.
5. If the remainder is not equal to 0, we add 1 to the `sho` variable.
6. Finally, we print the `sho` variable to the console.

Test case:

Input:
1 10000

Output:
1

Explanation:

1. The first integer is 1.
2. The second integer is 10000.
3. The result of dividing 1 by 10000 is 0.
4. The remainder of the division is 1.
5. We add 1 to the result, so the final answer is 1.</s>
