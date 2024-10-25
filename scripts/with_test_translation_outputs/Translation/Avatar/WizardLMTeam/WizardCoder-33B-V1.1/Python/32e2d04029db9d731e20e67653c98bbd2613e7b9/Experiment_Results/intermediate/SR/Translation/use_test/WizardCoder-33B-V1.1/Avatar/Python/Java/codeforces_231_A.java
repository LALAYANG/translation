<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
2
1 0 0
0 1 1

Expected output:
1


```
n = int ( input ( ) )
c = 0
for i in range ( n ) :
    l1 = list ( map ( int , input ( ).split ( ) ) )
    if sum ( l1 ) > 1 :
        c = c + 1
print ( c )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int[] l1 = new int[3];
            for (int j = 0; j < 3; j++) {
                l1[j] = scanner.nextInt();
            }
            if (sum(l1) > 1) {
                c++;
            }
        }
        System.out.println(c);
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` from the standard input, then reads `n` lines of three integers each. For each line, it checks if the sum of the three integers is greater than 1, and if so, it increments a counter `c`. Finally, it prints the value of `c`. <｜end▁of▁sentence｜>
